/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

/**
 *
 * @author emmac
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cabina c1 = new Cabina(1);
        c1.reservarHora(10, "ID001");
        c1.reservarHora(14, "ID002");
        c1.mostrarHorarios();

    }

}
