package linear_search;

public class FIndTarget {
    public static void main(String[] args) {

        int[] arr = {5,23,6,42,8,2};
        int ans = find(arr,8);
        System.out.println(ans);

        System.out.println(findElement(arr,23));

    }

    //returns index of target element
    static int find(int[] arr, int target){

        if (arr.length==0){
            return -1;
        }

        for (int i=0;i< arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //returns true if target element exists
    static boolean findElement(int[] arr, int target){

        for (int i:arr){
            if (i==target){
                return true;
            }
        }
        return false;
    }
}
