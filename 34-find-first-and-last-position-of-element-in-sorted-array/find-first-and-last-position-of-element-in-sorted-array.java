class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int left=Find(nums,target,true);
        int right=Find(nums,target,false);
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
    public static int Find(int arr[],int target,boolean boo)
    {
        int l=0;
        int r=arr.length-1;
        int res=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]<target)
            {
                l=mid+1;
            }
            else if(arr[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                res=mid;
                if(boo)
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return res;
    }
}