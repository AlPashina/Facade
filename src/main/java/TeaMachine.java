public class TeaMachine implements DrinkMachine{
    @Override
    public Product cook(String name) {
        return new Tea(name);
    }
}
