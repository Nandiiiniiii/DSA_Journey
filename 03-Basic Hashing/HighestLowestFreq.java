class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int n=nums.length-1;
      int max=0;
      int min=Integer.MAX_VALUE;
     
      for(int x: nums)
      {
        map.put(x,map.getOrDefault(x,0)+1);
      }
      for(int x:map.keySet())
      {
        int f=map.get(x);
        if(f>max )
        {
            max=f;
        }
        if(f<min )
        {
            min=f;
           
        }
      }
      return (max + min);
    }
}
