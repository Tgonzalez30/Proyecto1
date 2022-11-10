/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author tamar
 */
public class MenuApp {

    private Listapacientes varListapacientes;
    private Listamedicamentos varListamedicamentos;

    public void MostrarMenu() {

        this.varListapacientes = new Listapacientes();
        this.varListamedicamentos = new Listamedicamentos();

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1-Agregar paciente");
            System.out.println("2-Agregar medicamento");
            System.out.println("3-Asignar medicamentos a pacientes");
            System.out.println("4-Consultar pacientes");
            System.out.println("5-Consultar paciente especifico");
            System.out.println("6-Consultar medicamentos");
            System.out.println("7-Borrar medicamentos");
            System.out.println("8-Reporte de pacientes sin medicamentos");
            System.out.println("9-SALIR.");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Estas introduciendo pacientes");

                    this.varListapacientes.introducirpacientes(this.varListapacientes.listapacientes,
                            this.varListamedicamentos.listamedicinapacientes, entrada);

                    break;
                case 2:
                    System.out.println("Estas introduciendo medicamentos");
                    this.varListamedicamentos.introducirmedicamentos(this.varListamedicamentos.listamedicinapacientes, entrada);

                    break;
                case 3:

                    System.out.println("Estas asignando medicamentos");
                    break;

                case 4:

                    System.out.println("Estas consultando la lista de pacientes");
                    this.varListapacientes.imprimirlistapacientes(this.varListapacientes.listapacientes);
                    break;

                case 5:

                    System.out.println("Estas consultando al paciente: ");
                    this.varListapacientes.buscarpacientes(this.varListapacientes.listapacientes,
                             this.varListamedicamentos.listamedicinapacientes, entrada);
                    break;

                case 6:
                    System.out.println("Estas consultando la lista de medicamentos");
                    this.varListamedicamentos.imprimirlistamedicamentos(this.varListamedicamentos.listamedicinapacientes);
                    break;

                case 7:
                    System.out.println("Estas borrando medicamentos");
                    this.varListamedicamentos.borrarmedicamentos(this.varListamedicamentos.listamedicinapacientes, entrada);
                    break;

                case 8:
                    System.out.println("Estas consultando la lista de pacientes sin medicamentos");
                    break;

                case 9:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 9);
    }
}
