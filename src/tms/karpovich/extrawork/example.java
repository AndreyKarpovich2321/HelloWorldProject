package tms.karpovich.extrawork;

import javax.swing.*;

public class example extends JFrame{
    private JButton button1;
    private JTextField textField1;
    private JPanel panel;

    public static void main(String[] args) {
        example form = new example();

        form.setTitle("This Is My App");
        form.setContentPane(form.panel);
        form.setSize(500, 300);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
