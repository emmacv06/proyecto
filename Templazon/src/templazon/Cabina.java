/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templazon;

import javax.swing.JOptionPane;

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
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Cabina ").append(numero).append(" - Horarios:\n");
        for (int i = 0; i < horarios.length; i++) {
            mensaje.append((i + 9)).append(":00 - ").append(horarios[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
