import javax.swing.*;

public class IntroGrafica extends JFrame{
    //sin este private Jlabel no arranca el programa
    private JLabel etiqueta1;

    //contenido que se vera en pantalla
    public IntroGrafica(){
        setLayout(null);
        etiqueta1 = new JLabel("Hola mundo x999 vez");
        etiqueta1.setBounds(10,20,300,400);
        add(etiqueta1);
    }
    
    public static void main(String[] args){
        IntroGrafica grafica1=new IntroGrafica();
        grafica1.setBounds(0,0,300,300);
        grafica1.setVisible(true);
        grafica1.setLocationRelativeTo(null);


    }
}
