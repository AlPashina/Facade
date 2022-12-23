import java.util.ArrayList;
import java.util.List;

public class MainFrame {
    public static void main(String[] args){
        Facade facade = new Facade();
        System.out.println(facade.cookBeverage("Tea machine", "Green").getDescription());
        System.out.println(facade.cookBeverage("Cezve", "Сappuccino").getDescription());
        System.out.println(facade.cookBeverage("Samovar", "Black").getDescription());
    }
}
