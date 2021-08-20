/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseph Ayoma
 */
public class swingGetterSetters {

    //Swing component variable declaration
    JFrame swingGetterSetters;
    JLabel Fname = new JLabel();
    JLabel Sname = new JLabel();
    JLabel address = new JLabel();
    JLabel PhoneNumber = new JLabel();
    JLabel title = new JLabel();
    JLabel id = new JLabel();
    JTextField fname = new JTextField();
    JTextField sname = new JTextField();
    JTextField adress = new JTextField();
    JTextField phoneNumber = new JTextField();
    JTextField idnumber = new JTextField();
    JButton submit = new JButton();
    JTable customerData;
    JScrollPane sp;
    //End of Swing Variable Declaration 

    String[] columnsNames = {"Name", "Address", "Phone Number", "ID Number"};
    String[][] data = {{"", "", "", ""}};
    String FirstName, SecondName, Address, Phonumber, IdNumber;

    public swingGetterSetters() {
        swingSetters();
    }

    public void sectionCreatingGUI() {//This method creates UI

        swingGetterSetters = new JFrame("Section Java Swing Getters and Setters");
        swingGetterSetters.setLayout(null);
        swingGetterSetters.setSize(700, 450);
        swingGetterSetters.setVisible(true);
        swingGetterSetters.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        title.setBounds(260, 10, 380, 20);
        Fname.setBounds(120, 40, 300, 20);
        fname.setBounds(320, 40, 320, 30);
        Sname.setBounds(120, 70, 300, 20);
        sname.setBounds(320, 70, 320, 30);
        address.setBounds(120, 100, 300, 20);
        adress.setBounds(320, 100, 320, 30);
        PhoneNumber.setBounds(120, 130, 300, 20);
        phoneNumber.setBounds(320, 130, 320, 30);
        id.setBounds(120, 160, 300, 20);
        idnumber.setBounds(320, 160, 320, 30);
        submit.setBounds(540, 200, 100, 30);
        sp.setBounds(120, 240, 520, 150);
        swingGetterSetters.add(title);
        swingGetterSetters.add(Fname);
        swingGetterSetters.add(fname);
        swingGetterSetters.add(Sname);
        swingGetterSetters.add(sname);
        swingGetterSetters.add(address);
        swingGetterSetters.add(adress);
        swingGetterSetters.add(PhoneNumber);
        swingGetterSetters.add(phoneNumber);
        swingGetterSetters.add(id);
        swingGetterSetters.add(idnumber);
        swingGetterSetters.add(submit);        
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swingGetter();
            }
        });//The action event for the JButton
        swingGetterSetters.add(sp);
    }

    public void swingSetters() {
        //Setters for the JLabel, Sets the text displayed on the JLabel
        Fname.setText("First Name");
        Sname.setText("Second Name ");
        address.setText("Address");
        PhoneNumber.setText("Phone Number");
        title.setText("CUSTOMER INFORMATION");
        id.setText("ID Number"); 
        //Setters for the JButton, Sets the text Displayed on the Button
        submit.setText("SUBMIT");
        // Setter for the Jtable column
        customerData = new JTable((new DefaultTableModel(null, columnsNames)));
        //Setting the JTable to JcrollPane
        sp = new JScrollPane(customerData);
        //We call our GUI creation memthod too after setting our JLabels
        sectionCreatingGUI();
    }
     public void jLabelgetters()
 {
     String FnameLabelValue=Fname.getText();
     String SnameLabelValue=Sname.getText();
     String addressLabelValue=address.getText();
     String PhoneNumberLabelValue=PhoneNumber.getText();
     String idLabelValue=id.getText();
     String titleLabelValue=title.getText();
     String submitButtonValue=submit.getText();
 }

    public void swingGetter() {
        //Here we define getters which will get the text entered by the user in the respective JTextField and set/initialize them to our string variables
        FirstName = fname.getText();
        SecondName = sname.getText();
        Address = adress.getText();
        IdNumber = idnumber.getText();
        Phonumber = phoneNumber.getText();
        //To ensure that we are really gotten the values from the JTextField, we need to display them in the JTable
        DefaultTableModel Table = (DefaultTableModel) customerData.getModel();
        Table.addRow(new Object[]{FirstName + " " + SecondName, Address, Phonumber, IdNumber});
        //We Need to empty the JTextField to allow more entry after the first, second etc. values therefore we set the JTextField to null (empty) to allow next entry
        fname.setText(null);
        sname.setText(null);
        adress.setText(null);
        idnumber.setText(null);
        phoneNumber.setText(null);
        //End of swingGetter() method. We will call this method in JButton Action Event method above, the events here happens up on click on the JButton
    }


    public static void main(String args[]) {

        swingGetterSetters swingGetterSetters1 = new swingGetterSetters();

    }

}
