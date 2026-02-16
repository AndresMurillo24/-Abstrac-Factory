/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1;

import java.util.Scanner;

public class Consumidor {

    private Entrada entrada;
    private PlatoPrincipal plato;
    private Bebida bebida;
    private Postre postre;

    public void generarMenu(MenuFactory factory) {

        entrada = factory.crearEntrada();
        plato = factory.crearPlatoPrincipal();
        bebida = factory.crearBebida();
        postre = factory.crearPostre();
    }

    public void consumirEntrada() {
        System.out.println("Consumiento entrada: " + entrada.descripcion());
    }

    public void consumirPlato() {
        System.out.println("Consumiento plato principal: " + plato.descripcion());
    }

    public void consumirBebida() {
        System.out.println("Consumiento bebida: " + bebida.descripcion());
    }

    public void consumirPostre() {
        System.out.println("Consumiento postre: " + postre.descripcion());
    }
}
