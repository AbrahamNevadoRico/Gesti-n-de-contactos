import Vista.VentanaAdd;
import Vista.VentanaModify;
import Vista.VentanaPrincipal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Aquí se ejecutaran todas las acciones del resto de clases
        VentanaPrincipal ventaprinc = new VentanaPrincipal();
        VentanaModify ventanaMod = new VentanaModify();
        VentanaAdd ventanaAdd = new VentanaAdd();
    }
}