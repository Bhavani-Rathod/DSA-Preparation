package binary_search;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;

        System.out.println(Arrays.toString(firstLast(arr,target)));

    }

    static int[] firstLast(int[] nums, int target){

        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true); //anss gets updated here at 0th position
        ans[1] = search(nums,target,false); //anss gets updated here at 1st position

        return ans;

    }

    static int search(int[] nums, int target, boolean findStartIndex){

        int ans =-1;

        int start = 0;
        int end = nums.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }else {
                ans=mid;
                if (findStartIndex){ //applying binary search again here
                    end=mid-1; //searches for the target on left sides of mid till 0th position
                }else {
                    start=mid+1; //searches for the target on right sides of mid till last position
                }
            }
        }
        return ans;
    }
}
