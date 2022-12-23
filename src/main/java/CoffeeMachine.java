public class CoffeeMachine implements DrinkMachine{
    @Override
    public Product cook(String name) {
        return new Coffee(name);
    }
}
