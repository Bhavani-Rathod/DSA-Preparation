package general;

public class FibonacciFormula {
    public static void main(String[] args){
        for (int i=0;i<=7;i++){
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n){

        return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
