package ejecutor;
import javax.swing.JOptionPane;
import modelo.MiString;

public class ejecuta {
    
    
    public static void main(String[] args) {
        MiString ms = new MiString(JOptionPane.showInputDialog("ingrese wea "));
        
        ms.esPalindroma1();
        
    }
}
