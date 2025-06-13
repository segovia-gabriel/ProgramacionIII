package Unidad5.AWT;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;

public class Calculadora extends Frame{
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Button bDec, bMas, bMenos, bPor, bDiv, bIgual;
    private TextField tfDisplay;


    public Calculadora() {
        super();
        // Definir el layour principal
        setLayout(new BorderLayout());
        // En el norte ubicamos el display
        tfDisplay = new TextField();
        add(tfDisplay, BorderLayout.NORTH);
        // En el centro vamos a ubicar la botonera
        Panel pBotonera = crearBotonera();
        add(pBotonera, BorderLayout.CENTER);
        // Configurar la ventana
        pack();
        setVisible(true);
    }
        private Panel crearBotonera(){
            b0 = new Button("0");
            b1 = new Button("1");
            b2 = new Button("2");
            b3 = new Button("3");
            b4 = new Button("4");
            b5 = new Button("5");
            b6 = new Button("6");
            b7 = new Button("7");
            b8 = new Button("8");
            b9 = new Button("9");
            bDec = new Button(".");
            bMas = new Button("+");
            bMenos = new Button("-");
            bPor = new Button("*");
            bDiv = new Button("/");
            bIgual = new Button("=");
            // Instanciar un panel con un GridLayout de 4 x 4
         Panel pBotonera = new Panel(new GridLayout(4,4));
            // Agregar los botones al panel
            pBotonera.add(b7);
            pBotonera.add(b8);
            pBotonera.add(b9);
            pBotonera.add(bDiv);

            pBotonera.add(b4);
            pBotonera.add(b5);
            pBotonera.add(b6);
            pBotonera.add(bPor);

            pBotonera.add(b1);
            pBotonera.add(b2);
            pBotonera.add(b3);
            pBotonera.add(bMenos);

            pBotonera.add(bDec);
            pBotonera.add(b0);
            pBotonera.add(bIgual);
            pBotonera.add(bMas);

            return pBotonera;
        }

    public static void main(String[] args) {
        new Calculadora();
    }
}
