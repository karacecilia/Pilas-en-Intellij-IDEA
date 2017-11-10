package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pilas p = new Pilas();
        Scanner sc=new Scanner(System.in);

        boolean seguir=true;
        while(seguir) {
            p.Menu();
            String op = sc.next();
            switch (op) {
                case "1":
                case "Insertar":
                case "insertar":
                    System.out.println("Usted eligió la opción Insertar" +
                            "¿Cuantos valores desea insertar?");
                    int num = sc.nextInt();
                    for (int i=0; i<num; i++){
                        System.out.println("Valor "+(i+1)+": ");
                        int valor=sc.nextInt();
                        p.push(valor);
                    }
                    break;
                case "2":
                case "Mostrar":
                case "mostrar":
                    System.out.println("Usted eligió la opción Mostrar\n");
                        p.peek();

                    break;
                case "3":
                case "Buscar":
                case "buscar":
                    System.out.println("Usted eligió la opción Buscar\n¿Que posición desea buscar?");
                    int pos = sc.nextInt();
                    System.out.println("Valor encontrado en la posición: "+p.Cima(pos));


                    break;
                case "4":
                case "Eliminar":
                case "eliminar":
                    p.pop();
                    System.out.println("Usted eligio la opción Eliminar\n");

                    break;
                case "5":
                case "Contar":
                case "contar":
                    System.out.println("Usted eligió la opción Contar\n");
                    System.out.println("La lista contiene "+p.Tamaño()+" elementos");


                    break;
                case "6":
                    System.out.println("El valor mayor es: ");
                    p.dato();

                    break;
                case "7":
                case "Terminar":
                case "terminar":
                    System.out.println("Usted eligio la opción Terminar\n\nAdios ...! vuelva pronto XD");
                    //Si se elije la opción terminar el ciclo parara, esto lo logramos poniendo la variable seguir como false.
                    seguir=false;
            }
        }
    }
}
