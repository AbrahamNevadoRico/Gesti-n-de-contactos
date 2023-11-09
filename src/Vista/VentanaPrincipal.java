package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

//Esta clase se va a encargar de mostrar todos los contactos y los tres botones principales.
public class VentanaPrincipal extends JFrame {
//Creamos todos los elementos que necesitamos
    JLabel icono;
    JTable table;
    JButton botonAdd, botonModify, botonDelete;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;

    public VentanaPrincipal(){
        setBounds(100,100,790,790);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        inicializarVariables();
        setVisible(true);
    }
//Generamos los getters para poder trabajar sobre estos objetos en otras clases
    public JLabel getIcono() {
        return icono;
    }

    public JTable getTable() {
        return table;
    }

    public JButton getBotonAdd() {
        return botonAdd;
    }

    public JButton getBotonDelete() {
        return botonDelete;
    }

    public JButton getBotonModify() {
        return botonModify;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    private void inicializarVariables(){
        icono = new JLabel();
        icono.setIcon(new ImageIcon("logo.png"));
        icono.setBounds(294,33,192,183);
        add(icono);

        botonAdd = new JButton("Añadir");
        botonAdd.setBounds(99,469,100,40);
        add(botonAdd);

        botonModify = new JButton("Modificar");
        botonModify.setBounds(199,469,100,40);
        add(botonModify);

        botonDelete = new JButton("Eliminar");
        botonDelete.setBounds(299,469,100,40);
        add(botonDelete);

        String[] nombreColumnas = {"Nombre", "Teléfono"};
        tableModel = new DefaultTableModel(nombreColumnas,0);

        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(433,318,258,200);
        add(scrollPane);
    }
}
