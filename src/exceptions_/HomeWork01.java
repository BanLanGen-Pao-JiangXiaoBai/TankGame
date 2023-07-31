package exceptions_;

import java.util.Arrays;

public class HomeWork01 {
    public String name;
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        Arrays.sort(arr);
        String a = new String("hello");
        String b = a;
        System.out.println(a == b);
        String c = "hello1";
        a = a + "1";
        System.out.println(a == b);
        System.out.println(c == a);
        System.out.println(c.hashCode());
        System.out.println(a.hashCode());
//        System.out.println(chu(1,2));
        if (args[4].equals("john")) {
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];
        String i = (String) o;
    }

    public static double chu(int a, int b) {
        System.out.println(a / b);
        return  a / b;
    }
}


