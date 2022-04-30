package examenfinalipc;

import java.util.Scanner;

public class ExamenFinal {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        int opc, num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        opc = entrada.nextInt();

        switch (opc) {

            case 1:
                System.out.print("Ingrese numero 1: ");
                num1 = entrada.nextInt();
                System.out.print("Ingrese numero 2: ");
                num2 = entrada.nextInt();
                if (num1 > num2) {
                    System.out.println("El  numero mayor es: " + num1);
                } else {
                    System.out.println("El numero mayor es: " + num2);
                }
                break;
            case 2:
                ejercicio2();
                break;

            case 3:
                ejercicio3();
                break;
        }
    }

    public static void ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        int num, cont = 0;
        do {
            System.out.println("Ingrese numero impar: ");
            num = entrada.nextInt();
        } while (num % 2 == 0);

        for (int i = 1; i <= num; i += 2) {
            cont++;
        }
        for (int i = 1; i <= cont; i++) {
            for (int j = 1; j <= cont - i; j++) {
                System.out.print(" ");
            }

            for (int pos = 1; pos <= (i * 2) - 1; pos++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

    public static void ejercicio3() {
        int total=0;
        int leche[]={30,34,28,45,31,50,29,1};
        int peso[]={223,243,100,200,155,300,150};
        for (int i = 0; i < leche.length; i++) {
            total=total+peso[i];
            if(total<=1000){
                break;
            }
        }
    }

}
