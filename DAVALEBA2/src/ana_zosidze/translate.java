package ana_zosidze;
import java.util.*;
public class translate {
    public static void main(String[] args) {

        Map<String,String> dictionary=new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        dictionary.put("South", "სამხრეთი");
        dictionary.put("North", "ჩრდილოეთი");
        dictionary.put("West", "დასავლეთი");
        dictionary.put("East", "აღმოსავლეთი");




            System.out.println("სიტყვა:");
            System.out.println(dictionary.get(scanner.next()));

    }
}

