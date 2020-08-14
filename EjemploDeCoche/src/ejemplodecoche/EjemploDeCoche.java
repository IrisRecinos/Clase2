/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodecoche;

/**
 *
 * @author iris recinos
 */
public class EjemploDeCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Coche micarro = new Coche("Nissan",1998,"verde");
     Coche tucarro =new  Coche ("Rav", 2012,"azul");
      Coche tercercarro =new  Coche ("Toyota", 2016,"Rojo",5);
     
     System.out.println(micarro.toString());
//     podemos cambiar mi carro por tu carro o por tercer carro y luego ejecutarlo
     
     
     
    }
    
}
