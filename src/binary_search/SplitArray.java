package binary_search;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;

        System.out.println(splitArray(nums,m));

    }

    static int splitArray(int[] nums, int m){
        int start = 0; //initially declaring them
        int end = 0;

        for (int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]); //our 1st range, updates start with max value in the array, which is our 1st case when m=1
            end += nums[i]; //our second range, sum of all elements
        }

        //apply BS now
        while (start<end){ //doesn't work for <=
            int mid = start+(end-start)/2;

            int sum = 0;
            int pieces = 1;

            //for adding sum of elements in sub arrays
            for (int num:nums){
                if (sum+num>mid){ //exceeding our max sum value
                    //then we cannot add the elements in sub array, because exceeding the range
                    //then make new sub-array, add sum & elements there
                    sum = num;
                    pieces++;
                }else {
                    sum+=num; /*if sum+num<mid, we keep adding elements to first sub array till it is within range,
                              if exceeds then above if condition executes*/
                }
            }

            if (pieces>m){
                start = mid+1; //we'll get our mid on right side, which is more, so now max gets bigger, & we can reduce our no of pieces(sub-arrays)
            }else {
                end = mid; //we'll get our mid on left side, which is less, so now max gets smaller, & we can increase our no of pieces(sub-arrays)
            }

        }
        return end; //both start & end will be equal at this point
    }
}
