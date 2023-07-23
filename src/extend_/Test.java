package extend_;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getInfo());
        int a = 0;
        System.out.println(a);
        son.hi();
        son.hi("name");
        System.out.println(son.age);
        System.out.println(Father.age);
    }
}
