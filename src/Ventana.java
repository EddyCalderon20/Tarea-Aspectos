

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener{
    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion
    private JButton boton1; 
    private JButton boton2; 
    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
    
        this.setTitle("Tarea Aspectos");                   // colocamos titulo a la ventana
        this.setSize(800, 510);  // colocamos tamanio a la ventana (ancho, alto)
        this.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        boton1 = new JButton();
        boton2 = new JButton();
        // configuramos los componentes
      //  texto.setText("");    // colocamos un texto a la etiqueta
      //  texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
       // caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Amarillo");   // colocamos un texto al boton
        boton.setBounds(50, 100, 105, 30); // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this); 
        boton1.setText("Azul");   // colocamos un texto al boton
        boton1.setBounds(200, 100, 75, 30);
        boton2.addActionListener(this); 
        boton2.setText("Rojo");   // colocamos un texto al boton
        boton2.setBounds(335, 100, 75, 30);
        boton2.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        //this.add(texto);
        //this.add(caja);
        this.add(boton1);
        this.add(boton);
        this.add(boton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
     //   JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
        this.setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
