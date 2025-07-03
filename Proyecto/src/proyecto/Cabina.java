/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author emmac
 */
public class Cabina {

    private int numero;
    private Estado[] horarios = new Estado[9]; // 9 am - 6 pm
    private String[] reservas = new String[9]; // ID del socio

    public Cabina(int numero) {
        this.numero = numero;
        for (int i = 0; i < horarios.length; i++) {
            horarios[i] = Estado.LIBRE;
            reservas[i] = "";
        }
    }

    public boolean reservarHora(int hora, String idSocio) {
        int index = hora - 9;
        if (index >= 0 && index < horarios.length && horarios[index] == Estado.LIBRE) {
            horarios[index] = Estado.RESERVADO;
            reservas[index] = idSocio;
            return true;
        }
        return false;
    }

    public void mostrarHorarios() {
        System.out.println("Cabina " + numero + " - Horarios:");
        for (int i = 0; i < horarios.length; i++) {
            System.out.println((i + 9) + ":00 - " + horarios[i]);
        }
    }

    
    
}
