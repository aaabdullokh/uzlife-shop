package src;

import java.util.Scanner;

public class Profile {

    static Scanner put = new Scanner(System.in);
    static int newuser = 0;

    public static void main() throws InterruptedException {
        enter();
    }

    public static void enter() throws InterruptedException {
        if (!Main.onlineuser.equals("")) {
            main2();
        } else {
            System.out.println();
            System.out.println("1. log in ");
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
                    Main.start();
                }
                default: {
                    System.out.println("error-404");
                    enter();
                }
            }
        }
    }

    public static void login() throws InterruptedException {
        Scanner login = new Scanner(System.in);
        System.out.println();
        System.out.println("log in");
        System.out.println();
        System.out.print("enter your phone number : ");
        String phone = login.nextLine();
        System.out.print("enter your password : ");
        String password = login.nextLine();
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null && Main.phones[i].equals(phone)) {
                if (Main.passwords[i] != null && Main.passwords[i].equals(password)) {
                    Main.onlineuser = phone;
                    System.out.println("welcome back , " + Main.names[i] + " !");
                    main2();
                    break;
                }
                if (Main.passwords[i] != null && !Main.passwords.equals(password)) {
                    System.out.println("error-404");
                    enter();
                }
            }
            if (Main.phones[i] != null && !Main.phones[i].equals(phone)) {
                System.out.println("error-404");
                enter();
            }
        }
    }

    public static void signup() throws InterruptedException {
        Scanner signup = new Scanner(System.in);
        System.out.println();
        System.out.println("sign up");
        System.out.println();
        System.out.print("enter your name : ");
        String name = signup.nextLine();
        name.trim();
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isUpperCase(name.charAt(0))) {
                System.out.println("error-404");
                signup();
            }
            if (!Character.isLetter(name.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
        }
        System.out.print("enter your family name : ");
        String fname = signup.nextLine();
        fname.trim();
        for (int i = 0; i < fname.length(); i++) {
            if (!Character.isUpperCase(fname.charAt(0))) {
                System.out.println("error-404");
                signup();
            }
            if (!Character.isLetter(fname.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
        }
        System.out.print("enter your e-mail address : ");
        String email = signup.nextLine();
        email.trim();
        boolean emailtest;
        if (email.endsWith("@icloud.com") || email.endsWith("@gmail.com") || email.endsWith("@yahoo.com") || email.endsWith("@yandex.com")) {
            emailtest = true;
        } else {
            emailtest = false;
            System.out.println("error-404");
            signup();
        }
        for (int i = 0; i < Main.emails.length; i++) {
            if (Main.emails[i] != null && Main.emails[i].equals(email)) {
                System.out.println("error-404");
                signup();
            }

        }
        System.out.print("enter your phone number : ");
        String phone = signup.nextLine();
        phone.trim();
        for (int i = 0; i < phone.length(); i++) {
            if (Character.isLetter(phone.charAt(i)) && Character.isWhitespace(phone.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
        }
        if (!phone.startsWith("+")) {
            System.out.println("error-404");
            signup();
        }
        for (int i = 0; i < Main.phones.length; i++) {
            if (Main.phones[i] != null && Main.phones[i].equals(phone)) {
                System.out.println("error-404");
                signup();
            }
        }
        System.out.print("enter your new password : ");
        String password = signup.nextLine();
        password.trim();
        boolean pass;
        int big = 0, small = 0, number = 0, sign = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                big++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                small++;
            }
            if (Character.isDigit(password.charAt(i))) {
                number++;
            }
            if (!Character.isUpperCase(password.charAt(i)) && !Character.isLowerCase(password.charAt(i)) && !Character.isDigit(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
                sign++;
            }
            if (Character.isWhitespace(password.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
        }
        if (big > 0 && small > 0 && number > 0 && sign > 0 && password.length() >= 8) {
            pass = true;
        } else {
            pass = false;
            System.out.println("error-404");
            signup();
        }
        System.out.print("enter your password again : ");
        String password2 = signup.nextLine();
        password2.trim();
        boolean pass2;
        int big2 = 0, small2 = 0, number2 = 0, sign2 = 0;
        for (int i = 0; i < password2.length(); i++) {
            if (Character.isUpperCase(password2.charAt(i))) {
                big2++;
            }
            if (Character.isLowerCase(password2.charAt(i))) {
                small2++;
            }
            if (Character.isDigit(password2.charAt(i))) {
                number2++;
            }
            if (!Character.isUpperCase(password2.charAt(i)) && !Character.isLowerCase(password2.charAt(i)) && !Character.isDigit(password2.charAt(i)) && !Character.isWhitespace(password2.charAt(i))) {
                sign2++;
            }
            if (Character.isWhitespace(password2.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
        }
        if (big2 > 0 && small2 > 0 && number2 > 0 && sign2 > 0 && password2.length() >= 8) {
            pass2 = true;
        } else {
            pass2 = false;
            System.out.println("error-404");
            signup();
        }
        if (!password.equals(password2)) {
            System.out.println("error-404");
            signup();
        }
        System.out.print("enter your card number : ");
        String card = signup.nextLine();
        String cardholder = null;
        String cvv = null;
        boolean cardtest;
        card.trim();
        int cardcount = 0;
        for (int i = 0; i < card.length(); i++) {
            if (!Character.isDigit(card.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
            if (Character.isDigit(card.charAt(i))) {
                cardcount++;
            }
        }
        if (cardcount != 16) {
            System.out.println("error-404");
            signup();
        }
        if (card.startsWith("4") || card.startsWith("1") || card.startsWith("55")) {
            cardtest = true;
            System.out.print("enter cardholder name : ");
            cardholder = signup.nextLine();
            cardholder.toUpperCase();
            System.out.print("enter your cvv code : ");
            cvv = signup.nextLine();
            cvv.trim();
            int cvvcount = 0;
            for (int i = 0; i < cvv.length(); i++) {
                if (Character.isDigit(cvv.charAt(i))){
                    cvvcount++;
                }
                if (!Character.isDigit(cvv.charAt(i))){
                    System.out.println("error-404");
                    signup();
                }
            }
            if (cvvcount != 3){
                System.out.println("error-404");
                signup();
            }
        }
        if (card.startsWith("8600") || card.startsWith("9860") || card.startsWith("5614")) {
            cardtest = true;
        } /*else {
            cardtest = false;
            System.out.println("error-404");
            signup();
        }*/
        System.out.print("enter your postcode : ");
        String postcode = signup.nextLine();
        int postcodecount = 0;
        for (int i = 0; i < postcode.length(); i++) {
            if (!Character.isDigit(postcode.charAt(i))) {
                System.out.println("error-404");
                signup();
            }
            if (Character.isDigit(postcode.charAt(i))) {
                postcodecount++;
            }
        }
        if (postcodecount <= 4 || postcodecount >= 9) {
            System.out.println("error-404");
            signup();
        }
        System.out.print("enter your street name: ");
        String street = signup.nextLine();
        for (int i = 1; i < Main.phones.length; i++) {
            Main.names[i] = name;
            Main.fnames[i] = fname;
            Main.emails[i] = email;
            Main.phones[i] = phone;
            if (phone.startsWith("+998")) {
                Main.uzbekclients++;
                Main.clients++;
            } else {
                Main.interclients++;
                Main.clients++;
            }
            Main.passwords[i] = password;
            Main.cards[i] = card;
            Main.cardholders[i] = cardholder;
            Main.cvvs[i] = cvv;
            Main.balances[i] = 1000000;
            if (card.startsWith("8600") || card.startsWith("9860") || card.startsWith("5614")) {
                Main.uzbekcards++;
            } else if (card.startsWith("4") || card.startsWith("1") || card.startsWith("55")) {
                Main.intercards++;
            }
            Main.postcodes[i] = postcode;
            Main.streets[i] = street;
        }
        newuser++;
        Main.onlineuser = phone;
        System.out.println("successful");
        main2();
    }

    public static void main2() throws InterruptedException {
        Scanner main2 = new Scanner(System.in);
        String tel = Main.onlineuser;
        System.out.println();
        System.out.println("menu");
        System.out.println("1. profile");
        System.out.println("2. edit profile");
        System.out.println("3. delete profile");
        System.out.println("4. back");
        System.out.println("0. log out");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                System.out.println();
                System.out.println("profile");
                System.out.println();
                for (int i = 0; i < Main.names.length; i++) {
                    if (Main.phones[i] != null && Main.phones[i].equals(tel)) {
                        if (Main.names[i] != null) {
                            System.out.println("name : " + Main.names[i]);
                            System.out.println("family name : " + Main.fnames[i]);
                            System.out.println("e-mail : " + Main.emails[i]);
                            System.out.println("phone number : " + Main.phones[i]);
                            System.out.println("card number : " + Main.cards[i]);
                            System.out.println("postcode : " + Main.postcodes[i]);
                            System.out.println("street : " + Main.streets[i]);

                        }
                    }
                }
                Main.more();
                break;
            }
            case 2: {
                System.out.println();
                System.out.println("edit profile");
                System.out.println();
                System.out.println("1. name");
                System.out.println("2. family name");
                System.out.println("3. e-mail");
                System.out.println("4. password");
                System.out.println("5. card number");
                for (int i = 0; i < Main.cards.length; i++) {
                    if (Main.cards[i] != null && Main.phones[i].equals(tel) && Main.cards[i].startsWith("4") || Main.cards[i].startsWith("1") || Main.cards[i].startsWith("55")) {
                        System.out.println("8. cvv code");
                    }
                }
                System.out.println("6. postcode");
                System.out.println("7. street name");
                System.out.println("0. back");
                System.out.print("enter : ");
                int enter2 = put.nextInt();
                switch (enter2) {
                    case 1: {
                        System.out.println();
                        System.out.print("enter your new name : ");
                        String newname = main2.nextLine();
                        newname.trim();
                        for (int i = 0; i < newname.length(); i++) {
                            if (!Character.isUpperCase(newname.charAt(0))) {
                                System.out.println("error-404");
                                main2();
                            }
                            if (!Character.isLetter(newname.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.names.length; i++) {
                            Main.names[i] = newname;
                        }
                        System.out.println("successful");
                        Main.more();
                        break;
                    }
                    case 2: {
                        System.out.println();
                        System.out.print("enter your new family name : ");
                        String newfname = main2.nextLine();
                        newfname.trim();
                        for (int i = 0; i < newfname.length(); i++) {
                            if (!Character.isUpperCase(newfname.charAt(0))) {
                                System.out.println("error-404");
                                main2();
                            }
                            if (!Character.isLetter(newfname.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.fnames.length; i++) {
                            Main.fnames[i] = newfname;
                        }
                        System.out.println("successful");
                        Main.more();
                        break;
                    }
                    case 3: {
                        System.out.println();
                        System.out.print("enter your new e-mail address : ");
                        String newemail = main2.nextLine();
                        newemail.trim();
                        boolean newemailtest;
                        if (newemail.endsWith("@icloud.com") || newemail.endsWith("@gmail.com") || newemail.endsWith("@yahoo.com") || newemail.endsWith("@yandex.com")) {
                            newemailtest = true;
                        } else {
                            newemailtest = false;
                            System.out.println("error-404");
                            main2();
                        }
                        for (int i = 0; i < Main.emails.length; i++) {
                            if (Main.emails[i] != null && Main.emails[i].equals(newemail)) {
                                System.out.println("error-404");
                                main2();
                            }

                        }
                        for (int i = 0; i < Main.emails.length; i++) {
                            if (Main.emails[i].equals(newemail)) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.emails.length; i++) {
                            Main.emails[i] = newemail;
                        }
                        System.out.println("successful");
                        Main.more();
                        break;
                    }
                    case 4: {
                        System.out.println();
                        System.out.print("enter your old password : ");
                        String oldpassword = main2.nextLine();
                        boolean oldpasswordtest;
                        for (int i = 0; i < Main.passwords.length; i++) {
                            if (Main.passwords[i] != null && !Main.passwords[i].equals(oldpassword)) {
                                oldpasswordtest = false;
                                System.out.println("error-404");
                                main2();
                            } else {
                                oldpasswordtest = true;
                                System.out.println("successful");
                            }
                        }
                        System.out.print("enter your new password : ");
                        String newpassword = main2.nextLine();
                        newpassword.trim();
                        boolean newpasswordtest;
                        int big = 0, small = 0, number = 0, sign = 0;
                        for (int i = 0; i < newpassword.length(); i++) {
                            if (Character.isUpperCase(newpassword.charAt(i))) {
                                big++;
                            }
                            if (Character.isLowerCase(newpassword.charAt(i))) {
                                small++;
                            }
                            if (Character.isDigit(newpassword.charAt(i))) {
                                number++;
                            }
                            if (!Character.isUpperCase(newpassword.charAt(i)) && !Character.isLowerCase(newpassword.charAt(i)) && !Character.isDigit(newpassword.charAt(i)) && !Character.isWhitespace(newpassword.charAt(i))) {
                                sign++;
                            }
                            if (Character.isWhitespace(newpassword.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        if (big > 0 && small > 0 && number > 0 && sign > 0 && newpassword.length() >= 8) {
                            newpasswordtest = true;
                        } else {
                            newpasswordtest = false;
                            System.out.println("error-404");
                            main2();
                        }
                        if (newpassword.equals(oldpassword)) {
                            System.out.println("error-404");
                            main2();
                        }
                        System.out.print("enter your password again : ");
                        String newpassword2 = main2.nextLine();
                        newpassword2.trim();
                        boolean newpasswordtest2;
                        int big2 = 0, small2 = 0, number2 = 0, sign2 = 0;
                        for (int i = 0; i < newpassword2.length(); i++) {
                            if (Character.isUpperCase(newpassword2.charAt(i))) {
                                big2++;
                            }
                            if (Character.isLowerCase(newpassword2.charAt(i))) {
                                small2++;
                            }
                            if (Character.isDigit(newpassword2.charAt(i))) {
                                number2++;
                            }
                            if (!Character.isUpperCase(newpassword2.charAt(i)) && !Character.isLowerCase(newpassword2.charAt(i)) && !Character.isDigit(newpassword2.charAt(i)) && !Character.isWhitespace(newpassword2.charAt(i))) {
                                sign2++;
                            }
                            if (Character.isWhitespace(newpassword2.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        if (big2 > 0 && small2 > 0 && number2 > 0 && sign2 > 0 && newpassword2.length() >= 8) {
                            newpasswordtest2 = true;
                        } else {
                            newpasswordtest2 = false;
                            System.out.println("error-404");
                            main2();
                        }
                        for (int i = 0; i < Main.passwords.length; i++) {
                            if (Main.passwords[i].equals(newpassword)) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.passwords.length; i++) {
                            Main.passwords[i] = newpassword;
                        }
                        Main.more();
                        break;
                    }
                    case 5: {
                        for (int i = 0; i < Main.cards.length; i++) {
                            if (Main.cards[i].startsWith("8600") || Main.cards[i].startsWith("9860") || Main.cards[i].startsWith("5614")) {
                                Main.uzbekcards--;
                                break;
                            }
                            if (Main.cards[i].startsWith("4") || Main.cards[i].startsWith("1") || Main.cards[i].startsWith("55")) {
                                Main.cardholders[i] = null;
                                Main.cvvs[i] = null;
                                Main.intercards--;
                            }
                        }
                        System.out.println();
                        System.out.print("enter your new card number : ");
                        String newcard = main2.nextLine();
                        String newcardholder = null;
                        String newcvv = null;
                        boolean newcardtest;
                        newcard.trim();
                        int cardcount = 0;
                        for (int i = 0; i < newcard.length(); i++) {
                            if (!Character.isDigit(newcard.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                            if (Character.isDigit(newcard.charAt(i))) {
                                cardcount++;
                            }
                        }
                        if (cardcount != 16) {
                            System.out.println("error-404");
                            main2();
                        }
                        if (newcard.startsWith("4") || newcard.startsWith("1") || newcard.startsWith("55")) {
                            newcardtest = true;
                            System.out.print("enter cardholder name : ");
                            newcardholder = main2.nextLine();
                            newcardholder.toUpperCase();
                            System.out.print("enter your cvv code : ");
                            newcvv = main2.nextLine();
                            boolean newcvvtest;
                            newcvv.trim();
                            int newcvvcount = 0;
                            for (int i = 0; i < newcvv.length(); i++) {
                                if (!Character.isDigit(newcvv.charAt(i))) {
                                    System.out.println("error-404");
                                    main2();
                                }
                                if (Character.isDigit(newcvv.charAt(i))) {
                                    newcvvcount++;
                                }
                            }
                            if (newcvvcount != 3) {
                                newcvvtest = false;
                                System.out.println("error-404");
                                main2();
                            } else if (newcvvcount == 3) {
                                newcvvtest = true;
                            }
                        }
                        if (newcard.startsWith("8600") || newcard.startsWith("9860") || newcard.startsWith("5614")) {
                            newcardtest = true;
                        } /*else {
                            newcardtest = false;
                            System.out.println("error-404");
                            main2();
                        }*/
                        for (int i = 0; i < Main.cards.length; i++) {
                            if (Main.cards[i].equals(newcard)) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.cards.length; i++) {
                            Main.cards[i] = newcard;
                            if (newcard.startsWith("4") || newcard.startsWith("1") || newcard.startsWith("55")) {
                                Main.cardholders[i] = newcardholder;
                                Main.cvvs = new String[]{newcvv};
                            }
                        }
                        Main.more();
                        break;
                    }
                    case 6: {
                        System.out.println();
                        System.out.print("enter your new postcode : ");
                        String newpostcode = main2.nextLine();
                        int newpostcodecount = 0;
                        for (int i = 0; i < newpostcode.length(); i++) {
                            if (!Character.isDigit(newpostcode.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                            if (Character.isDigit(newpostcode.charAt(i))) {
                                newpostcodecount++;
                            }
                        }
                        if (newpostcodecount <= 4 || newpostcodecount >= 9) {
                            System.out.println("error-404");
                            main2();
                        }
                        for (int i = 0; i < Main.postcodes.length; i++) {
                            if (Main.postcodes[i].equals(newpostcode)) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.postcodes.length; i++) {
                            Main.postcodes[i] = newpostcode;
                        }
                        Main.more();
                        break;
                    }
                    case 7: {
                        System.out.println();
                        System.out.print("enter your new street name: ");
                        String newstreet = main2.nextLine();
                        for (int i = 0; i < Main.streets.length; i++) {
                            if (Main.streets[i].equals(newstreet)) {
                                System.out.println("error-404");
                                main2();
                            }
                        }
                        for (int i = 0; i < Main.streets.length; i++) {
                            Main.streets[i] = newstreet;
                        }
                        Main.more();
                        break;
                    }
                    case 8: {
                        System.out.println();
                        System.out.print("enter your new cvv");
                        String newcvv = main2.nextLine();
                        int newcvvcounter = 0;
                        for (int i = 0; i < newcvv.length(); i++) {
                            if (!Character.isDigit(newcvv.charAt(i))) {
                                System.out.println("error-404");
                                main2();
                            }
                            if (Character.isDigit(newcvv.charAt(i))) {
                                newcvvcounter++;
                            }
                        }
                        if (newcvvcounter != 3) {
                            System.out.println("error-404");
                            main2();
                        }
                        for (int i = 0; i < Main.cvvs.length; i++) {
                            Main.cvvs[i] = newcvv;
                        }
                    }
                    case 0: {
                        System.out.println();
                        main2();
                        break;
                    }
                    default: {
                        System.out.println("error-404");
                        main2();
                    }
                }
            }
            case 3: {
                Scanner passwordenter = new Scanner(System.in);
                System.out.println();
                System.out.println("delete profile");
                System.out.println("are you sure ? ");
                System.out.println("1. delete");
                System.out.println("2. no");
                System.out.print("enter : ");
                int enter2 = put.nextInt();
                switch (enter2) {
                    case 1: {
                        boolean check;
                        System.out.print("enter password to delete : ");
                        String password = passwordenter.nextLine();
                        for (int i = 0; i < Main.passwords.length; i++) {
                            if (Main.phones[i] != null && Main.phones[i].equals(tel)) {
                                if (Main.passwords[i] != null && Main.passwords[i].equals(password)) {
                                    check = true;
                                    break;
                                }
                                if (Main.passwords[i] != null && !Main.passwords.equals(password)) {
                                    check = false;
                                    System.out.println("error-404");
                                    main2();
                                    break;
                                }
                            }
                        }
                        System.out.println();
                        System.out.print("deleting in process");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(500);
                        System.out.print(".");
                        Thread.sleep(500);
                        System.out.print(".");
                        Thread.sleep(500);
                        System.out.println();
                        System.out.println("successful");
                        for (int i = 0; i < Main.names.length; i++) {
                            if (Main.phones[i].equals(tel)) {
                                if (Main.names[i] != null) {
                                    Main.names[i] = null;
                                }
                                if (Main.fnames[i] != null) {
                                    Main.fnames[i] = null;
                                }
                                if (Main.emails[i] != null) {
                                    Main.emails[i] = null;
                                }
                                if (Main.phones[i] != null) {
                                    Main.phones[i] = null;
                                }
                                if (Main.passwords[i] != null) {
                                    Main.passwords[i] = null;
                                }
                                if (Main.cards[i] != null) {
                                    Main.cards[i] = null;
                                }
                                if (Main.cardholders[i] != null) {
                                    Main.cardholders[i] = null;
                                }
                                if (Main.cvvs[i] != null) {
                                    Main.cvvs[i] = null;
                                }
                                Main.balances[i] = 0.0;
                                if (Main.postcodes[i] != null) {
                                    Main.postcodes[i] = null;
                                }
                                if (Main.streets[i] != null) {
                                    Main.streets[i] = null;
                                } else {
                                    System.out.println("error-404");
                                    main2();
                                    break;
                                }
                            }
                            Main.clients--;
                            Main.newusers--;
                            newuser--;
                            if (Main.cards[i].startsWith("4") || Main.cards[i].startsWith("1") || Main.cards[i].startsWith("55")) {
                                Main.intercards--;
                            }
                            if (Main.cards[i].startsWith("8600") || Main.cards[i].startsWith("9860") || Main.cards[i].startsWith("5614")) {
                                Main.uzbekcards--;
                            }
                        }
                        Main.onlineuser = "";
                        Main.main2();
                        break;
                    }
                    case 2: {
                        main2();
                        break;
                    }
                    default: {
                        System.out.println("error-404");
                        main2();
                    }
                }
            }
            case 4: {
                Main.start();
            }
            case 0: {
                System.out.println();
                System.out.println("log out");
                System.out.println("bye !");
                Main.onlineuser = "";
                Main.main2();
            }
            default: {
                System.out.println("error-404");
                main2();
            }
        }
    }

    public static void userdata() throws InterruptedException {
        System.out.println();
        System.out.print("reloading main data");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("successful");
        Thread.sleep(1000);

        Main.names[0] = "username";
        Main.fnames[0] = "userfamilyname";
        Main.emails[0] = "username@icloud.com";
        Main.phones[0] = "+8888080";
        Main.passwords[0] = "User_001";
        Main.cards[0] = "4278310022287777";
        Main.balances[0] = 1000000.0;
        Main.cardholders[0] = "ABDULLOH";
        Main.cvvs[0] = "777";
        Main.postcodes[0] = "777777";
        Main.streets[0] = "Mehrigiyo";
    }

    public static void alldata() throws InterruptedException {
        System.out.println();
        System.out.print("reloading all data");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("successful");
        Thread.sleep(1000);
        if (Main.newusers != newuser) {
            Main.newusers++;
        }
        /*if (Main.newusers != newuser){
            Main.newusers++;
            String tel = Main.onlineuser;
            for (int i = 0; i < Main.names.length; i++) {
                if (Main.names[i] != null){
                    System.out.println("user name " + i + " : " + Main.names[i]);
                }
            }
        }*/
    }

}