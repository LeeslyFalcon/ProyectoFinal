
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Sergio Chavez Castillo
 */
public class ColaDinamica {

    ArrayList<Object> cola = new ArrayList<Object>(); //Se crea ArrayList con un objeto dentro

    public void Push(String s) {//Se crea metodo push con viariable, el metodo add agregara lo que este en la variable
        cola.add(s);
    }

    public void Pop() {
        if (cola.isEmpty()) { //Evalua si la pila esta vacia
            JOptionPane.showMessageDialog(null, "La Cola esta vacia");
        } else {
            cola.remove(0);
        }

    }

    public String VerCola() {
        String p = "";
        for (int i = 0; i < cola.size(); i++) {
            p += cola.get(i) + "\n";

        }
        return p;
    }

    public int numItems() {
        return cola.size();

    }

    public String Empty() {
        String e = "";
        if (cola.isEmpty()) {
            e = "Esta vacia";
        } else {
            e = "No esta vacia";

        }
        return e;
    }

    public String Primero() {
        String u = "";
        if (cola.isEmpty()) {
            u = "";
        } else {
            u += cola.get(0);

        }
        return u;
    }

    public String Ultimo() {
        String u = "";
        if (cola.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay elementos");
        } else {
            u += cola.get(cola.size() - 1);

        }
        return u;
    }

    public void VaciarPila() {
        cola.clear();
    }

}
