package linear_search;

//Leetcode 1672 problem
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {10 ,2,3},
            {4,3,2}
        };

        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr){

        int max=0;

        for (int row=0;row<arr.length;row++){

            int sum=0;
            for (int col=0;col<arr[row].length;col++){
                sum+=arr[row][col];
            }

            if (sum>max){
                max=sum;
            }
        }
        return max;

    }
}
