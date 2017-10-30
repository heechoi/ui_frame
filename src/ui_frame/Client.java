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
import javax.swing.border.MatteBorder;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfId;
	private JTextField tfCode;
	private JTextField tfPhone_1;
	private JTextField tfName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		inputPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		inputPanel.setBounds(22, 106, 450, 562);
		getContentPane().add(inputPanel);
		inputPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(27, 461, 112, 33);
		inputPanel.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(176, 461, 112, 33);
		inputPanel.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(306, 461, 112, 33);
		inputPanel.add(button_1);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(349, 504, 68, 33);
		inputPanel.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(39, 76, 140, 50);
		inputPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(234, 84, 137, 35);
		inputPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(27, 137, 200, 50);
		inputPanel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 146, 137, 33);
		inputPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(27, 198, 200, 50);
		inputPanel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(255, 213, 116, 21);
		inputPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(27, 277, 200, 50);
		inputPanel.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(293, 292, 30, 21);
		inputPanel.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(27, 373, 200, 50);
		inputPanel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(370, 388, 48, 21);
		inputPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(234, 388, 30, 21);
		inputPanel.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(293, 388, 48, 21);
		inputPanel.add(textField_4);
		
		JPanel listPanel = new JPanel();
		listPanel.setBounds(484, 106, 450, 562);
		getContentPane().add(listPanel);
		listPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(label, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		listPanel.add(scrollPane, BorderLayout.CENTER);
		
		JButton btnClose = new JButton("닫기");
		btnClose.setBounds(852, 670, 94, 32);
		getContentPane().add(btnClose);
		contentPane = new JPanel();
		
	}
}
