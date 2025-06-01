import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/" };
    private double num1, num2, result;
    private char operator;

    public Calculator() {
        // Set up the window
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Add the text field
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // Add the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();

        if (buttonText.matches("[0-9\\.]+")) {
            // If the button is a number or decimal point, add it to the text field
            textField.setText(textField.getText() + buttonText);
        } else if (buttonText.matches("[\\+\\-\\*/=]")) {
            // If the button is an operator, perform the appropriate calculation
            num1 = Double.parseDouble(textField.getText());
            operator = buttonText.charAt(0);
            textField.setText("");
        } else if (buttonText.equals("C")) {
            // If the button is the clear button, reset the text field and variables
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        } else if (buttonText.equals("Backspace")) {
            // If the button is the backspace button, remove the last character from the text field
            String text = textField.getText();
            textField.setText(text.substring(0, text.length() - 1));
        }

        if (buttonText.equals("=")) {
            // If the button is the equals button, perform the calculation and display the result
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true);
    }
}
