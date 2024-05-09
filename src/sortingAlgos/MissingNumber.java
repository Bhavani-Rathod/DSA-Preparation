package sortingAlgos;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {0,4,2,1};
        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correctIndex]){ //arr[i]<arr.length we are using bcz if our element gets equal to the length, we simply skip it,bcz we don't have index for that & it's index out of bound
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        //checking every element if they are at their right indexes
        for (int index=0; index<arr.length; index++){
            if (arr[index]!=index){
                return index;
            }
        }

        //case 2
        return arr.length; //in cases where last or nth element is not given, [0,2,1] and n=3, here after sorting we get all the elements in place, so the one missing here will be arr.length and i.e 3 here
    }

    static void swap(int[] arr, int index, int correctIndex){
        int temp = arr[index];
        arr[index] = arr[correctIndex];
        arr[correctIndex] =temp;
    }
}
