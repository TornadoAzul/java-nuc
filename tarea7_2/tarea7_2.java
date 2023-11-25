package java7_2;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java7_2 extends JApplet implements ActionListener {
    private JTextField heightField;
    private JTextField weightField;
    private JLabel resultLabel;

    @Override
    public void init() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel heightLabel = new JLabel("Altura (pulgadas):");
        panel.add(heightLabel);

        heightField = new JTextField(10);
        panel.add(heightField);

        JLabel weightLabel = new JLabel("Peso (libras):");
        panel.add(weightLabel);

        weightField = new JTextField(10);
        panel.add(weightField);

        JButton calculateButton = new JButton("Calcular IMC");
        panel.add(calculateButton);
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("");
        panel.add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular IMC")) {
            calculateBMI();
        }
    }

    private void calculateBMI() {
        String heightText = heightField.getText();
        String weightText = weightField.getText();

        try {
            double height = Double.parseDouble(heightText);
            double weight = Double.parseDouble(weightText);

            double bmi = (weight / (height * height)) * 703;

            resultLabel.setText("IMC: " + bmi);
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Introduce valores numéricos válidos");
        }
    }
}
