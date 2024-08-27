package src;

import java.awt.event.ItemListener;
import java.util.Scanner;

public class Profile {

    static Scanner put = new Scanner(System.in);

    public static void main() {
        System.out.println();
        System.out.println("profile");
        enter();
    }

    public static void enter() {
        System.out.println();
        if (!(Main.onlineuser.equals(""))) {
            main2();
        }
        if (Main.onlineuser.equals("")) {
            System.out.println("1. log in");
            System.out.println("2. sign up");
            System.out.println("0. back");
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
                case 0: {
                    English.menu();
                    break;
                }
                default: {
                    System.out.println("error-404");
                    main();
                }
            }
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("log in");
        System.out.print("enter your phone number: ");
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
        if (!(Main.onlineuser.equals(""))) {
            System.out.println();
            System.out.println("do you want to exit from this profile ?");
            System.out.println("1. yes");
            System.out.println("2. no");
            System.out.print("enter : ");
            int enter = put.nextInt();
            switch (enter) {
                case 1: {
                    Main.onlineuser = "";
                    System.out.println("you logged out successfully");
                    break;
                }
                case 2: {
                    main();
                    break;
                }
                default: {
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
        System.out.print("enter your e-mail : ");
        String email = strings.nextLine();
        if (!(email.endsWith("@icloud.com") || email.endsWith("@gmail.com") || email.endsWith("@hotmail.com") || email.endsWith("@yahoo.com"))) {
            System.out.println("error-404");
            main();
        }
        System.out.print("enter your phone number : ");
        String tel = strings.nextLine();
        System.out.print("enter your new password : ");
        String password = strings.nextLine();
        System.out.print("enter your card number : ");
        String card = strings.nextLine();
        String cvv = null;
        if (card.startsWith("4") || card.startsWith("1") || card.startsWith("55")) {
            System.out.print("enter your card cvv code : ");
            cvv = strings.nextLine();
        }
        System.out.print("enter your postcode : ");
        int postcode = ints.nextInt();
        System.out.print("enter your street name : ");
        String street = strings.nextLine();
        for (int i = 0; i < 1000; i++) {
            if (Main.emails[i] != null && Main.emails[i].equals(email) || Main.phones[i] != null && Main.phones[i].equals(tel) || Main.cards[i] != null && Main.cards[i].equals(card)) {
                System.out.println("error-404");
                main();
            }
        }
        for (int i = 1; i < 1000; i++) {
            Main.names[i] = name;
            Main.fnames[i] = fname;
            Main.emails[i] = email;
            Main.phones[i] = tel;
            Main.passwords[i] = password;
            Main.cards[i] = card;
            Main.cvvs[i] = cvv;
            Main.balances[i] = 1000000.0;
            Main.postcodes[i] = postcode;
            Main.streets[i] = street;
            Main.onlineuser = tel;
            if (tel.startsWith("+998")) {
                Main.clientsamount++;
                Main.uzbekclients++;
                break;
            }
            if (tel.startsWith("+888")) {
                Main.clientsamount++;
                Main.pirateclients++;
                break;
            } else {
                Main.clientsamount++;
                Main.internationalclients++;
            }
        }
        System.out.println("successful");
        main2();
    }

    public static void main2() {
        System.out.println();
        System.out.println("main menu");
        System.out.println("1. profile");
        System.out.println("2. edit profile");
        System.out.println("3. show password and cvv");
        System.out.println("4. delete profile");
        System.out.println("5. log out");
        System.out.println("0. back");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                String tel = Main.onlineuser;
                System.out.println();
                System.out.println("profile");
                for (int i = 0; i < Main.names.length; i++) {
                    if (Main.names[i] != null) {
                        System.out.println("your name : " + Main.names[i]);
                        System.out.println("your family name : " + Main.fnames[i]);
                        System.out.println("your e-mail : " + Main.emails[i]);
                        System.out.println("your phone number : " + Main.phones[i]);
                        System.out.println("your card number : " + Main.cards[i]);
                        System.out.println("your balance : " + Main.balances[i]);
                        System.out.println("your postcode : " + Main.postcodes[i]);
                        System.out.println("your street name : " + Main.streets[i]);
                    }
                }
                Main.more();
                break;
            }
            case 2: {
                Scanner strings = new Scanner(System.in);
                Scanner digits = new Scanner(System.in);
                String tel = Main.onlineuser;
                System.out.println();
                System.out.println("edit profile");
                System.out.println("what do you want to edit ?");
                System.out.println("1. name");
                System.out.println("2. family name");
                System.out.println("3. e-mail");
                System.out.println("4. card");
                System.out.println("5. postcode");
                System.out.println("6. street name");
                System.out.println("0. back");
                System.out.println("enter : ");
                int edit = put.nextInt();
                switch (edit) {
                    case 1: {
                        System.out.println("enter your new name : ");
                        String name = strings.nextLine();
                        for (int i = 0; i < Main.names.length; i++) {

                        }
                    }
                    case 2: {

                    }
                    case 3: {

                    }
                    case 4: {

                    }
                    case 5: {

                    }
                    case 6: {

                    }
                    case 0: {
                        main2();
                    }
                    default: {
                        System.out.println("error-404");
                        main2();
                    }
                }
                break;
            }
            case 3: {
                System.out.println();
                System.out.println("show password");
                System.out.println();
                break;
            }
            case 4: {
                System.out.println();
                System.out.println("delete profile");
                System.out.println();
                break;
            }
            case 5: {
                System.out.println();
                System.out.println("log out");
                System.out.println();
                Main.onlineuser = "";
                English.main();
                break;
            }
            case 0: {
                English.main();
            }
            default: {
                System.out.println("error-404");
                main2();
            }
        }
    }

    public static void data() {
        Main.names[0] = "user";
        Main.fnames[0] = "family";
        Main.emails[0] = "bekakbdullokh00@icloud.com";
        Main.phones[0] = "+8888080";
        Main.clientsamount++;
        Main.pirateclients++;
        Main.passwords[0] = "1111";
        Main.cards[0] = "4278310022281406";
        Main.cvvs[0] = "739";
        Main.postcodes[0] = 100058;
        Main.streets[0] = "Mehrigiyo";
        Main.balances[0] = 1000000.0;
    }

}