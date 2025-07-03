/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
       int max =50;
       int nUsuarios =0;
       int continuar;
       SalaDePesas User = new SalaDePesas();
       String opcion = JOptionPane.showInputDialog("Desea registrar su entrada? (Indique SI o NO)");
       while (!opcion.equalsIgnoreCase("SI")&&!opcion.equalsIgnoreCase("NO")){
           opcion = JOptionPane.showInputDialog("Porfavor indique con un si o no");
       }
        if (opcion.equalsIgnoreCase("SI")) {
            do {
           User.setUserID("Digite su ID para registrar su ingreso");
               nUsuarios++;
               continuar=JOptionPane.showConfirmDialog(null, "Desea registrar otro usuario", "continuar", JOptionPane.YES_NO_OPTION);
           } while (continuar == JOptionPane.YES_OPTION && nUsuarios<max );
        }
        else{
            if (opcion.equals("NO")){
                
            }
        }
    
    }
   
}
