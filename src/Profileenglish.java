package src;

import java.util.Scanner;

public class Profileenglish {


    static Scanner put = new Scanner(System.in);
    static String[] phones = new String[1000];
    static int[] passwords = new int[1000];
    static String[] cards = new String[1000];
    static int[] cvvs = new int[1000];
    static int[] postcodes = new int[1000];
    static String[] streets = new String[1000];
    static String onlineuser = "";

    public static void main() {
        start();
        System.out.println();
        System.out.println("profile");
        enter();
    }

    public static void enter() {
        System.out.println();
        System.out.println("1. log in");
        System.out.println("2. sign up");
        System.out.println("3. back");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                login();
                break;
            }
            case 2: {
                signup();
                break;
            }
            case 3: {
                English.menu();
                break;
            }
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("log in");
        System.out.print("enter your phone number : ");
        String tel = scanner.nextLine();
        System.out.print("enter your password : ");
        int password = scanner.nextInt();
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && tel.equals(phones[i])) {
                if (passwords[i] == password) {
                    onlineuser = phones[i];
                    System.out.println("successful");
                    if (tel.startsWith("+998")) {
                        Main.uzbekclients++;
                        Main.clientsamount++;
                        main2();
                        break;
                    }
                    if (tel.startsWith("+888")){
                        Main.pirateclients++;
                        Main.clientsamount++;
                        main2();
                        break;
                    }
                    else {
                        Main.internationalclients++;
                        Main.clientsamount++;
                        main2();
                        break;
                    }
                } else {
                    System.out.println("error-404");
                    main();
                    break;
                }
            } else {
                System.out.println("error-404");
                main();
                break;
            }
        }
    }

    public static void signup() {
        Scanner strings = new Scanner(System.in);
        Scanner ints = new Scanner(System.in);
        System.out.println();
        System.out.println("sign up");
        System.out.print("enter your phone number : ");
        String tel = strings.nextLine();
        if (tel.startsWith("+998")){
            Main.clientsamount++;
            Main.uzbekclients++;
        }
        else {
            Main.clientsamount++;
            Main.internationalclients++;
        }
        System.out.print("enter your new password : ");
        int password = ints.nextInt();
        System.out.print("enter your card number : ");
        String card = strings.nextLine();
        if (card.startsWith("4") || card.startsWith("1") || card.startsWith("5")) {
            Main.internationalcardsamount++;
            System.out.print("enter your card cvv code : ");
            int cvv = ints.nextInt();
        }
        if (card.startsWith("8600") || card.startsWith("9860")){
            Main.uzbcardsamount++;
        }
        System.out.print("enter your postcode : ");
        int postcode = ints.nextInt();
        System.out.print("enter your street name : ");
        String street = strings.nextLine();
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].equals(tel) && cards[i].equals(card)){
                System.out.println("error-404");
                signup();
            }
        }
        System.out.println("successful");
        Boss.main();
    }

    public static void main2() {
        System.out.println();
        System.out.println("main menu");
    }

    public static void start() {
        phones[0] = "+8888080";
        passwords[0] = 1111;
        cards[0] = "4278310022281406";
        cvvs[0] = 739;
        postcodes[0] = 100058;
        streets[0] = "Mehrigiyo st.";
    }

}