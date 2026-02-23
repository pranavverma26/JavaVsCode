import java.util.HashMap;
public class HashMapBasic3 {
    public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    // In hashMap there can be two or more keys with same values 
    // But keys are unique.
    map.put("Pranav",186);
    map.put("Ritwik",188);
    map.put("Ashish",196);
    map.put("Naman",166);
    map.put("Pranav",8);// Updating the key.
   // map.put("Pranav",8);
    System.out.println(map);
    System.out.println(map.containsKey("Pranav"));
    System.out.println(map.containsValue(166));
    System.out.println("Map size = "+map.size());
    map.remove("Pranav");
    System.out.println(map);
    System.out.println(map.get("Naman"));
    map.put("Naman",166); // Notihng will happen.
    System.out.println(map);
        
    }
   
    
}
