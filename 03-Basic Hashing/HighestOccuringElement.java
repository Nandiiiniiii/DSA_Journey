class Solution {
    public int mostFrequentElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int max=0;
       int hn=0;
       for(int x:nums)
       {
        map.put(x,map.getOrDefault(x,0)+1);
       }
       for(int x: map.keySet())
       {
        int f=map.get(x);
        if(f>max || (f==max && x<hn))
        {
            max=f;
            hn=x;
        }
       }
       return hn;
    }
}


