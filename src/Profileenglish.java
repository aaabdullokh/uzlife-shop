package src;

import java.util.Scanner;

public class Profileenglish {

    static Scanner put = new Scanner(System.in);

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
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null && tel.equals(Main.phones[i])) {
                if (Main.passwords[i] == password) {
                    Main.onlineuser = Main.phones[i];
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
        System.out.print("enter your name : ");
        String name = strings.nextLine();
        System.out.print("enter your family name : ");
        String fname = strings.nextLine();
        System.out.print("enter your phone number : ");
        String tel = strings.nextLine();
        System.out.print("enter your new password : ");
        int password = ints.nextInt();
        System.out.print("enter your card number : ");
        String card = strings.nextLine();
        int cvv = 0;
        if (card.startsWith("4") || card.startsWith("1") || card.startsWith("5")) {
            System.out.print("enter your card cvv code : ");
            cvv = ints.nextInt();
        }
        System.out.print("enter your postcode : ");
        int postcode = ints.nextInt();
        System.out.print("enter your street name : ");
        String street = strings.nextLine();
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null && Main.phones[i].equals(tel) || Main.intercards[i].equals(card)){
                System.out.println("error-404");
                signup();
            }
        }
        for (int i = 0; i < 1000; i++) {
            Main.names[i] = name;
            Main.fnames[i] = fname;
            if (tel.startsWith("+998")){
                Main.phones[i] = tel;
                Main.clientsamount++;
                Main.uzbekclients++;
                break;
            }
            if (tel.startsWith("+888")){
                Main.phones[i] = tel;
                Main.clientsamount++;
                Main.pirateclients++;
                break;
            }
            else {
                Main.phones[i] = tel;
                Main.clientsamount++;
                Main.internationalclients++;
            }
            Main.passwords[i] = password;
            if (card.startsWith("4") || card.startsWith("5") || card.startsWith("1")){
                Main.intercards[i] = card;
                Main.cvvs[i] = cvv;
                break;
            }
            if (card.startsWith("8600") || card.startsWith("9860") || card.startsWith("5614")){
                Main.uzbcards[i] = card;
            }
            Main.postcodes[i] = postcode;
            Main.streets[i] = street;
            Main.onlineuser = tel;
        }
        System.out.println("successful");
        main2();
    }

    public static void main2() {
        System.out.println();
        System.out.println("main menu");
    }

    public static void start() {
        Main.names[0] = "user";
        Main.fnames[0] = "";
        Main.phones[0] = "+8888080";
        Main.passwords[0] = 1111;
        Main.intercards[0] = "4278310022281406";
        Main.cvvs[0] = 739;
        Main.postcodes[0] = 100058;
        Main.streets[0] = "Mehrigiyo st.";
    }

}