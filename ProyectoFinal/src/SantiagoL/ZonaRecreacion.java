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
public class ZonaRecreacion {

    private String mesaPingPong;
    private String mesaBillar;
    private int canchaFutbol = 2;
    private int canchaTennis = 2;
    private int opcion = 0;
    private int opcionReserva=0;
    private EstadoZonaRecreacion estadoPingPong;
    private EstadoZonaRecreacion estadoBillar;
    private EstadoZonaRecreacion estadoCanchaFutbol;
    private EstadoZonaRecreacion estadoCanchaTennis;

    public ZonaRecreacion(){
    }

    public ZonaRecreacion(String mesaPingPong, String mesaBillar, EstadoZonaRecreacion estadoPingPong, EstadoZonaRecreacion estadoBillar, EstadoZonaRecreacion estadoCanchaFutbol, EstadoZonaRecreacion estadoCanchaTennis) {
        this.mesaPingPong = mesaPingPong;
        this.mesaBillar = mesaBillar;
        this.estadoPingPong = estadoPingPong;
        this.estadoBillar = estadoBillar;
        this.estadoCanchaFutbol = estadoCanchaFutbol;
        this.estadoCanchaTennis = estadoCanchaTennis;
    }

    public String getMesaPingPong() {
        return mesaPingPong;
    }

    public void setMesaPingPong(String mesaPingPong) {
        this.mesaPingPong = mesaPingPong;
    }

    public String getMesaBillar() {
        return mesaBillar;
    }

    public void setMesaBillar(String mesaBillar) {
        this.mesaBillar = mesaBillar;
    }

    public int getCanchaFutbol() {
        return canchaFutbol;
    }

    public void setCanchaFutbol(int canchaFutbol) {
        this.canchaFutbol = canchaFutbol;
    }

    public int getCanchaTennis() {
        return canchaTennis;
    }

    public void setCanchaTennis(int canchaTennis) {
        this.canchaTennis = canchaTennis;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcionReserva() {
        return opcionReserva;
    }

    public void setOpcionReserva(int opcionReserva) {
        this.opcionReserva = opcionReserva;
    }

    public EstadoZonaRecreacion getEstadoPingPong() {
        return estadoPingPong;
    }

    public void setEstadoPingPong(EstadoZonaRecreacion estadoPingPong) {
        this.estadoPingPong = estadoPingPong;
    }

    public EstadoZonaRecreacion getEstadoBillar() {
        return estadoBillar;
    }

    public void setEstadoBillar(EstadoZonaRecreacion estadoBillar) {
        this.estadoBillar = estadoBillar;
    }

    public EstadoZonaRecreacion getEstadoCanchaFutbol() {
        return estadoCanchaFutbol;
    }

    public void setEstadoCanchaFutbol(EstadoZonaRecreacion estadoCanchaFutbol) {
        this.estadoCanchaFutbol = estadoCanchaFutbol;
    }

    public EstadoZonaRecreacion getEstadoCanchaTennis() {
        return estadoCanchaTennis;
    }

    public void setEstadoCanchaTennis(EstadoZonaRecreacion estadoCanchaTennis) {
        this.estadoCanchaTennis = estadoCanchaTennis;
    }
    
    
    

    public void menuZonaDeRecreacion() {
        JOptionPane.showMessageDialog(null, "Bienvenido al menu de Zona de Recreación");
        JOptionPane.showMessageDialog(null, "A continuación se le pedira que ingrese un número para accesar a la funcion que desee del menú");

        do {
            JOptionPane.showMessageDialog(null, //Muestra al usuario las opciones
                    "Menu de opciones:\n"
                    + "Opcion #1: Reservar/liberar mesa de Billar\n"
                    + "Opcion #2: Reservar/liberar mesa de Ping Pong\n"
                    + "Opcion #3: Reservar/liberar cancha de Fútbol\n"
                    + "Opcion #4: Resevar/liberar cancha de Tennis\n"
                    + "Opcion #5: Ver disponibilidad\n"
                    + "Opcion #6: Salir del meno de Zona de Recreación");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion a la que desea ingresar:")); //Pide ingresar la opcion

            switch (opcion) { //Switch para elegir opcion
                case 1:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 1");
                    JOptionPane.showMessageDialog(null, 
                            "Digite 1 para reservar \n"
                            +"Digite 2 para liberar");
                    opcionReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion a la que desea ingresar:"));
                    switch (opcionReserva){
                        case 1:
                            estadoBillar=EstadoZonaRecreacion.Disponible;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoBillar);
                            break;
                        case 2:
                            estadoBillar=EstadoZonaRecreacion.Reservado;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoBillar);
                            break;
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 2");
                    JOptionPane.showMessageDialog(null, 
                            "Digite 1 para reservar \n"
                            +"Digite 2 para liberar");
                    opcionReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion a la que desea ingresar:"));
                    switch (opcionReserva){
                        case 1:
                            estadoPingPong=EstadoZonaRecreacion.Disponible;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoPingPong);
                            break;
                        case 2:
                            estadoBillar=EstadoZonaRecreacion.Reservado;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoPingPong);
                            break;
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 3");
                    JOptionPane.showMessageDialog(null, 
                            "Digite 1 para reservar \n"
                            +"Digite 2 para liberar");
                    opcionReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion a la que desea ingresar:"));
                    switch (opcionReserva){
                        case 1:
                            estadoCanchaFutbol=EstadoZonaRecreacion.Disponible;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoCanchaFutbol);
                            break;
                        case 2:
                            estadoCanchaFutbol=EstadoZonaRecreacion.Reservado;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoCanchaFutbol);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 4");
                    JOptionPane.showMessageDialog(null, 
                            "Digite 1 para reservar \n"
                            +"Digite 2 para liberar");
                    opcionReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion a la que desea ingresar:"));
                    switch (opcionReserva){
                        case 1:
                            estadoCanchaTennis=EstadoZonaRecreacion.Disponible;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoCanchaTennis);
                            break;
                        case 2:
                            estadoCanchaTennis=EstadoZonaRecreacion.Reservado;
                            JOptionPane.showMessageDialog(null, "Mesa de billar: "+estadoCanchaTennis);
                    }

                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 5");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Ha abierto la opcion 6");
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, ingrese una opcion correcta");
            }
        } while (opcion != 5);
    }
}