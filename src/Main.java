package src;

import java.util.Scanner;

public class Main {

    static Scanner put = new Scanner(System.in);
    static int clientsamount = 0;
    static int uzbekclients = 0;
    static int internationalclients = 0;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("ltd \"uzlife ecosystem\"");
        System.out.println("uzlife shop");
        System.out.println("hello !");
        System.out.println();
        System.out.println("choose the language : ");
        System.out.println("1. english");
        System.out.println("2. русский язык");
        System.out.println("3. o'zbek tili");
        System.out.print("enter : ");
        int languageenter = put.nextInt();
        if (languageenter == 1) {
            English.main();
            return;
        }
        if (languageenter == 2) {
            Russian.main();
            return;
        }
        if (languageenter == 3) {
            Uzbek.main();
            return;
        }
        if (languageenter == 987123) {
            Boss.main();
        } else {
            System.out.println("error-404");
            start();
        }
    }


}
