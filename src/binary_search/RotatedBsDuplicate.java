package binary_search;

public class RotatedBsDuplicate {

    public static void main(String[] args) {
        int[] nums = {2,5,2,2,2,2}; //contains duplicates
        int[] arr = {4,5,6,7,1,2}; //without duplicates
        System.out.println(findPivotInDuplicate(nums)); //prints pivot element of the rotated array
        System.out.println(searchTarget(arr,5));

    }

    static int searchTarget(int[] nums, int target){
        int pivot = findPivotInDuplicate(nums);

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

    static int findPivotInDuplicate(int[] nums){
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

            //check if mid,start and end elements are duplicates, then we need to ignore these duplicates
            if(nums[start]==nums[mid] && nums[end]==nums[mid]) {
                //skip these duplicates
                //before that check if the start and end are pivot
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++; //skips start and increments it if start is not pivot above

                if (nums[end] > nums[end - 1]) {
                    return end;
                }
                end--;
            }////skips end and decrements it if end is not pivot above

                //left side is sorted, so we need to check in right side
                else if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                    start = mid+1;
            }else {
                    end=mid-1;
            }
        }
        return -1;
    }

}
