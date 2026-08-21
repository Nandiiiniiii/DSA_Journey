class Solution {  
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        char []m1=s.toCharArray();
        char []m2=t.toCharArray();
        Arrays.sort(m1);
        Arrays.sort(m2);
        return Arrays.equals(m1,m2);
    }
}
