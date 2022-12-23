import java.util.ArrayList;
import java.util.List;

public class Coffee implements Product{
    private  String desccription;
    private  List<String> ingredients;

    public Coffee(String desccription) {
        this.desccription = desccription;
        this.ingredients = new ArrayList<>();
        ingredients.add("Coffee beans");
    }
    @Override
    public String getDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append("Coffee '").append(desccription).append("' [");
        for (String i : ingredients) {
            builder.append(i).append('.');
        }
        builder.append(']');

        return builder.toString();

    }

    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
}
