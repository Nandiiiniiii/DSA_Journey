class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int flag=0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                flag=1;
                break;
            }
        }
       }
       if(flag==0)
       return true;
       else
       return false;
    }
}
