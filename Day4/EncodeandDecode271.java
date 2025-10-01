package Day4;
import java.util.*;

public class EncodeandDecode271 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split("\\s+");
        List<String> strs = Arrays.asList(input);

        //encode
        String encoded= encode(strs);
        System.out.println("Encoded: "+encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: "+decoded);
    }

    //encode the list into string
    public static String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("/").append(s);
        }
        return sb.toString();
    }

    // decode the String into list
    public static List<String> decode(String str){
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int sep = str.indexOf("/",i);
            int len = Integer.parseInt(str.substring(i,sep));
            i = sep+1;
            res.add(str.substring(i,i+len));
            i += len;
        }
        return res;
    }

}
