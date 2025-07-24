/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templazon;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class SistemaGimnasio {

    SalaDePesas registro1 = new SalaDePesas();
    Socio[] socios = {
        new Socio(0, "Hector", true),
        new Socio(1, "Santi", true),
        new Socio(2, "Emanuel", true),
        new Socio(3, "Ariel", true)
    };

    Reserva[] reservas = new Reserva[100]; // arreglo tradicional
    int totalReservas = 0; // contador de reservas

    Parqueo parqueo = new Parqueo();
    int auditorio = 0;
    final int MAX_AUDITORIO = 50;
    
    GestorAuditorio Reserva1= new GestorAuditorio();

    public void menuPrincipal() {
        int opcionReserva;
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú Principal\n"
                    + "1. Reservar clase/parqueo\n"
                    + "2. Reserva por hora de cabina\n"
                    + "3. Control de sala de pesas\n"
                    + "4. Registrar en auditorio\n"
                    + "5. Liberar reserva\n"
                    + "6. Ver reservas\n"
                    + "7. Salir"
            ));

            switch (opcion) {
                case 1:
                    hacerReserva();
                    break;
                case 2:
                    ReservarHora(opcion);
                    break;

                case 3:
                    registro1.registro();
                    break;
                case 4:
                    Reserva1.inscribirParticipante();
                    break;
                case 5:
                    liberarReserva();
                    break;
                case 6:
                    opcionReserva=Integer.parseInt(JOptionPane.showInputDialog("Seleccione el area la cual desea ver el registro \n"+
                            "1.Ver parqueo \n"+
                            "2.Ver clases\n"+
                            "3.Ver Cabina\n"+
                            "4.Ver Auditorio"));
                    switch (opcionReserva) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Ha seleccionado la opcion de visualizar el parqueo");
                            parqueo.verParqueo();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Ha seleccionado la opcion de visualizar las clases");
                            verReservas();
                            break;
                        
                        case 3:
                            JOptionPane.showMessageDialog(null, "Ha seleccionado la opcion de visualizar las cabinas");
                            ReservarHora(opcion);
                        case 4:
                            JOptionPane.showMessageDialog(null, "Ha seleccionado la opcion de visualizar el Auditorio");
                            Reserva1.mostrarLista();
                            break;
                        default:
                            throw new AssertionError();
                        
                    }
                    break;      
                case 7:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
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

        if (totalReservas < reservas.length) {
            reservas[totalReservas++] = new Reserva(id, act, socios[id].nombre);
            JOptionPane.showMessageDialog(null, "Reserva realizada");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más reservas");
        }
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
        int j = 0;
        for (int i = 0; i < totalReservas; i++) {
            if (reservas[i].idSocio != id) {
                reservas[j++] = reservas[i];
            }
        }
        totalReservas = j;
        JOptionPane.showMessageDialog(null, "Reservas liberadas para ID " + id);
    }

    void verReservas() {
        StringBuilder lista = new StringBuilder("Reservas:\n");
        for (int i = 0; i < totalReservas; i++) {
            lista.append(reservas[i].toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    Cabina c1 = new Cabina(1);

    void ReservarHora(int opcion) {
        String continuar = "1";

        if (opcion == 2) {
            while (continuar.equals("1")) {
                String horaTexto = JOptionPane.showInputDialog("¿Qué hora reservas?");
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
