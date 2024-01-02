package linear_search;

//Leetcode 1295 problem
public class EvenDigitsInNum {
    public static void main(String[] args) {

       // System.out.println(countDigits(-12));
       // System.out.println(countDigits(0));
       // System.out.println(countDigs(1234));

        int[] arr = {23,4,5,2345,14,9,-10};
        int count=0;

        for (int i=0;i<arr.length;i++){
            if (even(arr[i])){
                count++;
            }
        }

        System.out.println(count);

    }

   /* static int countDigs(int num){
        return (int)(Math.log10(num)) + 1; //simple formula for counting number of digits of a number
    } */

    static int countDigits(int num){

        if (num<0){ //for -ve numbers
            num=num*-1; //returns +ve number
        }

        if (num==0){
            return 1;  //because 0 is also a single digit & it should return count=1
        }

        int count = 0;

        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }

    static boolean even(int num){
        if (countDigits(num) %2==0){
            return true;
        }
        return false;
    }
}
