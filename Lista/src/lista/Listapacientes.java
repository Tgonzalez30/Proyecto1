/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author tamar
 */
public class Listapacientes {
    
    private Listamedicamentos varListamedicamentos;
    
    LinkedList<String>listapacientes = new LinkedList();

    public void introducirpacientes(LinkedList<String> listapacientes, LinkedList<String> listamedicinapacientes,Scanner entrada) {

        this.varListamedicamentos= new Listamedicamentos();
        System.out.println("Ingresa el paciente");

        listapacientes.push(entrada.next());
        
        int opcion = 0;

        System.out.println("Desea ingresar medicamentos al paciente");
        System.out.println("1-si");
        System.out.println("2-no");
        opcion = entrada.nextInt();
        
        if (opcion == 1) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Ingrese medicamento");
                listamedicinapacientes.push(entrada.next());
                System.out.println("¿Quiere ingresar mas medicamentos?");
                System.out.println("1-si");
                System.out.println("2-no");
                opcion = entrada.nextInt();
                if (opcion == 2) {
                    break;
                }
            }
        }
    }
    public void imprimirlistapacientes(LinkedList<String> listapacientes) {

        System.out.println(listapacientes + "Lista pacientes");
    }

    public void buscarpacientes(LinkedList<String> listapacientes, LinkedList<String> listamedicinapacientes, Scanner entrada) {
        this.varListamedicamentos= new Listamedicamentos();
        String nombre;
        nombre = entrada.next();
        System.out.println("Introduce el paciente a buscar");
        if (listapacientes.contains(nombre)) {
            System.out.println("El nombre: " + nombre + "  estos son sus medicamentos : " + listamedicinapacientes 
            + "\nLa cantidad de medicamentos es ; "+listamedicinapacientes.size());

        } else {
            System.out.println("El dato no se encuentra en la lista");
        }
    } 
}
    
