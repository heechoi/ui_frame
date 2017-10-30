package ui_frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Dimension;

public class CarManager extends JFrame {

	private JPanel contentPane;
	private JTextField tfCarCode;
	private JTextField tfCarName;
	private JTextField tfCarValue;
	private JTextField tfbPrice;
	private JTextField tfBtPrice;
	private JTextField tfOTime;
	private JTextField tfInsurance;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarManager frame = new CarManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CarManager() {
		setTitle("차량관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBounds(10, 31, 261, 347);
		contentPane.add(inputPanel);
		inputPanel.setLayout(null);
		
		tfCarCode = new JTextField();
		tfCarCode.setBounds(120, 10, 116, 21);
		inputPanel.add(tfCarCode);
		tfCarCode.setColumns(10);
		
		tfCarName = new JTextField();
		tfCarName.setBounds(120, 41, 116, 21);
		inputPanel.add(tfCarName);
		tfCarName.setColumns(10);
		
		tfCarValue = new JTextField();
		tfCarValue.setBounds(120, 72, 116, 21);
		inputPanel.add(tfCarValue);
		tfCarValue.setColumns(10);
		
		tfbPrice = new JTextField();
		tfbPrice.setBounds(120, 103, 116, 21);
		inputPanel.add(tfbPrice);
		tfbPrice.setColumns(10);
		
		tfBtPrice = new JTextField();
		tfBtPrice.setBounds(120, 134, 116, 21);
		inputPanel.add(tfBtPrice);
		tfBtPrice.setColumns(10);
		
		tfOTime = new JTextField();
		tfOTime.setBounds(120, 163, 116, 21);
		inputPanel.add(tfOTime);
		tfOTime.setColumns(10);
		
		tfInsurance = new JTextField();
		tfInsurance.setBounds(120, 194, 116, 21);
		inputPanel.add(tfInsurance);
		tfInsurance.setColumns(10);
		
		JButton btnOk = new JButton("확인");
		btnOk.setBounds(12, 272, 97, 23);
		inputPanel.add(btnOk);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(139, 272, 97, 23);
		inputPanel.add(btnCancel);
		
		JButton btnImgAdd = new JButton("이미지 등록");
		btnImgAdd.setBounds(12, 228, 224, 23);
		inputPanel.add(btnImgAdd);
		
		JLabel lblCarCode = new JLabel("차종코드");
		lblCarCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarCode.setBounds(12, 10, 89, 21);
		inputPanel.add(lblCarCode);
		
		JLabel lblCarName = new JLabel("차종 이름");
		lblCarName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarName.setBounds(12, 41, 89, 21);
		inputPanel.add(lblCarName);
		
		JLabel lblbPrice = new JLabel("기본가격");
		lblbPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblbPrice.setBounds(12, 103, 89, 21);
		inputPanel.add(lblbPrice);
		
		JLabel lblCarValue = new JLabel("상세내용");
		lblCarValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarValue.setBounds(12, 72, 89, 21);
		inputPanel.add(lblCarValue);
		
		JLabel lblbtPrice = new JLabel("기본시간단가");
		lblbtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblbtPrice.setBounds(12, 134, 89, 21);
		inputPanel.add(lblbtPrice);
		
		JLabel lblOTime = new JLabel("초과시간단가");
		lblOTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblOTime.setBounds(12, 163, 89, 21);
		inputPanel.add(lblOTime);
		
		JLabel lblInsurance = new JLabel("보험료");
		lblInsurance.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsurance.setBounds(12, 194, 89, 21);
		inputPanel.add(lblInsurance);
		
		JButton btnClose = new JButton("닫기");
		btnClose.setBounds(12, 314, 224, 23);
		inputPanel.add(btnClose);
		
		JPanel imgPanel = new JPanel();
		imgPanel.setBounds(297, 31, 250, 347);
		contentPane.add(imgPanel);
		imgPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		imgPanel.add(scrollPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("이미지");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgPanel.add(lblNewLabel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 559, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("메뉴");
		menuBar.add(menu);
		
		JMenuItem mntmAdd = new JMenuItem("등록");
		menu.add(mntmAdd);
		
		JSeparator separator = new JSeparator();
		menu.add(separator);
		
		JMenuItem mntmUpdate = new JMenuItem("수정");
		menu.add(mntmUpdate);
		
		JSeparator separator_1 = new JSeparator();
		menu.add(separator_1);
		
		JMenuItem mntmDelete = new JMenuItem("삭제");
		menu.add(mntmDelete);
		
		JSeparator separator_2 = new JSeparator();
		menu.add(separator_2);
		
		JMenuItem mntmSearch = new JMenuItem("검색");
		menu.add(mntmSearch);
	}
}
