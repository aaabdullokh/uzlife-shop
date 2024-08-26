package src;

import java.util.Scanner;

public class Profile {

    static Scanner put = new Scanner(System.in);

    public static void main() {
        data();
        System.out.println();
        System.out.println("profile");
        enter();
    }

    public static void enter() {
        System.out.println();
        System.out.println("1. log in");
        System.out.println("2. sign up");
        System.out.println("3. back");
        System.out.println("0. log out");
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
            case 0: {
                logout();
                break;
            }
            default: {
                System.out.println("error-404");
                main();
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
        String password = scanner.nextLine();
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null && tel.equals(Main.phones[i])) {
                if (Main.passwords[i].equals(password)) {
                    Main.onlineuser = tel;
                    System.out.println("successful");
                    main2();
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
        if (Main.onlineuser != null) {
            System.out.println();
            System.out.println("do you want to exit from this profile ?");
            System.out.println("1.yes");
            System.out.println("2. no");
            System.out.print("enter : ");
            int enter = put.nextInt();
            switch (enter){
                case 1: {
                    Main.onlineuser = null;
                    System.out.println("you logged out successfully");
                    break;
                }
                case 2: {
                    main();
                    break;
                }
                default : {
                    System.out.println("error-404");

                }
            }
        }
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
        String password = strings.nextLine();
        System.out.print("enter your card number : ");
        String card = strings.nextLine();
        String cvv = "";
        if (card.startsWith("4") || card.startsWith("1") || card.startsWith("55")) {
            System.out.print("enter your card cvv code : ");
            cvv = strings.nextLine();
        }
        System.out.print("enter your postcode : ");
        int postcode = ints.nextInt();
        System.out.print("enter your street name : ");
        String street = strings.nextLine();
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null && Main.phones[i].equals(tel) || Main.intercards[i] != null && Main.intercards[i].equals(card) || Main.uzbcards[i] != null && Main.uzbcards[i].equals(card)) {
                System.out.println("error-404");
                signup();
            }
        }
        for (int i = 1; i < 1000; i++) {
            Main.names[i] = name;
            Main.fnames[i] = fname;
            if (tel.startsWith("+998")) {
                Main.phones[i] = tel;
                Main.clientsamount++;
                Main.uzbekclients++;
                break;
            }
            if (tel.startsWith("+888")) {
                Main.phones[i] = tel;
                Main.clientsamount++;
                Main.pirateclients++;
                break;
            } else {
                Main.phones[i] = tel;
                Main.clientsamount++;
                Main.internationalclients++;
            }
            Main.passwords[i] = password;
            if (card.startsWith("4") || card.startsWith("5") || card.startsWith("1")) {
                Main.intercards[i] = card;
                Main.cvvs[i] = cvv;
                for (int j = 1; j < 1000; j++) {
                    Main.interbalances[j] = 100000.0;
                }
                break;
            }
            if (card.startsWith("8600") || card.startsWith("9860") || card.startsWith("5614")) {
                Main.uzbcards[i] = card;
                for (int j = 1; j < 1000; j++) {
                    Main.uzbbalances[j] = 100000.0;
                }
            }
            Main.postcodes[i] = postcode;
            Main.streets[i] = street;
        }
        Main.onlineuser = tel;
        System.out.println("successful");
        main2();
    }

    public static void logout() {
        Main.start();
        /*for (int i = 0; i < 1000; i++) {
            Main.onlineuser = Main.phones[i];
            Main.names[i] = null;
            Main.fnames[i] = null;
            Main.phones[i] = null;
            Main.passwords[i] = 0;
            Main.intercards[i] = null;
            Main.cvvs[i] = null;
            Main.uzbcards[i] = null;
            Main.postcodes[i] = 0;
            Main.streets[i] = null;
            Main.interbalances[i] = 0.0;
            Main.uzbbalances[i] = 0.0;
            Main.clientsamount--;
            if (Main.phones[i].startsWith("+998")){
                Main.uzbekclients--;
                break;
            }
            if (Main.phones[i].startsWith("+888")){
                Main.pirateclients--;
            }
            else {
                Main.internationalclients--;
            }
        }*/
        Main.start();
    }

    public static void main2() {
        System.out.println();
        System.out.println("main menu");
        Main.start();
    }

    public static void data() {
        Main.names[0] = "user";
        Main.fnames[0] = "family";
        Main.phones[0] = "+8888080";
        Main.pirateclients++;
        Main.passwords[0] = "1111";
        Main.intercards[0] = "4278310022281406";
        Main.cvvs[0] = "739";
        Main.uzbcards[0] = "8600490523819969";
        Main.postcodes[0] = 100058;
        Main.streets[0] = "Mehrigiyo";
        Main.interbalances[0] = 1000000.0;
        Main.uzbbalances[0] = 1000000.0;
    }

}