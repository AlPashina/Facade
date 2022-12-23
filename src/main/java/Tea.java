import java.util.ArrayList;
import java.util.List;

public class Tea implements Product{
    private  String desccription;
    private List<String> ingredients;

    public Tea(String desccription) {
        this.desccription = desccription;
        this.ingredients = new ArrayList<>();
        ingredients.add("Tea brewing");
    }

    @Override
    public String getDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tea  '").append(desccription).append("' [");
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
