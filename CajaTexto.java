import javax.swing.*;     //diseña
import java.awt.event.*;  //escucha y da funcionalidad

public class CajaTexto extends JFrame implements ActionListener{

    private JTextField cajatexto1;
    private JTextField cajatexto2;
    private JTextField cajatexto3;
    private JLabel texto1;
    private JLabel texto2;
    private JButton boton1;
    private JButton boton2;

    public CajaTexto(){   //metodo constructor
        setLayout(null);
        cajatexto1 = new JTextField();
        cajatexto1.setBounds(10,10,350,20);
        add(cajatexto1);

        //caja de texto 1
        cajatexto2=new JTextField();
        cajatexto2.setBounds(10,70,350,20);
        add(cajatexto2);

           //label de texto
        texto1 = new JLabel("Ingresa tu nombre");
        texto1.setBounds(10,7,200,100);
        add(texto1);

          //caja de te3xto 3
        cajatexto3=new JTextField();
        cajatexto3.setBounds(10,120,350,20);
        add(cajatexto3);

        //label de texto 2
        texto2 = new JLabel("Ingresa tu apellido");
        texto2.setBounds(10,50,200,100);
        add(texto2);


        //boton1
        boton1 = new JButton("enviar");
        boton1.setBounds(10,150,100,30);
        add(boton1);
        boton1.addActionListener(this);   //funcionalidad

        //boton 2
        boton2 = new JButton("borrar");
        boton2.setBounds(150,150,100,30);
        add(boton2);
        boton2.addActionListener(this);   //funcionalidad
    }

    //FUNCIONALIDad
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==boton1){
            String nombre = cajatexto2.getText();
            String apellido = cajatexto3.getText();
            cajatexto1.setText(nombre +" "+ apellido);
        }
        if(evento.getSource()==boton2){
            cajatexto2.setText(" ");
            cajatexto1.setText(" ");
            cajatexto3.setText(" ");
        }
    }



    public static void main(String[] args){
        CajaTexto ventana1 = new CajaTexto();
        ventana1.setBounds(50,50,400,300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }

}
