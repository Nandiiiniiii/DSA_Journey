class Solution {
    public boolean isPalindrome(int n) {
         int tmp=n;
         int rev=0;
         while(n>0)
         {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
         }
         if(tmp==rev)
         return true;
         else
         return false;
    }
}
