package src;

import java.util.Scanner;

public class Main {

    static Scanner put = new Scanner(System.in);
    static int clientsamount = 0;
    static int uzbekclients = 0;
    static int internationalclients = 0;
    static int pirateclients = 0;
    static int uzbcardsamount = 0;
    static int internationalcardsamount = 0;
    static String[] names = new String[1000];
    static String[] fnames = new String[1000];
    static String[] phones = new String[1000];
    static String[] passwords = new String[1000];
    static String[] intercards = new String[1000];
    static String[] uzbcards = new String[1000];
    static double[] interbalances = new double[1000];
    static double[] uzbbalances = new double[1000];
    static String[] cvvs = new String[1000];
    static int[] postcodes = new int[1000];
    static String[] streets = new String[1000];
    static String onlineuser = null;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Profile.data();
        System.out.println();
        System.out.println("ltd \"uzlife ecosystem\"");
        System.out.println("uzlife shop");
        System.out.println("hello !");
        System.out.println();
        System.out.println("choose the language : ");
        System.out.println("1. english");
        System.out.println("2. русский язык");
        System.out.println("3. o'zbek tili");
        System.out.print("enter : ");
        String languageenter = put.nextLine();
        if (languageenter.equals("1")) {
            English.main();
            return;
        }
        if (languageenter.equals("2")) {
            Russian.main();
            return;
        }
        if (languageenter.equals("3")) {
            Uzbek.main();
            return;
        }
        if (languageenter.equals("boss")) {
            Boss.main();
        } else {
            System.out.println("error-404");
            start();
        }
    }

    public static void error(){
        System.out.println();
        System.out.println("sorry , but this menu is not working now !");
        start();
    }

}