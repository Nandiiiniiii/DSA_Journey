class Solution {
    public boolean isArmstrong(int n) {
         int c=0;
         int tmp=n;
         int t=n;
         int res=0;
         while(n>0)
         {
            n=n/10;
            c++;
         }
         while(tmp>0)
         {
            int d=tmp%10;
            res+=Math.pow(d,c);
            tmp=tmp/10;
         }
         if(t==res)
         return true;
         else
         return false;
    }
}
