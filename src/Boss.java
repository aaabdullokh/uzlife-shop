package src;

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
        System.out.println("number of cards : " + Main.cardsamount);
        System.out.println();
        System.out.println("users : ");
        System.out.println();
        for (int i = 0; i < Main.names.length; i++) {
            if (Main.names[i] != null) {
                System.out.println();
                System.out.print("user name : ");
                System.out.println(Main.names[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user family name : ");
                System.out.println(Main.fnames[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user e-mail : ");
                System.out.println(Main.emails[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user phone : ");
                System.out.println(Main.phones[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user password : ");
                System.out.println(Main.passwords[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user card : ");
                System.out.println(Main.cards[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user cvv code : ");
                System.out.println(Main.cvvs[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user balance : ");
                System.out.println(Main.balances[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user postcode : ");
                System.out.println(Main.postcodes[i]);
            }
            if (Main.names[i] != null) {
                System.out.print("user street : ");
                System.out.println(Main.streets[i]);
            }
        }
        menu2();
    }

    public static void menu2() {
        System.out.println();
        System.out.println("menu : ");
        System.out.println("1. ");
        System.out.println();
        System.out.println("0. back");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                System.out.println();
                break;
            }
            case 0: {
                Main.main2();
            }
            default: {
                System.out.println("error-404");
                menu2();
            }
        }
    }

}