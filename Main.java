import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Password dawidPassword = new Password();
        String w = dawidPassword.randomPassword(16);
        System.out.println(w);
        dawidPassword.checkPassword(w);


    }


}
