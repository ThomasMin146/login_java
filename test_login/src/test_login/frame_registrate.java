package test_login;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class frame_registrate extends JFrame implements ActionListener {
	
	private JTextField name_Field;
    private JPasswordField pass_Field;
    private JButton submitButton;
    private GridBagConstraints gbc = new GridBagConstraints();
	
	public frame_registrate(){
		
		
		setTitle("Registrate Screen");
        setSize(300, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
                
       
		
        JPanel panel = new JPanel(new  GridBagLayout());
        
        
        JLabel usernameLabel = new JLabel("set username: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(usernameLabel, gbc);
        
        name_Field = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(name_Field, gbc);
            
        JLabel passwordLabel = new JLabel("set password: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);
        
        pass_Field = new JPasswordField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(pass_Field, gbc);
        
        submitButton = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 2;
        
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(submitButton, gbc);
                
        add(panel);
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
