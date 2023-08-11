package extend_;

enum Color {
    Yellow,Green,Red;
}

public class Son extends Father{
    static public String getInfo() {
        System.out.println("1".equals(2));
        return  "1";
    }
    private String name = "123";
    public void hi(int[] arr) {};
    public void hi(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.hi(new int[]{1, 2});
        Son.getInfo();
        son.getInfo();
        Color c = Color.Green;
        switch (c) {
            case Red:
                break;
            case Green:
                System.out.println(c);
                break;
            case Yellow:

            default:
                System.out.println();
        }
    }
    //    public String getInfo() {
//        return  this.name;
//    }
}


class Father {
    public String name = "father";

    public static int age = 1234;
    public void hi() {
        System.out.println("father hi");
    }
}