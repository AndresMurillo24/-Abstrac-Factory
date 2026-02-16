package Act1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de menú:");
        System.out.println("1. Saludable");
        System.out.println("2. Vegetariano");
        System.out.println("3. Gourmet");

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
        System.out.println("1. Solo Entrada");
        System.out.println("2. Solo Plato Principal");
        System.out.println("3. Solo Bebida");
        System.out.println("4. Solo Postre");
        System.out.println("5. Entrada + Plato");
        System.out.println("6. Entrada + Postre");
        System.out.println("7. Plato + Bebida");
        System.out.println("8. Bebida + Postre");
        System.out.println("9. Entrada + Plato + Bebida");
        System.out.println("10. Entrada + Plato + Postre");
        System.out.println("11. Plato + Bebida + Postre");
        System.out.println("12. Todo el menú");

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
                break;
            case 6:
                consumidor.consumirEntrada();
                consumidor.consumirPostre();
                break;
            case 7:
                consumidor.consumirPlato();
                consumidor.consumirBebida();
                break;
            case 8:
                consumidor.consumirBebida();
                consumidor.consumirPostre();
                break;
            case 9:
                consumidor.consumirEntrada();
                consumidor.consumirPlato();
                consumidor.consumirBebida();
                break;
            case 10:
                consumidor.consumirEntrada();
                consumidor.consumirPlato();
                consumidor.consumirPostre();
                break;
            case 11:
                consumidor.consumirPlato();
                consumidor.consumirBebida();
                consumidor.consumirPostre();
                break;
            case 12:
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
