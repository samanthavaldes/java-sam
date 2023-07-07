import javax.swing.*;
public class Ventana extends JFrame {
    private JLabel ventana1, ventana2;

    public Ventana(){
        setLayout(null);
        ventana1 = new JLabel("Ventana 1");
        ventana1.setBounds(10,30,150,100);
        add(ventana1);

        ventana2 = new JLabel("Bienvenidos al programa de java");
        ventana2.setBounds(10, 20, 200, 100);
        add(ventana2);


    }
    public static void main(String args[]){
        Ventana ventana1 = new Ventana();
        ventana1.setBounds(0,0,300,400);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }

}
