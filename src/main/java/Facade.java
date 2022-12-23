public class Facade {
    public Product cookBeverage(String type, String productName) {
        DrinkMachine dmachine=ChooseEquipment(type);
       Product product =dmachine.cook(productName);

        if (product instanceof Coffee) {
            product.addIngredient("Milk");
        }

        if (product instanceof Tea) {
            product.addIngredient("Sugar");
        }
        return product;
    }

    static DrinkMachine ChooseEquipment (String type){
        return switch (type) {
            case "Cezve" -> new Cezve();
            case "Coffee machine" -> new CoffeeMachine();
            case "Samovar" -> new Samovar();
            case "Tea machine" -> new TeaMachine();
            default -> throw new RuntimeException(type);//("You don`t have such equipment");
        };
    }
}