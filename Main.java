import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Password newPassword = new Password();//create new password
        String w = newPassword.randomPassword(16);//the password will contain 16 characters 
        System.out.println(w);//print password
        newPassword.checkPassword(w);//check if password contains at least 1 capital letter, 1 number and 1 special letter


    }


}
