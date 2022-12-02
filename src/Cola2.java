
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carab
 */
public class Cola2 {

    ArrayList<Object> cola = new ArrayList<Object>(); //Se crea ArrayList 

    public void Pop() {
        if (cola.isEmpty()) { //Checa si la pila esta vacia
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        } else {
            cola.remove(0);
        }

    }

    public void Push(String dato) {//nos permite agregar algun valor, en este caso el valor dato
        cola.add(dato);
    }

    public String Ver()  {
        String mostrar = "";
        for (int i = 0; i < cola.size(); i++) { //con el for recorre la cola y lo agrega a la vairable mostrar
           if(i==0){    
           }
            mostrar += cola.get(i) + "\n";
        }

        return mostrar;
    }

    public String vacio() {
        String vacio = "";
        if (cola.isEmpty()) { //checa si esta vacia la cola
            vacio = "Esta vacia";
        } else {vacio = "No esta vacia";
        }
        
        return vacio;
    }


    public void limpiar() {
        cola.clear();
    }

}
