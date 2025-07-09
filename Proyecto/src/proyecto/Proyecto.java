/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author emmac
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String continuar = "1";        
        Cabina c1 = new Cabina(1);

        while (continuar.equals("1")) {
        
        String horaTexto = JOptionPane.showInputDialog("que hora reservas?");
        int hora = Integer.parseInt(horaTexto);
        //Cabina c1 = new Cabina(1);
        c1.reservarHora(hora, "ID001");
        c1.mostrarHorarios();
        
        continuar = JOptionPane.showInputDialog("Si desea otra reserva digite 1");
        }
    }
}
