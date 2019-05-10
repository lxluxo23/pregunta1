package modelo;

import javax.swing.JOptionPane;

public class MiString {


private String frase;

public MiString (String frase){
    this.frase=frase;
}

public boolean esPalindroma1(){
    Pila p1 = new Pila();
    //Pila p2 = new Pila;
    
    
         
         StringBuilder builder=new StringBuilder(frase);
         String invertida=builder.reverse().toString();
         
         if (frase.equals(invertida)){
             System.out.println("es palindroma ");
             return true;
         }
         
         System.out.println("no es palindroma");
         return false;
         
        
    
   
}


}
