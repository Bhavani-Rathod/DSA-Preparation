package linear_search;

public class FindMin {
    public static void main(String[] args) {

        int[] arr = {23,5,22,-1,7,1,0};

        System.out.println(findMin(arr));

    }

    static int findMin(int[] arr){
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
