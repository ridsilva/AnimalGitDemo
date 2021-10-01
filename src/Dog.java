public class Dog implements Animal {
    private static final String WOOF = "Woof!";
    private static final String NOP ="NOPE";
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return Dog.WOOF;
    }

    @Override
    public String no() {
        return Dog.NOP;
    }
}
