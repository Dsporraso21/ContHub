package PaqGrupo03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionContenedores extends JFrame {

    public GestionContenedores(){
        setTitle("Contenedores ");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Contenedores);
        TxtEmpresa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null,"Has apilado un contenedor");


            }
        });

        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (desapilarButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"Has desapilado un contenedor");

                }
            }
        });
        TxtNidentificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int dato = Integer.parseInt(TxtNidentificacion.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"El dato no es un entero, vuelve a teclearlo");
                }
            }
        });

        txtNpeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double dato = Double.parseDouble(txtNpeso.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"El dato no es un entero o doble, vuelve a teclearlo");
                }
            }
        });
        mostrarDatosContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contenedores2 contenedores2= new Contenedores2();
            }
        });

    }

    public static void main(String[] args) {
        new GestionContenedores();
    }

    private JPanel Contenedores;
    private JTextField TxtNidentificacion;
    private JTextField txtNpeso;
    private JTextArea TxtDescr;
    private JLabel Nidentificacion;
    private JLabel Peso;
    private JLabel Empresa;
    private JTextField TxtEmpresa;
    private JTextField TxtReceptora;
    private JLabel EmpresaReceptora;
    private JComboBox comboBox1;
    private JLabel Prioridad;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JTextArea TxtEstado;
    private JLabel Estado;
    private JLabel operaciones;
    private JLabel Pais;
    private JLabel Contenido;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JTextField nºDeColumnaTextField;
    private JButton mostrarDatosContenedorButton;
    private JTextField IDContenedorTextField;
    private JButton cuantosButton;
    private JComboBox comboBox2;
    private JLabel Icono;
    private JTextField textField1;


}
