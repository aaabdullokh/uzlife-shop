package src;

import java.util.Scanner;
import java.util.Scanner;

public class Boss {

    static Scanner put = new Scanner(System.in);
    static double balance = 1000000.0;

    public static void main() {
        start();
    }

    public static void start() {
        System.out.println();
        System.out.println("welcome boss !");
        menu();
    }

    public static void menu() {
        System.out.println();
        System.out.println("your balance : " + balance + " USD");
        System.out.println();
        System.out.println("number of bank users : " + Main.clientsamount);
        System.out.println("number of uzbek users : " + Main.uzbekclients);
        System.out.println("number of international users : " + Main.internationalclients);
        System.out.println("number of pirate users : " + Main.pirateclients);
        System.out.println("number of international cards : " + Main.internationalcardsamount);
        System.out.println("number of uzbek cards : " + Main.uzbcardsamount);
        System.out.println();
        System.out.println("users : ");
        for (int i = 0; i < Main.names.length; i++) {
            if (Main.names[i] != null){
                System.out.print("user name : ");
                System.out.println(Main.names[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user family name : ");
                System.out.println(Main.fnames[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user phone : ");
                System.out.println(Main.phones[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user password : ");
                System.out.println(Main.passwords[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user international card : ");
                System.out.println(Main.intercards[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user uzbek card : ");
                System.out.println(Main.uzbcards[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user international balance : ");
                System.out.println(Main.interbalances[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user uzbek balance : ");
                System.out.println(Main.uzbbalances[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user cvv : ");
                System.out.println(Main.cvvs[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user postcode : ");
                System.out.println(Main.postcodes[i]);
            }
            if (Main.names[i] != null){
                System.out.print("user street : ");
                System.out.println(Main.streets[i]);
            }
         }
    }

}