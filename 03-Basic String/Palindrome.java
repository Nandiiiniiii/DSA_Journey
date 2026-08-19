class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        if(s.length()<=1)
        return true;
        int left=0;
        int right=s.length()-1;
        while(left<=right)
        {
            if (s.charAt(left) != s.charAt(right))
            return false;
            left++;
            right --;
        }
        return true;
        
    }
}
