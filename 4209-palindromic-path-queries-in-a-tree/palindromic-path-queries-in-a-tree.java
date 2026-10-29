import java.util.*;

class Solution {
    List<Integer>[] adj;
    int[][] up;
    int[] tin,tout,depth,fenwick,parent,order;
    char[] chars;
    int timer,LOG,n;

    void add(int i,int val){
        while(i<=n){
            fenwick[i]^=val;
            i+=i&-i;
        }
    }

    void rangeUpdate(int l,int r,int val){
        add(l,val);
        if(r<n)add(r+1,val);
    }

    int getMask(int i){
        int mask=0;
        while(i>0){
            mask^=fenwick[i];
            i-=i&-i;
        }
        return mask;
    }

    void dfs(){
        int[] stack=new int[n];
        boolean[] visited=new boolean[n];
        int top=0;
        stack[top++]=0;

        while(top>0){
            int u=stack[--top];
            if(visited[u])continue;
            visited[u]=true;

            tin[u]=++timer;
            order[timer-1]=u;
            up[0][u]=parent[u];

            for(int j=1;j<LOG;j++){
                up[j][u]=up[j-1][up[j-1][u]];
            }

            for(int v:adj[u]){
                if(!visited[v]){
                    parent[v]=u;
                    depth[v]=depth[u]+1;
                    stack[top++]=v;
                }
            }
        }

        int[] size=new int[n];
        Arrays.fill(size,1);

        for(int i=n-1;i>=0;i--){
            int u=order[i];
            if(u!=0)size[parent[u]]+=size[u];
        }

        for(int u=0;u<n;u++){
            tout[u]=tin[u]+size[u]-1;
        }
    }

    int lca(int u,int v){
        if(depth[u]<depth[v]){
            int temp=u;
            u=v;
            v=temp;
        }

        int diff=depth[u]-depth[v];

        for(int j=0;j<LOG;j++){
            if((diff&(1<<j))!=0)u=up[j][u];
        }

        if(u==v)return u;

        for(int j=LOG-1;j>=0;j--){
            if(up[j][u]!=up[j][v]){
                u=up[j][u];
                v=up[j][v];
            }
        }

        return up[0][u];
    }

    public List<Boolean> palindromePath(int n,int[][] edges,String s,String[] queries){
        this.n=n;
        chars=s.toCharArray();
        LOG=1;

        while((1<<LOG)<=n)LOG++;

        adj=new ArrayList[n];
        for(int i=0;i<n;i++)adj[i]=new ArrayList<>();

        for(int[] e:edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        up=new int[LOG][n];
        tin=new int[n];
        tout=new int[n];
        depth=new int[n];
        parent=new int[n];
        order=new int[n];
        fenwick=new int[n+1];

        timer=0;
        dfs();

        for(int u=0;u<n;u++){
            rangeUpdate(tin[u],tout[u],1<<(chars[u]-'a'));
        }

        List<Boolean> ans=new ArrayList<>();

        for(String query:queries){
            String[] p=query.split(" ");

            if(p[0].equals("update")){
                int u=Integer.parseInt(p[1]);
                char c=p[2].charAt(0);

                if(chars[u]!=c){
                    int change=(1<<(chars[u]-'a'))^(1<<(c-'a'));
                    rangeUpdate(tin[u],tout[u],change);
                    chars[u]=c;
                }
            }else{
                int u=Integer.parseInt(p[1]);
                int v=Integer.parseInt(p[2]);
                int ancestor=lca(u,v);

                int mask=getMask(tin[u])^getMask(tin[v])^(1<<(chars[ancestor]-'a'));

                ans.add(Integer.bitCount(mask)<=1);
            }
        }

        return ans;
    }
}