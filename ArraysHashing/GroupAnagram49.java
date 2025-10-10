package Day3;
import java.util.*;

public class GroupAnagram49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] word = s.nextLine().trim().split(" ");

        List<List<String>> result = groupAnagram(word);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        //1.reading each String in list
        for(String s : strs){
            //2.convert each string into char
            char[] c = s.toCharArray();
            //3.Sort the character
            Arrays.sort(c);
            //4.convert back to String
            String key = String.valueOf(c);
            //5.check if map not contains the key-> put int new list
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            //6.get the key and add each string based on key
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
/*
Take each word → convert to sorted chars.

Use that sorted form as a key in a HashMap.

Put the word in the corresponding list of strings.

Collect all values from the map.

Return the grouped list.
 */