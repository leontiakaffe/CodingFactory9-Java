package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπωνει 10  αστεράκια με for (οριζόντια, κάθετα)
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.print("*");
        }

        for (int i = 1; i <= 10; i++){
            System.out.println("*");
        }

        //GRID 10X10 - Nested for loops
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 20; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i =1; i <=10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =10; i >=1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =1; i <=10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =1; i <=10; i++){
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }




    }


}
