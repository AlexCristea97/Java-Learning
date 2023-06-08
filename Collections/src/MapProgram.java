import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object oriented, platform independant language");
            System.out.println("Java added successfully");

        }

        languages.put("Python", "an interpreted, object oriented high level programming language with dynamic semantic");
        System.out.println(languages.put("Algol", "an algorithmic language"));
        languages.put("BASIC", "beginners all purposes symbolic instruction code");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "this course is about JAVA"));

        }

        System.out.println("============================================");

        languages.remove("BASIC");
        if(languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("algol removed");
        } else {
            System.out.println("algol not removed, key/value pair not found");
        }
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
