package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSyntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(2);
//        list.add(3);
//
//        System.out.println(list);
//
//        list.set(1,5);
//        System.out.println(list);
//
//        System.out.println(list.contains(5));
//
//        list.set(0,4);
//        System.out.println(list);
//
//        System.out.println(list.get(1));

        Scanner in = new Scanner(System.in);
        for (int i=0;i<3;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
