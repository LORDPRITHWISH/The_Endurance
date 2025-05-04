import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Pizza", 10);
        menu.put("Burger", 5);
        menu.put("Pasta", 8);
        menu.put("Salad", 4);
        menu.put("Soda", 2);
        menu.put("Water", 1);
        menu.put("Coffee", 3);

        System.out.println("Menu:"+menu);

        menu.remove("Coffee");
        menu.remove("Water");
        System.out.println("Menu:"+menu);
        System.out.println("Price of Pizza: "+menu.get("Pizza"));
        System.out.println("Price of Burger: "+menu.get("Burger"));

        System.out.println("Menu contains Pizza: "+menu.containsKey("Pizza"));
        System.out.println("Menu contains item of price 4 : "+menu.containsValue(4));

        for(String item: menu.keySet()){
            System.out.println("> "+item + " Price: "+menu.get(item));
        }

    }
}
