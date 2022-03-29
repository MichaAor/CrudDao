package employee;

import javax.swing.*;

public class Desing extends JFrame {
    private JPanel jPanelMain;

    public Desing(){
        super("CRUD_DAO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jPanelMain);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame jFrame = new Desing();
        jFrame.setVisible(true);
    }

}
