/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SantiagoL;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class ClasesGrupales {

    private String yoga;
    private String piltares;
    private String funcionales;
    private String zumba;
    private int i = 0;
    private int j = 0;
    private int opcion = 0;

    public ClasesGrupales() {
    }

    public ClasesGrupales(String yoga, String piltares, String funcionales, String zumba) {
        this.yoga = yoga;
        this.piltares = piltares;
        this.funcionales = funcionales;
        this.zumba = zumba;
    }

    public void menuClasesGrupales() { //Funcion de menu de claes grupales
        JOptionPane.showMessageDialog(null, "Bienvenido al menu de clases grupales");
        JOptionPane.showMessageDialog(null, "A continuación se le pedira que ingrese un número para accesar a la funcion que desee del menú");

        do {
            JOptionPane.showMessageDialog(null, //Muestra al usuario las opciones
                    "Menu de opciones:\n"
                    + "Opcion #1: Reservar/liberar espacio de las clases\n"
                    + "Opcion #2: Mostrar clases disponibles con sus cupos\n"
                    + "Opcion #3: Modificar clases existentes\n"
                    + "Opcion #4: Agregregar nueva clase\n"
                    + "Opcion #5: Salir del menú de opciones");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion a la que desea ingresar:")); //Pide ingresar la opcion

            switch (opcion) { //Switch para elegir opcion
                case 1:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 3");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 4");
                    break;
                case 5:
                   JOptionPane.showMessageDialog(null, "Saliendo del menú de clases grupales");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, ingrese una opcion correcta");
            }
        } while (opcion != 5);
    }

}
