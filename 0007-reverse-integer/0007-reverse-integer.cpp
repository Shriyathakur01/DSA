class Solution {
public:
    int reverse(int x) {
        int revnum=0;
        // bool isnegative=x<0;
        while(x!=0){
            if (revnum > INT_MAX / 10 || revnum < INT_MIN / 10) //checking for stack overflow.
            return 0;
            int ldigit=x%10;
            revnum=(revnum*10)+ldigit;
            x=x/10;
        }
        // return isnegative ? -revnum : revnum;
        return revnum;
        
    }
};