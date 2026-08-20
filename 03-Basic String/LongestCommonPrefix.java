class Solution {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        int p=-1;
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        if(str.length==0)
        return "";
        for(int i=0;i<Math.min(first.length(),last.length());i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                p=i;
                break;
            }
        }
        if(p==-1)
        return first;
        if(str.length==0)
        return "";
        return first.substring(0,p);
    }
}
