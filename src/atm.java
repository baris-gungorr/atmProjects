import javax.swing.*;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {


        Scanner input  = new Scanner(System.in);

        String  parola = "ab17j4" ;
        String password;

        System.out.println("Enter password!");
        password = input.next();

        if (parola.equals(password)) {

            System.out.println("Correct!");
            System.out.println("###########");
        } else

            System.out.println("İncorrect!");

        if (parola.equals(password)) {
            System.out.println("*** Hi welcome to bgBank ***");
        }
       }
      }





















