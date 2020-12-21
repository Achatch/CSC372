package bank;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.util.Random;



class bankMenu implements ActionListener
{
JMenuItem m1,m2,m3,m4;
JMenuBar mb;
JTextField txtbox;
JMenu menu;
JFrame frm;

public bankMenu(){
	frm=new JFrame();
	frm.setLayout(null);
	
	mb=new JMenuBar();
	txtbox=new JTextField();
	menu=new JMenu("options");
	
	m1=new JMenuItem("Date & Time");
	m2=new JMenuItem("Write_Into_File");
	m3=new JMenuItem("ChangeFrameColor");
	m4=new JMenuItem("Exit");
	
	
	menu.add(m1);
	menu.add(m2);
	menu.add(m3);
	menu.add(m4);
	
	mb.add(menu);
	frm.setJMenuBar(mb);
	
	
	m1.addActionListener(this);
	m2.addActionListener(this);
	m3.addActionListener(this);
	m4.addActionListener(this);
	
	txtbox.setBounds(10,10,160,25);
	frm.add(txtbox);
	frm.setVisible(true);
	frm.setSize(200,100);

}

public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==m1){
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss");
		LocalDateTime current=LocalDateTime.now();
		txtbox.setText(dt.format(current)+"");
		}

	if(ae.getSource()==m2){
			String s1=txtbox.getText();
			try{
				FileWriter fw=new FileWriter("Log.txt");
				fw.write(s1);
				fw.close();
				}
				catch(Exception e1){
					txtbox.setText("Exception is "+e1);
					}
	}

	if(ae.getSource()==m3){
		Random green = new Random();
		Color randomGreen = new Color(0, green.nextFloat(), 0);
		frm.getContentPane().setBackground(randomGreen);
		}

	if(ae.getSource()==m4){
		frm.setVisible(false);
	}

	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String args[]){
	new bankMenu();
	}
}