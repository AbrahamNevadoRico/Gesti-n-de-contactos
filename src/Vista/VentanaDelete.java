package Vista;

import javax.swing.*;

//En esta ventana elminaremos el contactos seleccionado.
public class VentanaDelete extends JFrame {

    //Este metoo no debería de crear ninguna ventana, solamente debe de eliminar el elemento seleccionado
    public VentanaDelete(){
        setBounds(100,100,790,790);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        inicializarVariables();
        setVisible(true);
    }


    private void inicializarVariables(){

    }
}
