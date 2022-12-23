public class Cezve implements DrinkMachine{
    @Override
    public Product cook(String name) {
        return new Coffee(name);
    }
}
