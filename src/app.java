/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author w64042
 */
public class app {

    /**
     * @param args the command line arguments
    public static void main(S
     */
    public static void main(String[] args){

        //1,2

        System.out.println("Wiek: "+ myAge());
        System.out.println(myName());

        //3

        Random rand = new Random();

        int a = rand.nextInt(25)-10; //-10 do 14
        int b = rand.nextInt(25)-10;

        ex3(a,b);
        //4
        System.out.println( ex4(54));
        //5
        System.out.println( ex5(223));
        //6
        System.out.println( ex6(5));
        //7
        System.out.println( ex7(25));
        //8
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int l1 = scan.nextInt();
        System.out.println("Podaj kolejną liczbę");
        int l2 = scan.nextInt();
        int l3 =  (int) ((Math.random() * (l2 - l1)) + l1);
        System.out.println( ex8(l1,l2,l3));

    }
    //metody
//1
    public static int myAge(){
        return 21;
        //metode statyczna mozna wywolac bez instancji klasy
    }
    //2
    public static String myName(){
        return "Witold";
        //metode statyczna mozna wywolac bez instancji klasy
    }
    //3
    public static void ex3(int a,int b) {
        System.out.println("suma: "+(a+b) );
        System.out.println("roznica: "+(a-b) );
        System.out.println("iloczyn: "+(a*b) );
    }
    //4
    public static boolean ex4(int a){
        return a % 2 == 0;
    }
    //5
    public static boolean div3(int a){
        if(a<=10){
            return a==3 || a==9;
        }
        String s = String.valueOf(a);
        int suma = 0;

        for (int i = 0; i < s.length(); i++) {
            suma += s.charAt(i) - '0';
        }

        return div3(suma);

    }
    public static boolean div5(int a) {
        if(a<=10){
            return  a == 0 || a == 5 || a==10;
        }
        return div5(a - (a / 10) * 10);
    }

    public static boolean ex5(int a){
    return div3(a) && div5(a);
    }
    //6
    public static double ex6(int a){
        return Math.pow(a,3);
    }
    //7
    public static double ex7(int a){
        return Math.sqrt(a);
    }
    //8
    public static boolean ex8(int a, int b, int c){
        int max=Math.max(a, Math.max(b,c));
        return max < (a+b+c)-max;
    }
}
