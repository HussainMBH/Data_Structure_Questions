import java.util.*;

public class HasMapJava {
    public static void main(String [] args){
        //{"Car": RangeRover, "Model":SV, "Year":2023}
        Map<String, Integer> Car = new HashMap<>();
        System.out.println("Map Add Function.");

        // Add Key, Value
        Car.put("Range Rover", 2023);
        Car.put("BMW", 2020);
        Car.put("Audi", 2021);

        for(String key : Car.keySet()){
            System.out.println(key + "->" + Car.get(key));
        }
        System.out.println();
        System.out.println("Map Remove Function.");

        Car.remove("BMW");
        for(String key : Car.keySet()){
            System.out.println(key + "->" + Car.get(key));
        }
        System.out.println();
        System.out.println("Map Editing Function");
        Car.put("Audi", Car.get("Audi") + 10);
        for(String key : Car.keySet()){
            System.out.println(key + "->" + Car.get(key));
        }
        System.out.println();

        //Check this car model is available or not
        System.out.println("Check this car model is available or not");
        System.out.println(Car.containsKey("Toyota"));
        System.out.println(Car.containsKey("Audi"));

        System.out.println();


    }
}
