package general;

import java.util.Scanner;

public class LowUpCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);

        if (c>='a' && c<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
