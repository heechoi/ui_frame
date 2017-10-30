package ui_frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfId;
	private JTextField tfCode;
	private JTextField tfPhone_1;
	private JTextField tfName;

	public static void main(String[] args) {
	
		try {
			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Client() {
		setTitle("고객 관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 751);
		getContentPane().setLayout(null);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		inputPanel.setBounds(12, 46, 450, 633);
		getContentPane().add(inputPanel);
		inputPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(26, 10, 112, 33);
		inputPanel.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(152, 0, 112, 33);
		inputPanel.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(276, 0, 112, 33);
		inputPanel.add(button_1);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(326, 590, 112, 33);
		inputPanel.add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(496, 46, 450, 622);
		getContentPane().add(panel);
		
		JButton btnClose = new JButton("닫기");
		btnClose.setBounds(834, 669, 112, 33);
		getContentPane().add(btnClose);
		contentPane = new JPanel();
		
	}
}
