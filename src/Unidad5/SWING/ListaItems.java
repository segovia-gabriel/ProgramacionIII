package Unidad5.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ListaItems extends JFrame {
    private JButton bAgregar;
    private JTextField tfItem;
    private List lista;

    public ListaItems(){
        super("Lista items");

        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        JPanel pNorte = crearPanelNorte();
        contenedor.add(pNorte, BorderLayout.NORTH);

        lista = new List();
        contenedor.add(lista, BorderLayout.CENTER);

        //Configurar los listeners de eventos
        bAgregar.addActionListener(new EscuchadorAgregar());
        tfItem.addActionListener(new EscuchadorAgregar());
        lista.addActionListener(new EscuchadorDobleClick());
        this.addWindowListener(new EscuchadorVentana());

        setSize(300,300);
        setVisible(true);

        tfItem.requestFocus();

    }

    private JPanel crearPanelNorte(){
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new Label("Item:"));
        tfItem = new JTextField();
        panel.add(tfItem, BorderLayout.CENTER);
        bAgregar = new JButton("Agregar");
        panel.add(bAgregar,BorderLayout.EAST);
        return panel;
    }
    class EscuchadorAgregar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. Leer el texto ingresado
            String item = tfItem.getText();
            // 2. Agregarlo a la lista
            lista.add(item);
            // 3. Eliminar el texto del campo y darle el foco
            tfItem.selectAll();
            tfItem.requestFocus();
        }
    }
    class EscuchadorVentana implements WindowListener {

        @Override
        public void windowOpened(WindowEvent windowEvent) {

        }

        @Override
        public void windowClosing(WindowEvent windowEvent) {
            // 1) Ocultar la ventana
            System.out.println("Ocultando");
            setVisible(false);
            // 2) Liberarla con el metodo dispose
            System.out.println("Liberando");
            dispose();
            // 3) Finalizar la ejecucion con System.exit
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent windowEvent) {

        }

        @Override
        public void windowIconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeiconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowActivated(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeactivated(WindowEvent windowEvent) {

        }
    }

    class EscuchadorDobleClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            // Leer la posicion del item seleccionado
            int indice = lista.getSelectedIndex();
            // Configurar el item seleccionado
            tfItem.setText(lista.getSelectedItem());
            // Eliminar item de la lista
            lista.remove(indice);
            tfItem.selectAll();
            tfItem.requestFocus();
        }
    }
    public static void main(String[] args) {
        new ListaItems();
    }
}
