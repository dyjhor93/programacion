package controlador;
import javax.swing.JOptionPane;
import modelo.Persona;
public class Inicio {
    public static validar validador = new validar();
    public static void main(String[] args) {
        int tam=validador.pedirNumero("Ingrese el tamaño del vector de objetos");
        Persona[] objPersona = new Persona[tam];
        int edad;
        double doc;
        String nomb;
        for(int i=0;i<tam;i++){
            //objPersona[i].setEdad(validador.pedirNumero("Ingrese edad:"));
            objPersona[i]=new Persona(validador.pedirNumero("Ingrese edad:"),JOptionPane.showInputDialog("Ingrese nombre:"),validador.pedirNumeroDouble("Ingrese documento:"));
            
        }
        
        
    }

}
