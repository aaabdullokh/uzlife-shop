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
        System.out.print("online user : ");
        System.out.println(Profileenglish.onlineuser);
    }

}