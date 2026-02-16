/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1;

public class MenuVegetarianoFactory implements MenuFactory {

    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }

    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoVegetariano();
    }

    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }

    public Postre crearPostre() {
        return new PostreVegetariano();
    }
}
