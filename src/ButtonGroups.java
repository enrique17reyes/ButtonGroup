import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonGroups  extends JFrame
        implements ActionListener {
    public ButtonGroups(String titulo) {
        //Creación de los RadioButtons
        JRadioButton osoButton = new JRadioButton("oso");
        osoButton.setMnemonic(KeyEvent.VK_B);
        osoButton.setActionCommand("oso");

        JRadioButton birButton = new JRadioButton("pajaro");
        osoButton.setMnemonic(KeyEvent.VK_B);
        osoButton.setActionCommand("pajaro");

        JRadioButton catButton = new JRadioButton("gato");
        osoButton.setMnemonic(KeyEvent.VK_B);
        osoButton.setActionCommand("gato");

        JRadioButton dogButton = new JRadioButton("perro");
        osoButton.setMnemonic(KeyEvent.VK_B);
        osoButton.setActionCommand("perro");

        JRadioButton rabitButton = new JRadioButton("conejo");
        osoButton.setMnemonic(KeyEvent.VK_B);
        osoButton.setActionCommand("conejo");


        ButtonGroup bgtAnimalitos = new ButtonGroup();

        bgtAnimalitos.add(birButton);
        bgtAnimalitos.add(catButton);
        bgtAnimalitos.add(dogButton);
        bgtAnimalitos.add(rabitButton);
        bgtAnimalitos.add(osoButton);

        JPanel radioPanel = new JPanel();

        radioPanel.setLayout(new GridLayout(0, 1));
        //radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(birButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabitButton);
        radioPanel.add(osoButton);

        JLabel picture = new JLabel(new ImageIcon("src/oso.jpg"));


        //BoxLayout distBoxLayout =new BoxLayout(this.getContentPane(),BoxLayout.X_AXIS);
        //getContentPane().setLayout(distBoxLayout);
        //GridLayout disGrid = new GridLayout(1,2);
        GridLayout disGrid = new GridLayout(2, 1);
        getContentPane().setLayout(disGrid);
        getContentPane().add(radioPanel);
        getContentPane().add(picture);

        //getContentPane().add(radioPanel, BorderLayout.WEST);
        //getContentPane().add(picture, BorderLayout.CENTER);
        //getContentPane().setBackground(Color.BLUE);
        pack();
        setTitle(titulo);


        //AQUI EMPIEZA
        //CREAMOS LOS BOtONES
//CREAMOS LOS BOTONES
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");

        //CREAMOS UN PANEL PARA COLOCAR LOS BOTONES
        JPanel principal = new JPanel(new BorderLayout());
        principal.setLayout(new BoxLayout(principal, BoxLayout.X_AXIS));
        //GridLayout dissGrid = new GridLayout(2, 1);

        //public Botones(){
        //super("Botones");
        principal.add(aceptar);
        principal.add(cancelar);

        getContentPane().add(principal, BorderLayout.CENTER);

        //AGREGAMOS TOOL TIPS A LOS BOTONES
        aceptar.setToolTipText("Botón ACEPTAR...");
        cancelar.setToolTipText("Botón CANCELAR...");

        pack();
        setResizable(true);
        //Dimension pantalla, cuadro;
        //pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //cuadro = this.getSize();

        //this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());}


    public static void main (String[] args) {


        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new ButtonGroups("Curso de Java: JRadioButton");
        frame.addWindowListener(l);
        frame.pack();
        frame.setVisible(true);



    }
}

