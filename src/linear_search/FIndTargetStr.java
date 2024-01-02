package linear_search;

import java.util.Arrays;

public class FIndTargetStr {
    public static void main(String[] args) {
        String str = "Bhavani";
        System.out.println(Arrays.toString(str.toCharArray())); //converting to char array and printing it

        int ans = search(str,'a');
        System.out.println(ans);
        System.out.println(search2(str,'f'));
    }

    static int search(String str, char target){
        for (int c=0;c<str.length();c++){
            if (str.charAt(c)==target){
                return c;
            }
        }
        return -1;
    }

    static boolean search2(String str, char target){
        for (char c:str.toCharArray()){ //needs to be converted to char array to iterate over the char elements
            if (c==target){
                return true;
            }
        }
        return false;
    }
}
