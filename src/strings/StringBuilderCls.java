package strings;

public class StringBuilderCls {
    public static void main(String[] args){
//        float f = 12.342232f;
//
//        System.out.printf("%.2f",f); //%f, %s called placeholders
//
//        System.out.printf("I am %s", "Bhavani");

//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//        System.out.println("a"+'b');
//        System.out.println(1+"b");
//        System.out.println("a"+new ArrayList<>());
//        System.out.println((char)('a'+5));

        StringBuilder builder = new StringBuilder();

        for(int i=0;i<26; i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        System.out.println(builder.reverse());

        System.out.println(builder.deleteCharAt(0));

    }
}
