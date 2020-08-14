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
public class Coche {
    private String Marca;
    private int Año ;
    private String Color;
    private int NumPuertas;
    
//   A continuacion esta nuestro constructor del objeto
    
    public Coche(String pMarca,int pAño,String pColor ){ 
   
    Marca = pMarca;
    Año = pAño;
    Color= pColor;}
     
      
   
    

public Coche(String pMarca,int pAño,String pColor, int pNumPuertas  ) {
    Marca =pMarca;
    Año = pAño;
    Color= pColor;
    NumPuertas= pNumPuertas;
}

    @Override
    public String toString() {
        return "Coche{" + "Marca=" + Marca + ", A\u00f1o=" + Año + ", Color=" + Color + ", NumPuertas=" + NumPuertas + '}';
    }

    
    }




   
    
    



    
        
    

    
    
    
    
    

