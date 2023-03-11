package PaqGrupo03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenedores2 extends JFrame {


    private JPanel Panel2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField albaniaTextField;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox inspeccionadoEnAduanasCheckBox;

    public Contenedores2(){
        setTitle("Contenedores 2");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Panel2);

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int dato = Integer.parseInt(textField1.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"El dato no es un entero, vuelve a teclearlo");
                }
            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double dato = Double.parseDouble(textField2.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"El dato no es un entero o un doble, vuelve a teclearlo");
                }
            }
        });
        a1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a1RadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"Has seleccionado prioridad 1");
                    a2RadioButton.setEnabled(false);
                    a3RadioButton.setEnabled(false);
                }
                else {
                    a2RadioButton.setEnabled(true);
                    a3RadioButton.setEnabled(true);
                }
            }
        });
        a2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a2RadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"Has seleccionado prioridad 2");
                    a1RadioButton.setEnabled(false);
                    a3RadioButton.setEnabled(false);
                }
                else {
                    a1RadioButton.setEnabled(true);
                    a3RadioButton.setEnabled(true);
                }
            }
        });
        a3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a3RadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"Has seleccionado prioridad 3");
                    a1RadioButton.setEnabled(false);
                    a2RadioButton.setEnabled(false);
                }
                else {
                    a2RadioButton.setEnabled(true);
                    a1RadioButton.setEnabled(true);
                }

            }
        });
        inspeccionadoEnAduanasCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inspeccionadoEnAduanasCheckBox.isSelected()){
                    JOptionPane.showMessageDialog(null,"el contenedor esta inspeccionado en aduanas");

                }
            }
        });
    }
}
