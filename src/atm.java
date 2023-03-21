import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class atm {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int select;
        int tutar = 0;
        int amount = 5000 ;

       System.out.println("*** Hi welcome to bgBank ***");

        final String  parola = "ab17j4da34f156o" ;
        String password;

        System.out.println("Enter password!");
        password = input.next();

        if (parola.equals(password)) {

            System.out.println("Correct!");
            System.out.println("###########");
        } else
            System.out.println("İncorrect!");

        if (parola.equals(password)) {
            System.out.println("What is the action you want to do? ?");
            System.out.println("*** Process ***");
            System.out.println("1-> Deposit..");
            System.out.println("2-> Withdraw Money..");
            System.out.println("3-> Balance Questioning..");
            System.out.println("4-> Account Number Questioning..");

            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Current Balance: " + amount);
                    System.out.println("Want to deposit ?");
                    tutar = input.nextInt();
                    System.out.println("Preparing..");
                    System.out.println("Current : " + (amount+tutar));

                    System.out.println("You can Continue By Returning To The Main Menu...");

                case 2:
                    int guncelBakiye = amount+tutar;
                    System.out.println("Current  " + guncelBakiye);
                    System.out.println("The amount you want to withdraw ?");
                    tutar = input.nextInt();
                    System.out.println("Current: " + (guncelBakiye-tutar));

                    System.out.println(" You can continue by returning to the main menu...");

                case 3:
                    System.out.println("Balance: " + amount);

                case 4:



               }


        }  else {
            System.out.println("İnsufficient !");
        }
        }
       }






















