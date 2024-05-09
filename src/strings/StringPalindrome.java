package strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abba";
        char[] arr = str.toCharArray();
        System.out.println(palindrome(arr));
        System.out.println(palindrome2(str));

    }

    static boolean palindrome(char[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            if(arr[start]==arr[end]){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    //another method
    static boolean palindrome2(String string){
        String str = string.toLowerCase();

        if (str==null || str.length()==0){ //null and length zero are different things
            return true; //or false according to need of  our question
        }

        for (int i=0; i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i); //works like end--

            if (start!=end){
                return false;
            }
        }
        return true;
    }
}
