class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max1=0;
        int max2=0;
        int hn=Integer.MAX_VALUE;
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:map.keySet())
        {
            int f=map.get(x);
            if(f>max1 )
            {
                max2=max1;
                max1=f;
                
            }
            else if(f>max2 && f<max1)
            {
                max2=f;
            }
        }
        if(max2==0)
        return -1;
        for(int x :map.keySet())
        {
            if(map.get(x)==max2  &&   x < hn)
            hn=x;
        }
        return hn;
    }
}

