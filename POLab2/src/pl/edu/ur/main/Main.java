package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 * @author Mateusz Krajnik Inf1 Lab2 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
    int w;
    Scanner s = new Scanner(System.in);
   do{
    System.out.print("1. Zad 3, 2.Zad 4, 3.Zad 6, 4.Zad 7, 5.Koniec programu\nWybierz zadanie: ");
    w=s.nextInt();
    
    switch(w)
    {
        case 1:
         zadania.zadanie3();
        break;
        case 2:
            zadania.zadanie4();
        break;
        case 3:
            zadania.zadanie6();
        break;
        case 4:
            zadania.zadanie7();
        break;
        case 5:
         System.out.println("KONEIC PROGRAMU");
        break;  
        default:
        System.err.println("Nieprawidlowy numer zadania, sproboj ponownie.");
        break;
    }
    }while(w!=5);
    }
    
}
