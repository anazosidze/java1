package ana_zosidze;
import java.util.*;
public class chatbot {

    public static void main(String[] args) {
        Map<String,String> chatbot=new HashMap<>();
        chatbot.put("მითხარიეროვნულივალუტისკურსი", "რომელი ვალუტა? (დოლარი , ევრო)");
        chatbot.put("მაჩვენეფილიალები", "სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ");
        chatbot.put("დოლარი" , "$=2.95 ლარი ");
        chatbot.put("ევრო" , "€=7.25 ლარი ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("გამარჯობა");

        while (50>25)
        {
            System.out.println(chatbot.get(scanner.next()));
        }
    }
}


