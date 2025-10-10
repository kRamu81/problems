package String;

public class IndexOfFirstOccurrence28 {
    public static void main(String[] args) {
        String a = "sadbutsad";
        String b = "sad";
        System.out.println(strstr(a,b)); // call corrected method
    }

    public static int strstr(String a, String b){
        int n = a.length();
        int m = b.length();

        for(int i = 0; i <= n - m; i++){
            if(a.charAt(i) == b.charAt(0)){
                if(a.substring(i, i + m).equals(b)){
                    return i;
                }
            }
        }

        return -1;
    }
}
