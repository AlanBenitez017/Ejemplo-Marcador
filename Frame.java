import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener{

	private JTextField txtName = new JTextField("Nombre");
    private JTextField txtLastName = new JTextField("Apellido");
    private JButton cmdButton = new JButton("Guardar");
    Scanner scnr = new Scanner(System.in);
 
    public Frame(){
       super();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(100,100);
       
       this.add(txtName, BorderLayout.NORTH);
       this.add(txtLastName, BorderLayout.CENTER);
       this.add(cmdButton, BorderLayout. SOUTH);
       
       cmdButton.addActionListener(this);
       this.pack();
       
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmdButton){
            //Datos datos = new Datos();
        	String newName;
        	newName = scnr.next();
        	String newLastName;
        	newLastName = scnr.next();
            txtName.setText(newName);
            txtLastName.setText(newLastName);
        }
    }
 
    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setTitle("Divague");
    	f1.setVisible(true);
    	
    }
    
    //Como usar maven y por que
    //Como usar iBatis y por que
}
