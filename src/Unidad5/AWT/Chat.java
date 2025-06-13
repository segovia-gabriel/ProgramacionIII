package Unidad5.AWT;

import org.w3c.dom.Text;

import javax.swing.border.Border;
import java.awt.*;

public class Chat extends Frame {
    private TextField tfAlias;
    private TextField tfMensaje;
    private Button bLogin;
    private Button bCerrarSesion;
    private Button bEnviar;
    private List lstMensajes;


    public Chat() {
        super("Ventana de chat");
        setLayout(new BorderLayout());
        // Panel del norte
        Panel pNorte = crearPanelNorte();
        add(pNorte, BorderLayout.NORTH);
        // Panel centro
        Panel pCentro = crearPanelCentro();
        add(pCentro, BorderLayout.CENTER);
        // Panel sur
        Panel pSur = crearPanelSur();
        add(pSur, BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
    }

    private Panel crearPanelNorte(){
        Panel panel = new Panel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new Label("Alias: "));
        tfAlias = new TextField(10);
        panel.add(tfAlias);
        bLogin = new Button("Login");
        panel.add(bLogin);
        bCerrarSesion = new Button("Cerrar Sesion");
        panel.add(bCerrarSesion);
        return panel;
    }

    private Panel crearPanelCentro(){
        Panel panel = new Panel(new BorderLayout());
        panel.add(new Label("Conversacion: "),BorderLayout.NORTH);
        lstMensajes = new List();
        panel.add(lstMensajes, BorderLayout.CENTER);

        return panel;
    }

    private Panel crearPanelSur(){
        Panel panel = new Panel(new BorderLayout());
        panel.add(new Label("Mensaje: "), BorderLayout.WEST);
        tfMensaje = new TextField();
        panel.add(tfMensaje, BorderLayout.CENTER);
        bEnviar = new Button("Enviar");
        panel.add(bEnviar,BorderLayout.EAST);

        return panel;
    }

    public static void main(String[] args) {
        new Chat();
    }
}
