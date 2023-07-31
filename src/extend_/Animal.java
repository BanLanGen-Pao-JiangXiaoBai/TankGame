package extend_;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(String food);
}

