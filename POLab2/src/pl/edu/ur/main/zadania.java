/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author gandzialf
 * @author Mateusz Krajnik Inf1 Lab2 
 */
public class zadania {
   
    public static void zadanie3()
    {
        int i,w;
        Scanner s = new Scanner(System.in);
        double tab[] = new double[10];
        System.out.println("Podaj 10 elementow rzeczywistych do tablcy: ");
       for(i = 0; i< tab.length; i++)
       {
          tab[i] = s.nextDouble();
       }
       do{
           System.out.print("1.Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n"
                   + "3.Wyświetlanie elementów o nieparzystych indeksach.\n4.Wyświetlanie elementów o parzystych indeksach.\n5.Koniec zadania\nWybierz punkt: ");
           w = s.nextInt();
           if(w==1)
           {
                for(i = 0; i < tab.length; i++)
                 {
                    System.out.println(i + " element tablicy = " + tab[i]);
                 }
           } 
           else if(w==2)
            {
                for(i = tab.length-1; i>=0 ; i--)
                {
                    System.out.println(i + " element tablicy = " + tab[i]);
                }
             }
           else if(w==3)
           {
               for(i = 1; i < tab.length; i=i+2)
                 {
                    System.out.println(i + " element tablicy = " + tab[i]);
                 }
           }
           else if(w==4)
           {
               for(i = 0; i < tab.length; i=i+2)
                 {
                    System.out.println(i + " element tablicy = " + tab[i]);
                 }
           }
           else if(w==5)
           {
                System.out.println("Koniec zadania.");
           }
           else if((w>5)||(w<=0))
           {
               System.err.println("Error!Taki podpunkt nie istnieje.\n");
           }
          
       }while(w!=5);
       
    }
    public static void zadanie4()
    {
     int i,w;
        Scanner s = new Scanner(System.in);
        int tab[] = new int[10];
        System.out.println("Podaj 10 elementow do tablcy: ");
       for(i = 0; i< tab.length; i++)
       {
          tab[i] = s.nextInt();
       }    
       
        do{
           System.out.print("\n1.Suma elementow tablicy.\n2.Iloczyn elementow tablicy.\n"
                   + "3.Srednia wartosc.\n4.Minimalna wartosc.\n5.Maksymalna wartosc\n6.Koniec zadania\nWybierz punkt: ");
           w = s.nextInt();
           switch(w)
           {
               case 1:
                int suma = 0;
                for(i = 0; i< tab.length; i++)
                  {
                  suma += tab[i];
                  }    
                System.out.println("Suma elementow tablicy wynosi: " + suma);
               break;
               case 2:
               long iloczyn;
                 iloczyn = 1;
                for(i = 0; i< tab.length; i++)
                  {
                  iloczyn *= tab[i];
                  }    
                System.out.println("Suma elementow tablicy wynosi: " + iloczyn); 
               break;
               case 3:
               int srsuma = 0;
               double srednia;
                for(i = 0; i< tab.length; i++)
                  {
                  srsuma += tab[i];
                  } 
                srednia = srsuma/tab.length;
                System.out.println("Sredna "+ tab.length + " elementow tablicy wynosi: " + srednia);
               break;
               case 4:
               int min = tab[0];
               for(i = 0; i< tab.length; i++)
                  {
                   if(min>tab[i])
                   {
                       min = tab[i];
                   }
                  } 
               System.out.println("Najmniejsza wartosc tablicty to: "+ min);
               break;
               case 5:
                   int max = tab[0];
               for(i = 0; i< tab.length; i++)
                  {
                   if(max<tab[i])
                   {
                       max = tab[i];
                   }
                  } 
               System.out.println("Najmniejsza wartosc tablicty to: "+ max);
               break;
               case 6:
                  System.out.println("Koniec zadania.");
               break;
               default:
                  System.err.println("Error!Taki podpunkt nie istnieje.\n");
               break;
           }
          
       }while(w!=6);
    }
    public static void zadanie6()
    {
        int l;
        Scanner s=new Scanner(System.in);     
        while(true)
         {
             System.out.print("Podaj liczbe calkowita: ");
             l = s.nextInt();
             if(l<0)
             {
                 System.out.println("Podales liczbe mniejsza od 0, program zakonczony.");
                 break;
             }
         }
    }
    public static void zadanie7()
    {
       Scanner s = new Scanner(System.in);
       int i,liczba,ile,pom,j,zmiana;
       System.out.print("Podaj ilosc liczb do posortowania: ");
       ile = s.nextInt();
       int tab[] = new int[ile];
       for(i=0;i<tab.length;i++)
       {
           System.out.print("Podaj liczbe: ");
           tab[i] = s.nextInt();
       }
       do
       {
           zmiana = 0;
           j=ile-1;
           do
           {
               j--;
               if(tab[j+1]<tab[j])
               {
                   pom=tab[j];
                   tab[j]=tab[j+1];
                   tab[j+1]=pom;
                   zmiana = 1;
               }
           }while(j!=0);
       }while(zmiana!=0);
       System.out.println("Tablica po posortowaniu:");
        for(i=0; i<ile; i++)
        {
        System.out.println(tab[i]);
        }
    }
}
