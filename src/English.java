package src;

import java.util.Scanner;

public class English {

    static Scanner put = new Scanner(System.in);
    static int menu;

    public static void main() {
        System.out.println();
        System.out.println("english");
        System.out.println();
        System.out.println("welcome to our online shop !");
        System.out.println("here you can find all what you want !");
        menu();
    }

    public static void menu() {
        System.out.println();
        System.out.println("menu");
        System.out.println("1.  sales and promotions");
        System.out.println("2.  household appliances");
        System.out.println("3.  electronics");
        System.out.println("4.  stationary");
        System.out.println("5.  household goods");
        System.out.println("6.  furniture");
        System.out.println("7.  clothes");
        System.out.println("8.  shoes");
        System.out.println("9.  accessories");
        System.out.println("10. beauty");
        System.out.println("11. construction and repair");
        System.out.println("12. auto goods");
        System.out.println("13. baby products");
        System.out.println("14. hobby and art");
        System.out.println("15. sport and relax");
        System.out.println("16. food products");
        System.out.println("17. chemical goods");
        System.out.println("18. zoo goods");
        System.out.println("19. books");
        System.out.println("20. garden goods");
        System.out.println("21. profile");
        System.out.println("0.  back");
        System.out.print("enter : ");
        menu = put.nextInt();
        switch (menu) {
            case 1: {
                sale();
                break;
            }

            case 21: {
                Profileenglish.main();
                break;
            }
            default: {
                System.out.println("error-404");
                menu();
            }
        }
    }

    public static void sale() {
        System.out.println();
        System.out.println("sales and promotions");
        System.out.println("here is all our sales");
        System.out.println();
    }


}
