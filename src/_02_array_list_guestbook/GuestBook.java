package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	ArrayList<String> listofNames = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	public void setup() {
		frame.setVisible(true);
		frame.setTitle("Guestbook");
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		button.setText("Add Name");
		button2.setText("View Name");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		
		listofNames.add("Bob Banders");
		listofNames.add("Sandy Summers");
		listofNames.add("Greg Ganders");
		listofNames.add("Donny Doners");
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked == button) {
			String answer = JOptionPane.showInputDialog("Enter a name:");
			listofNames.add(answer);
			panel.add(new JTextField(listofNames.size() - 1));
			
			
		}
		if(buttonClicked == button2) {
			JPanel panel2 = new JPanel();
			JFrame frame2 = new JFrame();
			JTextField BobBanders = new JTextField(listofNames.get(0));
			JTextField SandySummers = new JTextField(listofNames.get(1));
			JTextField GregGanders = new JTextField(listofNames.get(2));
			JTextField DonnyDoners = new JTextField(listofNames.get(3));
			String result = "";
			for(int i =0; i < listofNames.size(); i++) {
				result+=listofNames.get(i) + ", ";
			}
			JOptionPane.showMessageDialog(null,result);
		}
	}
}
