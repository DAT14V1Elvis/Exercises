package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


import javax.swing.JTextArea;

import dataBase.Database;
import application.Customer;




public class guiMain implements ActionListener
{
	private JPanel contentPane;
	private JTextField nameTxt = new JTextField();
	private JTextField lastnameTxt;
	private JTextField phoneTxt;
	private JTextField mailTxt;
	JFrame frame = new JFrame("Welcome");
	JFrame frameListe = new JFrame("Se listen");
	JButton btnOpret = new JButton("Opret");
	JTextArea textArea = new JTextArea();

	Database dB = new Database();



	public guiMain() throws Exception
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel name = new JLabel("Navn :");
		name.setBounds(36, 27, 61, 16);
		contentPane.add(name);

		JLabel lastname = new JLabel("Efternavn :");
		lastname.setBounds(36, 68, 81, 16);
		contentPane.add(lastname);

		JLabel phone = new JLabel("Telefon :");
		phone.setBounds(36, 113, 61, 16);
		contentPane.add(phone);

		JLabel email = new JLabel("Email :");
		email.setBounds(36, 154, 61, 16);
		contentPane.add(email);


		btnOpret.setBounds(216, 225, 117, 29);
		contentPane.add(btnOpret);

		nameTxt = new JTextField();
		nameTxt.setBounds(89, 21, 244, 28);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);

		lastnameTxt = new JTextField();
		lastnameTxt.setBounds(114, 62, 219, 28);
		contentPane.add(lastnameTxt);
		lastnameTxt.setColumns(10);

		phoneTxt = new JTextField();
		phoneTxt.setBounds(101, 107, 232, 28);
		contentPane.add(phoneTxt);
		phoneTxt.setColumns(10);

		mailTxt = new JTextField();
		mailTxt.setBounds(89, 148, 244, 28);
		contentPane.add(mailTxt);
		mailTxt.setColumns(10);


		textArea.setBounds(21, 179, 423, 36);
		contentPane.add(textArea);


		// har kun brug for 		btnOpret.addActionListener(this);

		nameTxt.addActionListener(this);
		lastnameTxt.addActionListener(this);
		phoneTxt.addActionListener(this);
		mailTxt.addActionListener(this);
		btnOpret.addActionListener(this);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnOpret)
		{
			try 
			{
				Customer newCustomer = new Customer(nameTxt.getText(), lastnameTxt.getText(), phoneTxt.getText(), mailTxt.getText());

				dB.insertDB(newCustomer);

				textArea.setText(dB.arrayToString());		
			} 

			catch (SQLException e1) 
			{
				// TODO Auto-generated catch block
			}
		}
	}


}
