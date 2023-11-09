package Vista;

import javax.swing.*;

//Está ventana se encargará de añadir los contactos que el usuario ingrese.
public class VentanaAdd extends JFrame{
    JLabel icono; //Mostrar icono??
    JTextField nombre;
    JTextField telefono;
    JButton botonOk, botonCancel;

    public VentanaAdd(){
        setBounds(100,100,790,790);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        inicializarVariables();
        setVisible(true);
    }

    private void inicializarVariables(){
        nombre = new JTextField("Nombre");
        nombre.setBounds(99,390,192,21);
        add(nombre);

        telefono = new JTextField("Teléfono");
        telefono.setBounds(99,415,192,21);
        add(telefono);
    }

    public JLabel getIcono() {
        return icono;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public JTextField getTelefono() {
        return telefono;
    }

    public JButton getBotonOk() {
        return botonOk;
    }

    public JButton getBotonCancel() {
        return botonCancel;
    }
}
