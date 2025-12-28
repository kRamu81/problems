package main.oops.StaticVariable;

class Library{
    String username;
    String password;

    static int maxBookAllowed = 5;

    public Library(String username,String password){
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputpassword){
        return this.password.equals(inputpassword);
    }

    public static void updateMaxBooksAllowed(int newLimit){
        maxBookAllowed = newLimit;
    }

    public void display(){
        System.out.println("user:"+username);
        System.out.println("Maximum book allowed: "+maxBookAllowed);
    }

}
public class LibraryUser {
    public static void main(String[] args) {
        Library.updateMaxBooksAllowed(7);
        Library user = new Library("alice","pass123");

        if(user.authenticate("pass123")){
            user.display();
        }else{
            System.out.println("Autentication failed");
        }
    }
}
