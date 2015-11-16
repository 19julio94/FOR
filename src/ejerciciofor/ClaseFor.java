
package ejerciciofor;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class ClaseFor {
    
  
    public  float pedirNota(){
        
        String res=JOptionPane.showInputDialog("Introduce nota");
        float not=Float.parseFloat(res);
        return not;
    }
    
    public void notaMedia(){
        int i=0;
        float nota1, nota2, nota3;
        
        for(i=0;i<6;i++){
        nota1=pedirNota();
        nota2=pedirNota();
        nota3=pedirNota();
        JOptionPane.showMessageDialog(null, "A nota media e:"+(nota1+nota2+nota3)/3);

        
           
       }
        
    }
    
}
