package src;

import com.sun.jdi.event.ThreadDeathEvent;

import javax.naming.spi.DirObjectFactory;
import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner put = new Scanner(System.in);
    static int clients = 0;
    static int uzbekclients = 0;
    static int interclients = 0;
    static int intercards = 0;
    static int uzbekcards = 0;
    static int newusers = 0;
    static String[] names = new String[1000];
    static String[] fnames = new String[1000];
    static String[] emails = new String[1000];
    static String[] phones = new String[1000];
    static String[] passwords = new String[1000];
    static String[] cards = new String[1000];
    static double[] balances = new double[1000];
    static String[] cardholders = new String[1000];
    static String[] cvvs = new String[1000];
    static String[] postcodes = new String[1000];
    static String[] streets = new String[1000];
    static String onlineuser = "";

    public static void main(String[] args) throws InterruptedException {
        loading();
        datas();
        main2();

    }

    public static void loading() throws InterruptedException {
        System.out.println();
        System.out.print("loading");
        Thread.sleep(700);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("successful");
        Thread.sleep(500);
    }


    public static void main2() throws InterruptedException {
        /*System.out.println();
        System.out.println("                         [||||]      [||||]     [||||||||||||]     [||||]             [||||]                  /[||||]\\          ");
        System.out.println("                         [||||]      [||||]     [||||||||||||]     [||||]             [||||]                /[||||||||]\\        ");
        System.out.println("                         [||||]      [||||]     [||||]             [||||]             [||||]              /[||]/    \\[||]\\     ");
        System.out.println("                         [||||||||||||||||]     [||||||||||]       [||||]             [||||]             [||]/        \\[||]     ");
        System.out.println("                         [||||||||||||||||]     [||||||||||]       [||||]             [||||]             [||]\\        /[||]     ");
        System.out.println("                         [||||]      [||||]     [||||]             [||||]             [||||]              \\[||]\\    /[||]/     ");
        System.out.println("                         [||||]      [||||]     [||||||||||||]     [||||||||||||]     [||||||||||||]        \\[||||||||]/        ");
        System.out.println("                         [||||]      [||||]     [||||||||||||]     [||||||||||||]     [||||||||||||]          \\[||||]/          ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();*/
        System.out.println();
        System.out.println("hello !");
        System.out.println("ltd \"uzlife holding system\"");
        System.out.println("uzlife shop");
        start();
    }

    public static void datas() throws InterruptedException {
        Profile.userdata();
        Profile.alldata();
    }

    public static void start() throws InterruptedException {
        System.out.println();
        System.out.println("1. just to see goods and prices");
        System.out.println("2. enter profile");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                error();
                break;
            }
            case 2: {
                Profile.main();
                break;
            }
            case 2010: {
                Boss.main();
                break;
            }
            default: {
                System.out.println("error-404");
                start();
            }
        }
    }

    public static void more() throws InterruptedException {
        System.out.println();
        System.out.println("do you want to do something else ? ");
        System.out.println("1. yes");
        System.out.println("2. no");
        System.out.print("enter : ");
        int enter = put.nextInt();
        switch (enter) {
            case 1: {
                start();
                break;
            }
            case 2: {
                end();
                break;
            }
            default: {
                System.out.println("error-404");
                more();
            }
        }
    }

    public static void error() throws InterruptedException {
        System.out.println();
        System.out.println("sorry , but this menu is not working yet !");
        start();
    }

    public static void end(){
        System.out.println();
        System.out.println("thank you !");
        return;
    }

}