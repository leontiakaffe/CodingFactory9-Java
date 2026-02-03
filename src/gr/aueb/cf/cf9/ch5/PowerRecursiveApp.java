package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    public static int pow(int base, int power){

        return power == 0 ? 1 : base * pow(base , power -1);
    }
}
