public class Samovar implements DrinkMachine{
    @Override
    public Product cook(String name) {
        return new Tea(name);
    }
}
