package Unidad5.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ejercicioListadoCompras extends JFrame {
    private JButton bAgregar;
    private JButton bBuscar;
    private JButton bEliminar;
    private JList<String> lista;
    private DefaultListModel<String> modeloLista;
    private JTextField tfItem;

    public ejercicioListadoCompras(){
        super("Listado de Compras");
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        modeloLista = new DefaultListModel<>();
        lista = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(lista);
        contenedor.add(scrollPane, BorderLayout.NORTH);

        JPanel pCentro = crearPanelCentro();
        contenedor.add(pCentro, BorderLayout.CENTER);

        JPanel pSur = crearPanelSur();
        contenedor.add(pSur, BorderLayout.SOUTH);

        // Configurar los listeners de eventos
        bAgregar.addActionListener(new EscuchadorAgregar());
        bBuscar.addActionListener(new EscuchadorBuscar());
        bEliminar.addActionListener(new EscuchadorEliminar());
        lista.addMouseListener(new EscuchadorDobleClic());

        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel crearPanelCentro(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel("Item: "));
        tfItem = new JTextField(20);
        panel.add(tfItem);
        return panel;
    }

    private JPanel crearPanelSur(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
        bAgregar = new JButton("Agregar");
        bBuscar = new JButton("Buscar");
        bEliminar = new JButton("Eliminar");
        panel.add(bAgregar);
        panel.add(bBuscar);
        panel.add(bEliminar);

        return panel;
    }

    class EscuchadorAgregar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String item = tfItem.getText().trim();
            if(!item.isEmpty()){
                modeloLista.addElement(item);
                tfItem.setText(""); // Limpiamos el campo
            } else {
                JOptionPane.showMessageDialog(null, "El campo esta vacio, colocar algo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class EscuchadorBuscar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String itemBuscado = tfItem.getText().trim();
            if(!itemBuscado.isEmpty()){
                int indiceBuscado = modeloLista.indexOf(itemBuscado);
                if(indiceBuscado != -1){
                    JOptionPane.showMessageDialog(null,"El item " + itemBuscado + " fue encontrado en la posicion "
                     + (indiceBuscado+1) + ".","Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"El item no se encontro en la lista.", "Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(null,"Ingrese un item para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class EscuchadorEliminar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int indiceSeleccionado = lista.getSelectedIndex();
            if (indiceSeleccionado != -1){
                String itemSeleccionado = modeloLista.getElementAt(indiceSeleccionado);
                int confirmacion = JOptionPane.showConfirmDialog(null,"¿Queres eliminar el item seleccionado " + itemSeleccionado + " ?",
                        "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if(confirmacion == JOptionPane.YES_OPTION){
                    modeloLista.remove(indiceSeleccionado);}
                }else{
                JOptionPane.showMessageDialog(null,"Debe seleccionar un item de la lista para eliminar.",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class EscuchadorDobleClic implements MouseListener{ //Se ejecuta cada vez que haces clic

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2){ // Verifica que hayan sido dos clics seguidos.
                int indiceClic = lista.locationToIndex(e.getPoint()); // Detecta en que posicion de la lista se hizo clic.
                if(indiceClic != -1){
                    String itemSeleccionado = modeloLista.getElementAt(indiceClic);
                    tfItem.setText(itemSeleccionado); // escribe el item en el campo de texto
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {new ejercicioListadoCompras();}
}
