class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        int p=-1;
        int q=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if((s.charAt(i)-'0')%2==1)
            {
               p=i;
               break;
            }
        }
        if(p==-1)
        return "";
        for(int i=0;i<=p;i++)
        {
            if(s.charAt(i)!='0'){
            q=i;
            break;}
        }
        return s.substring(q,p+1);
    }
}
