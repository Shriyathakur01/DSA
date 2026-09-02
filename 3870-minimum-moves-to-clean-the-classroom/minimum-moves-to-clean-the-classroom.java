import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int sr = 0, sc = 0;
        int litterCount = 0;

        // Find starting position and count litter
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                }

                if (ch == 'L') {
                    litterCount++;
                }
            }
        }

        if (litterCount == 0) {
            return 0;
        }

        // Give each litter an ID
        int[][] id = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(id[i], -1);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (classroom[i].charAt(j) == 'L') {
                    id[i][j] = count++;
                }
            }
        }

        int fullMask = (1 << litterCount) - 1;

        // r, c, mask, energy, moves
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{sr, sc, 0, energy, 0});

        boolean[][][][] visited =
            new boolean[m][n][1 << litterCount][energy + 1];

        visited[sr][sc][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];
            int mask = curr[2];
            int currEnergy = curr[3];
            int moves = curr[4];

            // All litter collected
            if (mask == fullMask) {
                return moves;
            }

            for (int d = 0; d < 4; d++) {

                int nr = r + dr[d];
                int nc = c + dc[d];

                // Outside grid
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // Obstacle
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                // No energy
                if (currEnergy == 0) {
                    continue;
                }

                int newEnergy = currEnergy - 1;
                int newMask = mask;

                // Collect litter
                if (classroom[nr].charAt(nc) == 'L') {
                    newMask = mask | (1 << id[nr][nc]);
                }

                // Reset energy
                if (classroom[nr].charAt(nc) == 'R') {
                    newEnergy = energy;
                }

                if (!visited[nr][nc][newMask][newEnergy]) {

                    visited[nr][nc][newMask][newEnergy] = true;

                    queue.offer(new int[]{
                        nr,
                        nc,
                        newMask,
                        newEnergy,
                        moves + 1
                    });
                }
            }
        }

        return -1;
    }
}