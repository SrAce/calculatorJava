import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLACK;

public class CalculatorGUI extends JFrame {

    private JTextField displayField;

    public CalculatorGUI() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(CommonConstants.GUI_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationRelativeTo(null);

        addDisplayField();
        addComponent();
    }

    private void addDisplayField() {

        JPanel panelField = new JPanel();
        displayField = new JTextField(30);
        displayField.setEditable(false);
        displayField.setText("0");
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 26));

        panelField.add(displayField);

        this.getContentPane().add(panelField);

    }

    private void addComponent() {

        //panel
        JPanel panelButtons = new JPanel();

        //gridlayout
        GridLayout layout = new GridLayout(5, 4,5,5);
        panelButtons.setLayout(layout);
        panelButtons.add(new JButton("/"));
        panelButtons.add(new JButton("*"));
        panelButtons.add(new JButton("-"));
        panelButtons.add(new JButton(","));
        panelButtons.add(new JButton("7"));
        panelButtons.add(new JButton("8"));
        panelButtons.add(new JButton("9"));
        panelButtons.add(new JButton("+"));
        panelButtons.add(new JButton("4"));
        panelButtons.add(new JButton("5"));
        panelButtons.add(new JButton("6"));
        panelButtons.add(new JButton("C"));
        panelButtons.add(new JButton("1"));
        panelButtons.add(new JButton("2"));
        panelButtons.add(new JButton("3"));
        panelButtons.add(new JButton("="));

        this.getContentPane().add(panelButtons);

        //buttons



        //add(numbers);


    }

}
