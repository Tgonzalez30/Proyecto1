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
public class Listamedicamentos {
    
    private Listapacientes varListapacientes;
    
     LinkedList<String>listamedicinapacientes = new LinkedList();
     
    
     public void introducirmedicamentos(LinkedList<String>listamedicinapacientes, Scanner entrada){
         
         this.varListapacientes= new Listapacientes();
        System.out.println("Ingresa los datos");
        listamedicinapacientes.push(entrada.next());
    }
     public void imprimirlistamedicamentos(LinkedList<String>listamedicinapacientes){
         this.varListapacientes= new Listapacientes();
         System.out.println("Lista medicamentos\n" + listamedicinapacientes );
     }
     
     public void borrarmedicamentos(LinkedList<String> listamedicinapacientes,Scanner entrada){
        String nombre;
        System.out.println("Introduce el medicamento a eliminar: ");
        nombre = entrada.next();
        if(listamedicinapacientes.contains(nombre)){
            listamedicinapacientes.remove(nombre);
            System.out.println("El medicamento: "+nombre+ "   fue eliminado");
            
        }else{
            System.out.println("El nombre no se encuentra en la lista");
        }
        
    }
    
}
