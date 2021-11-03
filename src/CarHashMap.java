import java.util.*;
import java.util.HashMap;

public class CarHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What model of car are you searching for? ");
        String model = input.nextLine();
        input.close();
    
    HashMap<String, String> cars = new HashMap<>();
        
    cars.put ( "Jetta", "Volkswagen");
    cars.put ("Accord" , "Honda");
    cars.put ("Wrangler" , "Jeep");
    cars.put ("G-Wagon" , "Mercedes-Benz");

        if (cars.containsKey(model)){
            System.out.println("Oh, you're looking for a " + model + "? Our " + cars.get(model) + " section is right over here ... ");
        } else {
            System.out.println("Sorry, we don't have what you're looking for!");
        }
        
    }

}
