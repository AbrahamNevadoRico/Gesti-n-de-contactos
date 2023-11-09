package Vista;

import javax.swing.*;

//Esta ventana se encargará de modificar el contacto seleccionado previamente por el usuario.
public class VentanaModify extends JFrame {

    JTextField nombre;
    JTextField telefono;
    JButton botonOk, botonCancel;

    public VentanaModify(){
        setBounds(100,100,790,790);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        inicializarVariables();
        setVisible(true);
    }

    private void inicializarVariables(){

    }
}
