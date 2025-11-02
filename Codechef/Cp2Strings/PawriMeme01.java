import java.util.Scanner;

class PawriMeme01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            String str = s.next();
            System.out.println(str.replaceAll("party", "pawri"));
        }

    }
}