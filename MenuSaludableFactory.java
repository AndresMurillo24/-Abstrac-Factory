/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1;

public class MenuSaludableFactory implements MenuFactory {

    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }

    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoSaludable();
    }

    public Bebida crearBebida() {
        return new BebidaSaludable();
    }

    public Postre crearPostre() {
        return new PostreSaludable();
    }
}
