import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tarea7_1 extends JApplet {
    private JTextField textField;

    public void init() {
        textField = new JTextField(10);
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = textField.getText();
                if (password.equals("Rosebud")) {
                    JOptionPane.showMessageDialog(null, "Acceso permitido");
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado");
                }
            }
        });

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(textField);
    }
}
