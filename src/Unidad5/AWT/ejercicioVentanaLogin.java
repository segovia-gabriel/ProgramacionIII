package Unidad5.AWT;

import java.awt.*;

public class ejercicioVentanaLogin extends Frame {
    private Button bAceptar;
    private Button bSalir;
    private TextField tfNombre;
    private TextField tfContrasenia;

    public ejercicioVentanaLogin(){
        super("Login");
        setLayout(new BorderLayout(10,10)); //hgap y vgap, es el espacio entre paneles.
        //Panel Norte
        Panel pNorte = crearPanelNorte();
        add(pNorte,BorderLayout.CENTER);
        //Panel Sur
        Panel pSur = crearPanelSur();
        add(pSur,BorderLayout.SOUTH);

        setSize(350,180);
        setLocationRelativeTo(null); //Lo que hace esta linea, es que al ejecutar el programa, este se centre en la pantalla.
        setVisible(true);
    }

    private Panel crearPanelNorte(){
        Panel panel = new Panel(new GridLayout(2,2,10,10));
        panel.add(new Label("Nombre: "));
        tfNombre = new TextField(15);
        panel.add(tfNombre,BorderLayout.NORTH);
        panel.add(new Label("Contraseña: "));
        tfContrasenia = new TextField(15);
        panel.add(tfContrasenia,BorderLayout.SOUTH);
        return panel;
    }

    private Panel crearPanelSur(){
        Panel panel = new Panel(new FlowLayout(FlowLayout.RIGHT,10,10));
        bAceptar = new Button("Aceptar");
        panel.add(bAceptar);
        bSalir = new Button("Salir");
        panel.add(bSalir);
        return panel;
    }

    public static void main(String[] args) {new ejercicioVentanaLogin();}

}
