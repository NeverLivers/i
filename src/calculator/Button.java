package calculator;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {

    private JTextField textField = new JTextField(34);

    private JButton remove = new JButton("AC");
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton zero = new JButton("0");
    private JButton clean = new JButton("C");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton division = new JButton("/");
    private JButton multi = new JButton("*");
    private JButton percent = new JButton("%");
    private JButton equals = new JButton("=");
    private JButton power = new JButton("^");
    private JButton doubleZero = new JButton("00");
    double firstValue = 0;
    String operation = "+";

    private JPanel workPanel = new JPanel();
    private JPanel mainPanel = new JPanel();
    private JPanel writePanel = new JPanel();

    public Button(){
        initComponents();
        Settings();
        setActionListeners();
    }

    private void setActionListeners() {

        one.addActionListener(event -> textField.setText(textField.getText() + "1"));
        two.addActionListener(event -> textField.setText(textField.getText() + "2"));
        three.addActionListener(event -> textField.setText(textField.getText() + "3"));
        four.addActionListener(event -> textField.setText(textField.getText() + "4"));
        five.addActionListener(event -> textField.setText(textField.getText() + "5"));
        six.addActionListener(event -> textField.setText(textField.getText() + "6"));
        seven.addActionListener(event -> textField.setText(textField.getText() + "7"));
        eight.addActionListener(event -> textField.setText(textField.getText() + "8"));
        nine.addActionListener(event -> textField.setText(textField.getText() + "9"));
        zero.addActionListener(event -> textField.setText(textField.getText() + "0"));
        doubleZero.addActionListener(event -> textField.setText(textField.getText() + "00"));
        remove.addActionListener(event -> textField.setText(""));
        division.addActionListener(event -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "/";
        });
        multi.addActionListener(event -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "*";
        });
        plus.addActionListener(event -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "+";
        });
        minus.addActionListener(event -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "-";
        });
        percent.addActionListener(event -> {
            firstValue = Double.valueOf(textField.getText());
            textField.setText("");
            operation = "%";
            if ("%".equals(operation)){
                textField.setText((firstValue / 100) + "");
            }
        });
        power.addActionListener(event -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "^";
        });
        clean.addActionListener(event -> {
            String temp = textField.getText();
            textField.setText(temp.substring(0, temp.length() - 1));
        });
        equals.addActionListener(event -> {
        int secondValue = Integer.valueOf(textField.getText());
        if("+".equals(operation)){
            textField.setText((firstValue + secondValue) + "");
        }
        if("-".equals(operation)){
            textField.setText((firstValue - secondValue) + "");
        }
        if("*".equals(operation)){
            textField.setText((firstValue * secondValue) + "");
        }
        if("/".equals(operation)){
            textField.setText((firstValue / secondValue) + "");
        }
        if ("^".equals(operation)){
            textField.setText((Math.pow(firstValue, secondValue)) + "");
        }

        firstValue = 0;
        operation = "+";
    });


    }

    private void initComponents(){

        workPanel.setLayout(new GridLayout(5, 4));
        workPanel.add(remove);
        workPanel.add(clean);
        workPanel.add(division);
        workPanel.add(multi);
        workPanel.add(seven);
        workPanel.add(eight);
        workPanel.add(nine);
        workPanel.add(minus);
        workPanel.add(four);
        workPanel.add(five);
        workPanel.add(six);
        workPanel.add(plus);
        workPanel.add(one);
        workPanel.add(two);
        workPanel.add(three);
        workPanel.add(power);
        workPanel.add(percent);
        workPanel.add(zero);
        workPanel.add(doubleZero);
        workPanel.add(equals);
        writePanel.add(textField);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(workPanel, BorderLayout.CENTER);
        mainPanel.add(writePanel, BorderLayout.NORTH);

        JScrollPane scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);

    }


    private void Settings() {
        setSize(400, 500);
        setLocation(400, 200);
        setResizable(false);
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
