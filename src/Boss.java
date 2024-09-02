package src;

import java.util.Scanner;

public class Boss {

    static Scanner put = new Scanner(System.in);

    public static void main() throws InterruptedException {
        start();
    }

    public static void start() throws InterruptedException {
        System.out.println();
        System.out.println("welcome , boss !");
        market();
        users();
        cards();
        menu();
    }

    public static void market(){
        System.out.println();
        System.out.println("market state : ");
        System.out.println();
        System.out.println("market rotation : ");
        System.out.println("market balance : ");
        System.out.println("net profit : ");
        System.out.println("clients amount : ");
        System.out.println("amount of goods sold : ");
        System.out.println("amount of goods remaining : ");
    }

    public static void users(){
        System.out.println();
        System.out.println("users data : ");
        System.out.println();
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null){
                System.out.println();
                System.out.println("user name : " + Main.names[i]);
                System.out.println("user family name : " + Main.fnames[i]);
                System.out.println("user e-mail : " + Main.emails[i]);
                System.out.println("user phone : " + Main.phones[i]);
                System.out.println("user password : " + Main.passwords[i]);
                System.out.println("user postcode : " + Main.postcodes[i]);
                System.out.println("user street name : " + Main.streets[i]);
            }
            if (Main.phones[0] == null){
                System.out.println("emty hub");
            }
        }
    }

    public static void cards(){
        System.out.println();
        System.out.println("cards information : ");
        System.out.println();
        for (int i = 0; i < Main.cards.length; i++) {
            if (Main.cards[i] != null){
                System.out.println("user name : " + Main.names[i]);
                System.out.println("user phone : " + Main.phones[i]);
                System.out.println("card number : " + Main.cards[i]);
                if (Main.cards[i].startsWith("4") || Main.cards[i].startsWith("1") || Main.cards[i].startsWith("55")){
                    System.out.println("cardholder : " + Main.cardholders[i]);
                    System.out.println("cvv code : " + Main.cvvs[i]);
                }
                System.out.println("card balance : " + Main.balances[i]);
            }
            if (Main.cards[0] == null){
                System.out.println("empty hub");
            }
        }
    }

    public static void menu() throws InterruptedException {
        System.out.println();
        System.out.println("menu");
        menu2();
    }

    public static void menu2() throws InterruptedException {
        System.out.println();
        System.out.println("1. ");
        System.out.println("0. log out");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                Main.error();
                break;
            }
            case 0: {
                System.out.println();
                System.out.println("bye !");
                Main.start();
            }
            default: {
                System.out.println("error-404");
                menu2();
            }
        }
    }

}