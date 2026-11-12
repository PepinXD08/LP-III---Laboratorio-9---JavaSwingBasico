package molleja;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        MarcoPanel flow = new MarcoPanel("FlowLayout");
        flow.setLocation(50, 100);
        flow.setVisible(true);

        MarcoPanel border = new MarcoPanel("BorderLayout");
        border.setLocation(700, 100);
        border.setVisible(true);

        MarcoPanel grid = new MarcoPanel("GridLayout");
        grid.setLocation(350, 400);
        grid.setVisible(true);
    }
}
