package rechner;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ra extends JFrame {
   JButton ba;
   JLabel la;
	eHandler handler = new eHandler();
    private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ra frame = new ra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ba = new JButton("New button");
		ba.setBounds(6, 20, 117, 29);
		contentPane.add(ba);
		
		JLabel la = new JLabel("New label");
		la.setBounds(16, 61, 61, 16);
		contentPane.add(la);
		ba.addActionListener(handler);
	
		
	
	
	}
	public class eHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==ba){
			la.setText("asasas");	
			}
			
		}
		
	}

}

