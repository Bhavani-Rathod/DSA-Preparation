package binary_search;

public class RotatedBS {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findPivot(nums)); //prints pivot element of the rotated array
        System.out.println(searchTarget(nums,2));

    }

    static int searchTarget(int[] nums, int target){
        int pivot = findPivot(nums);

        //if we did not found pivot we get -1, that means array is not rotated
        if (pivot==-1){
            //apply normal BS
            return binarySearch(nums,target,0, nums.length-1);
        }

        //if we found pivot, then
        if (nums[pivot]==target){
            return pivot;
        }

        if (target>=nums[0]){
            //it exists in, from start till pivot
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            //test case1 if mid-element is at pivot point, the point where asc order ends and next one starts
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }

            //test case2 if mid-element is at pivot point, the point where asc order ends and next one starts
            if (mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            //test case3 checking if start is smaller than mid
            if(nums[start]<nums[mid]){
                start=mid+1;
            }else {
                //test case4 checking if start is bigger than mid
                end = mid-1;
            }
        }
        return -1;
    }
}
