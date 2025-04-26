import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {

    private JTextField displayField;

    public CalculatorGUI() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(CommonConstants.GUI_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(true);


        addComponent();
        addDisplayField();

    }

    private void addDisplayField() {

        JPanel panelField = new JPanel();
        panelField.setBounds(0,30,CommonConstants.GUI_SIZE.width,CommonConstants.GUI_SIZE.height);
        displayField = new JTextField(30);
        displayField.setEditable(false);
        displayField.setText("0");
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));

        panelField.add(displayField);

        this.getContentPane().add(panelField);

    }

    private void addComponent() {

        //panel
        JPanel panelButtons = new JPanel();
        panelButtons.setBounds(0,70,CommonConstants.GUI_SIZE.width,CommonConstants.GUI_SIZE.height);

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
