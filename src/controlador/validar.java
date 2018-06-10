package controlador;

import javax.swing.JOptionPane;

public class validar {
    public int pedirNumero(String msg){
        int a=0;
        boolean esNumerico=false;
        do{
            try{
                a=Integer.parseInt(JOptionPane.showInputDialog(msg));
                esNumerico=true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Solo se debe ingresar un numero entero no muy grande "+e);
                esNumerico=false;
            }
        }while(!esNumerico);//esNumerico!=true
        return a;
    }
    
    public double pedirNumeroDouble(String msg){
        double a=0;
        boolean esNumerico=false;
        do{
            try{
                a=Double.parseDouble(JOptionPane.showInputDialog(msg));
                esNumerico=true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Solo se debe ingresar un numero entero no muy grande "+e);
                esNumerico=false;
            }
        }while(!esNumerico);//esNumerico!=true
        return a;
    }
}
