/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1;

public class MenuGourmetFactory implements MenuFactory {

    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoGourmet();
    }

    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    public Postre crearPostre() {
        return new PostreGourmet();
    }
}
