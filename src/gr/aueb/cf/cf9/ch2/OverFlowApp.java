package gr.aueb.cf.cf9.ch2;

/**
 * Προσθέτει δυο ακεραίους και το αποτέλεσμα
 * δημιουργεί υπερχείλιση (overflow)
 */

public class OverFlowApp {

    public static void main(String[] args) {

        int num1= Integer.MAX_VALUE;
        int num2 = 1;
        int result= 0;

        result = num1 + num2;

        System.out.println("Το αποτέλεσμα είναι:" + result);



    }
}
