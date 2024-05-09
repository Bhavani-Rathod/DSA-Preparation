package strings;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {
        String name = " Bhavani sr";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('h'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip()); //works like trim function
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toLowerCase());
        System.out.println(name.replace('a','d'));
    }
}
