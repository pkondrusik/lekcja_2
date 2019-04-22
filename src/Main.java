public class Main {

    public static void main(String[] args) {

//        zad1();
//        zad2();
//        zad3();
//        zad4();
        zad5();

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

    public static void zad2(){

        String miesiac = "listopad";

        switch (miesiac){
            case "grudzien":
            case "styczen":
            case "luty": System.out.print("zima");
                break;
            case "marzec":
            case "kwiecien":
            case "maj": System.out.print("wiosna");
                break;
            case "czerwiec":
            case "lipiec":
            case "sierpien": System.out.print("lato");
                break;
            case "wrzesien":
            case "pazdziernik":
            case "listopad": System.out.print("jesien");
                break;
            default: System.out.print("nieprawidlowy miesiac");

        }

    }

    public static void zad3(){

        char znak = '*';
        double x = 2;
        double y = 4;

        switch (znak){
            case '+': System.out.print(x+y);
            break;
            case '-': System.out.print(x-y);
            break;
            case '*': System.out.print(x*y);
            break;
            case '/': System.out.print(x/y);
            break;
            default: System.out.print("nieznany znak!");
            }

    }

    public static void zad4(){

        int[] tablica = {1,2,3};

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);

    }

    public static void zad5(){

        int[] tablica1 = {1,2,3,4,5,6,7,8,9,0};
        int[] tablica2 = new int[10];
        int j = 0;


        for (int i = tablica1.length; i > 0; i--){
            tablica2[j] = tablica1[i-1];
            j++;

        }


        for (int i = 0; i < tablica2.length; i++)
            System.out.print(tablica2[i] + " ");


    }

}
