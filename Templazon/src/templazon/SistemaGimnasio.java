/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templazon;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Santi
 */
public class SistemaGimnasio {

    SalaDePesas registro1 = new SalaDePesas();
    Socio[] socios = {
        new Socio(0, "Hector", true),
        new Socio(1, "Santi", false),
        new Socio(2, "Emanuel", true),
        new Socio(3, "Ariel", true)

    };
    ArrayList<Reserva> reservas = new ArrayList<>();
    Parqueo parqueo = new Parqueo();
    int auditorio = 0;
    final int MAX_AUDITORIO = 50;

    public void menuPrincipal() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú Principal\n"
                    + "1. Reservar clase/parqueo\n"
                    + "2. Reserva por hora de cabina\n"
                    + "3. Ver espacios del parqueo\n"
                    + "4. Control de sala de pesas\n"
                    + "5. Control de auditorio\n"
                    + "6. Liberar reserva\n"
                    + "7. Ver reservas parqueo y clase\n"
                    + "8. Ver reservas cabina\n"
                    + "9. Auditorio\n"
                    + "10. Salir"
            ));

            switch (opcion) {
                case 1:
                    hacerReserva();
                    break;
                case 2:
                    ReservarHora(opcion);
                    break;
                case 3:
                    parqueo.verParque();
                    break;
                case 4:
                    registro1.registro();
                    break;
                case 5:
                    controlAuditorio();
                    break;
                case 6:
                    liberarReserva();
                    break;
                case 7:
                    verReservas();
                    break;
                case 8:
                    ReservarHora(opcion);
                    break;
                case 9:
                    iniciar();
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                default:;
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 7);
    }

    void hacerReserva() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del socio (0 a 4):"));
        if (id < 0 || id >= socios.length || !socios[id].membresiaActiva) {
            JOptionPane.showMessageDialog(null, "ID inválido o membresía inactiva");
            return;
        }

        String act = JOptionPane.showInputDialog("Actividad a reservar (Clase / Parque):");
        if (act.equalsIgnoreCase("parque")) {
            parqueo.reservarEspacio(id, socios[id].nombre);
        }
        if (act.equalsIgnoreCase("clase")) {
            JOptionPane.showMessageDialog(null, "Reserva realizada");
        }
        reservas.add(new Reserva(id, act, socios[id].nombre));
        JOptionPane.showMessageDialog(null, "Reserva realizada");
    }

    void controlAuditorio() {
        String opcion = JOptionPane.showInputDialog("1. Ingreso\n2. Salida\nActual: " + auditorio);
        if (opcion.equals("1") && auditorio < MAX_AUDITORIO) {
            auditorio++;
            JOptionPane.showMessageDialog(null, "Ingreso permitido");
        } else if (opcion.equals("2") && auditorio > 0) {
            auditorio--;
            JOptionPane.showMessageDialog(null, "Salida registrada");
        } else {
            JOptionPane.showMessageDialog(null, "No permitido");
        }
    }

    void liberarReserva() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID del socio para liberar:"));
        reservas.removeIf(r -> r.idSocio == id);
        JOptionPane.showMessageDialog(null, "Reservas liberadas para ID " + id);
    }

    void verReservas() {
        StringBuilder lista = new StringBuilder("Reservas:\n");
        for (Reserva r : reservas) {
            lista.append(r.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    Cabina c1 = new Cabina(1);

    void ReservarHora(int opcion) {
        String continuar = "1";

        System.out.print(opcion);
        if (opcion == 2) {
            while (continuar.equals("1")) {

                String horaTexto = JOptionPane.showInputDialog("que hora reservas?");
                int hora = Integer.parseInt(horaTexto);
                c1.reservarHora(hora, "ID001");
                c1.mostrarHorarios();

                continuar = JOptionPane.showInputDialog("Si desea otra reserva digite 1");
            }

        } else {

            c1.mostrarHorarios();
        }
    }

    void iniciar() {
        SistemaAuditorio auditorio1 = new SistemaAuditorio();
        auditorio1.iniciar();
        JOptionPane.showMessageDialog(null, auditorio1.toString());
    }

    }

