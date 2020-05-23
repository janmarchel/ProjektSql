package sample.GUI;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.PreparedStatement;

public class Login {

    private JPanel panel1;
    private JPasswordField haslofield;
    private JButton dalejButton;
    private JButton anulujButton;
    private JPasswordField Loginfield;
    private JComboBox comboBox;
    private JCheckBox studentCheckBox;
    private JCheckBox lecturerCheckBox;
    private JCheckBox Admin;

    public String user_type;

    public Login() {


        dalejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                PreparedStatement pst = null;
                String haslo = haslofield.getPassword().toString();
                String login = Loginfield.getPassword().toString();
                int access = comboBox.getSelectedIndex();

                String selectStudent = "select login, password, where(login= ? and password = ?)";
                String selectLecturer = "select login, password, where(login= ? and password = ?)";
                String selectAdmin = "select login, password, where(login= ? and password = ?)";

                if(access == 0){

                }
                else if(access == 1){

                }
                else{}

            }
                catch (Exception e){
                    JOptionPane.showMessageDialog();
                }
        });
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
