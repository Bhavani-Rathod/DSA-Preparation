package pattern_problems;

public class Pattern {
    public static void main(String[] args) {
        pattern(4);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            for (int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalColsInRow = row>n ? 2*n-row : row;
            for (int col=0; col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row=0; row<2*n; row++){
            int totalColsInRow = row>n ? 2*n-row : row;

            int totalSpacesInRow = n-totalColsInRow;

            for (int space=0; space<totalSpacesInRow;space++){
                System.out.print(" ");
            }

            for (int col=0; col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row=1;row<=n;row++){ //for rows
            for (int space =0; space<n-row; space++){ //for spaces
                System.out.print("  ");
            }

            for (int col=row; col>=1; col--){ //for first half of the col
                System.out.print(col+" ");
            }

            for (int col=2; col<=row;col++){ //for second half of the col
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}
