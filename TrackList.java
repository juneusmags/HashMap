import java.util.HashMap;
import java.util.Set;
public class TrackList{
    public static void main(String[] args){
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Drake", "Solid");
        userMap.put("Kehlani", "F&MU");
        userMap.put("Pop Smoke", "Yea Yea");
        userMap.put("Jack Harlow", "What's Poppin");
        
        String name = userMap.get("Kehlani");
        System.out.println("The Song Name is " + name);


        
        Set<String> keys = userMap.keySet();
        for(String key : keys) {    
            System.out.println(key + ": ");
            System.out.println(userMap.get(key)); 
        } 
    }
}