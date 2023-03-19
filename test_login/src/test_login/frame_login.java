package test_login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;


import java.util.Scanner;

public class frame_login extends JFrame implements ActionListener {
    
    private JTextField name_Field;
    private JPasswordField pass_Field;
    private JButton loginButton, registrateButton;
    
    
    public frame_login() {
        
    	// frame settings
    	setTitle("Login Screen");
        setSize(300, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        JPanel panel = new JPanel(new GridLayout(0, 2));
        
        JLabel usernameLabel = new JLabel("username:");
        name_Field = new JTextField();
        usernameLabel.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel passwordLabel = new JLabel("password:");
        pass_Field = new JPasswordField();
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        
        registrateButton = new JButton("Registrate");
        registrateButton.addActionListener(this);

        
        panel.add(usernameLabel);
        panel.add(name_Field);
        panel.add(passwordLabel);
        panel.add(pass_Field);
        panel.add(registrateButton);
        panel.add(loginButton);
        
        add(panel);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = name_Field.getText();
            String password = new String(pass_Field.getPassword());
            boolean isAu = false;
             
            
            // ------------------------------------------ FILE ---------------------------
            File file = new File("loginfile.txt");

    		try {
    			Scanner inputBuffer = new Scanner(file);
    			
    			while (inputBuffer.hasNext()) {
    				String line = inputBuffer.nextLine();
    				String[] values = line.split(" ");
    				
    				if (username.equals(values[0]) && password.equals(values[1])) {
    					isAu = true;
    				}
    			}
    			
    			if(isAu) {
    				JOptionPane.showMessageDialog(this, "Login successful!");
	                dispose();
    			}
    			
    			else {
    				JOptionPane.showMessageDialog(this, "Invalid username or password.");
    			}

    		} catch (FileNotFoundException fe) {
    			fe.printStackTrace();
    		}
    		
            
        }
        
        if (e.getSource() == registrateButton) {
        	frame_registrate register = new frame_registrate();            
        }
    }
    
}

