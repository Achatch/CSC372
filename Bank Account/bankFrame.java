package bank;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bankFrame extends JPanel implements ActionListener{
	
	JButton debit = new JButton("Debit");
	JButton credit = new JButton("Credit");
	JButton exit = new JButton("Exit");
	TextField t1, t2, output; // text fields
	Label debitAccount, creditAccount, balanceAmount; // labels
	double accountBalance=0.0;
	
	public bankFrame(JFrame frame) {
		
		debitAccount = new Label(" Debit :");
		debitAccount.setBounds(25, 50, 50, 25);
		frame.add(debitAccount);
		
		t1 = new TextField();
		t1.setBounds(75, 55, 50, 25);
		frame.add(t1);
		
		creditAccount = new Label(" Credit :");
		creditAccount.setBounds(25, 90, 50, 25);
		frame.add(creditAccount);
		
		t2 = new TextField();
		t2.setBounds(75, 90, 50, 25);
		frame.add(t2);
		debit.addActionListener(this);
		debit.setBounds(75,125,75,15);
		frame.add(debit);
		
		credit.addActionListener(this);
		credit.setBounds(150,125,75,15);
		frame.add(credit);
		balanceAmount = new Label(" Balance Amoount :");
		balanceAmount.setBounds(150, 90, 50, 25);
		frame.add(balanceAmount);
		output = new TextField("");
		output.setBounds(200, 90, 50, 25);
		frame.add(output);
		exit.addActionListener(this);
		exit.setBounds(225,125, 75,15);
		frame.add(exit);
}	

public static void main (String[] args) {

	JFrame frame = new JFrame();
	frame.getContentPane().add(new bankFrame(frame));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(350, 250);
	frame.setVisible(true);

}

public void actionPerformed(ActionEvent e) {

	if (e.getActionCommand().equals("Debit")) {
		System.out.println("Debit has been clicked");
		String balanceAmount = t1.getText();
		double debitAmount = Double.parseDouble(balanceAmount);
		accountBalance=accountBalance+debitAmount;
		output.setText(String.valueOf(accountBalance));
		t1.setText("");}
	else if (e.getActionCommand().equals("Credit")) {
		System.out.println("Debit has been clicked");
		String balanceAmount = t2.getText();
		double creditAmount = Double.parseDouble(balanceAmount);
		accountBalance=accountBalance-creditAmount;
		output.setText(String.valueOf(accountBalance));	
		t2.setText("");}
	else if(e.getActionCommand().equals("Exit")){
		System.out.println("You are exited : Bye");		
		System.exit(0);}
	}
}