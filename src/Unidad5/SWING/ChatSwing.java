package Unidad5.SWING;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;


public class ChatSwing extends JFrame {
    private JTextField tfAlias;
    private JTextField tfMensaje;
    private JButton bLogin;
    private JButton bCerrarSesion;
    private JButton bEnviar;
    private JList lstMensajes;
    private Border borde;


    public ChatSwing() {
        super("Ventana de chat");
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        // Definir el tipo de borde de los paneles
        borde = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        // Panel del norte
        JPanel pNorte = crearPanelNorte();
        add(pNorte, BorderLayout.NORTH);
        // Panel centro
        JPanel pCentro = crearPanelCentro();
        add(pCentro, BorderLayout.CENTER);
        // Panel sur
        JPanel pSur = crearPanelSur();
        add(pSur, BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
    }

    private JPanel crearPanelNorte(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        TitledBorder bordeInterno = BorderFactory.createTitledBorder(borde,"Alias: ");
        panel.setBorder(bordeInterno);

        tfAlias = new JTextField(10);
        panel.add(tfAlias);
        bLogin = new JButton("Login");
        panel.add(bLogin);
        bCerrarSesion = new JButton("Cerrar Sesion");
        panel.add(bCerrarSesion);
        return panel;
    }

    private JPanel crearPanelCentro(){
        JPanel panel = new JPanel(new BorderLayout());
        TitledBorder bordeInterno = BorderFactory.createTitledBorder(borde,"Conversacion: ");
        panel.setBorder(bordeInterno);
        lstMensajes = new JList();
        panel.add(lstMensajes, BorderLayout.CENTER);

        return panel;
    }

    private JPanel crearPanelSur(){
        JPanel panel = new JPanel(new BorderLayout());
        TitledBorder bordeInterno = BorderFactory.createTitledBorder(borde,"Mensaje: ");
        panel.setBorder(bordeInterno);
        tfMensaje = new JTextField();
        panel.add(tfMensaje, BorderLayout.CENTER);
        bEnviar = new JButton("Enviar");
        panel.add(bEnviar,BorderLayout.EAST);

        return panel;
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        new ChatSwing();
    }
}
