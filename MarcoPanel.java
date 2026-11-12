package molleja;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoPanel extends JFrame {
    public MarcoPanel(String tipo) {
        super(tipo + " - Edgard Raúl Díaz Torres, Anghi Cenayda Romero Enriquez, Jean Piere Alexis Marcial Maydana Sarmiento");

        if (tipo.equals("FlowLayout")) {
            setLayout(new FlowLayout());
            for (int i = 1; i <= 5; i++) {
                add(new JButton("Boton " + i));
            }
        } else if (tipo.equals("BorderLayout")) {
            setLayout(new BorderLayout());
            add(new JButton("NORTH"), BorderLayout.NORTH);
            add(new JButton("SOUTH"), BorderLayout.SOUTH);
            add(new JButton("EAST"), BorderLayout.EAST);
            add(new JButton("WEST"), BorderLayout.WEST);
            add(new JButton("CENTER"), BorderLayout.CENTER);
        } else if (tipo.equals("GridLayout")) {
            setLayout(new GridLayout(2, 3));
            for (int i = 1; i <= 5; i++) {
                add(new JButton("Boton " + i));
            }
        }
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

