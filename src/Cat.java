public class Cat implements Animal {
    private static final String MEOW = "Meow!";
    private static final String NA ="NOPE";
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return Cat.MEOW;
    }

    @Override
    public String no() {
        return Cat.NA;
    }
}
