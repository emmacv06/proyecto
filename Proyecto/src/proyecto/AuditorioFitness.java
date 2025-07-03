/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author emmac
 */
public class AuditorioFitness {

    private String[] participantes10am = new String[30];
    private String[] participantes3pm = new String[30];
    private int contador10am = 0;
    private int contador3pm = 0;

    public boolean inscribir(String idSocio, String horario) {
    if (horario.equals("10am") && contador10am < 30) {
        participantes10am[contador10am++] = idSocio;
        return true;
    } else if (horario.equals("3pm") && contador3pm < 30) {
        participantes3pm[contador3pm++] = idSocio;
        return true;
    }
    return false;
}
    public void mostrarParticipantes() {
    System.out.println("Participantes 10am:");
    for (int i = 0; i < contador10am; i++) {
        System.out.println("- " + participantes10am[i]);
    }
}
}
