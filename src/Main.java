public class Main {

    public static void main(String[] args) {

        zad1();

    }

    public static void zad1(){

        int dzien = 7;

        switch (dzien){
            case 1: System.out.print("poniedzialek");
            break;
            case 2: System.out.print("wtorek");
            break;
            case 3: System.out.print("sroda");
            break;
            case 4: System.out.print("czwartek");
            break;
            case 5: System.out.print("piatek");
            break;
            case 6: System.out.print("sobota");
            break;
            case 7: System.out.print("niedziela");
            break;
            default: System.out.print("bledny numer dnia!");

        }


    }


}
