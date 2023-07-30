import java.util.HashMap;
import java.util.Map;
public class inbuildhash {
    public static void main(String[] args){
        Map<Integer,String> datamap = new HashMap<>();
        String name = "sahil";
        int hashCode = name.hashCode();
        System.out.println(hashCode);
        // Key => hashCode
        datamap.put(hashCode, name);
        String outputName = datamap.get(hashCode);   
        System.out.println("Name: " + outputName);
    }
    }
