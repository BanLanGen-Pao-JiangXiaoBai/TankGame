package exceptions_;

public class String_ {

    public static void main(String[] args) {
        String name = new String("cat");
        Cat a = new Cat(name);
        Cat b = new Cat("cat");

        System.out.println(a.name == b.name);
    }
}

class Cat {
    String name;
    public Cat(String name) {
        this.name = name;
    }
}
