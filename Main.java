/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de menú:");
        System.out.println("1. Menú Saludable");
        System.out.println("2. Menú Vegetariano");
        System.out.println("3. Menú Gourmet");
        

        int opcion = sc.nextInt();

        MenuFactory factory = null;

        switch (opcion) {
            case 1:
    factory = new MenuSaludableFactory();
    break;
case 2:
    factory = new MenuVegetarianoFactory();
    break;
case 3:
    factory = new MenuGourmetFactory();
    break;

            default:
                System.out.println("Opción no válida");
                return;
        }

        Consumidor consumidor = new Consumidor();
        consumidor.generarMenu(factory);

        System.out.println("\n¿Qué desea consumir?");
        System.out.println("1. Entrada");
        System.out.println("2. Plato principal");
        System.out.println("3. Bebida");
        System.out.println("4. Postre");
        System.out.println("5. Todo");

        int consumo = sc.nextInt();

        switch (consumo) {
            case 1:
                consumidor.consumirEntrada();
                break;
            case 2:
                consumidor.consumirPlato();
                break;
            case 3:
                consumidor.consumirBebida();
                break;
            case 4:
                consumidor.consumirPostre();
                break;
            case 5:
                consumidor.consumirEntrada();
                consumidor.consumirPlato();
                consumidor.consumirBebida();
                consumidor.consumirPostre();
                break;
            default:
                System.out.println("Opción no válida");
        }

        sc.close();
    }
}
