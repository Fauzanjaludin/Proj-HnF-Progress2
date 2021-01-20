package fauzan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class gui1 {

	private JFrame frame;
	private JTextField txtname1;
	private JTextField txtname2;
	private JComboBox cbgen;
	private JTable table;
	private static Scanner x;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui1 window = new gui1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		info inf=new info();
		Random rand=new Random();
		outdoorsportdemo ods=new outdoorsportdemo();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1010, 581);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Outdoor Sports Club");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 399, 70);
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 76, 974, 455);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.ORANGE, 5));
		tabbedPane.addTab("Register", null, panel, null);
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" Info On Sport");
		lblNewLabel_1.setBounds(10, 102, 118, 14);
		panel.add(lblNewLabel_1);
		
		JTextPane infotxt = new JTextPane();
		infotxt.setBounds(10, 139, 560, 277);
		panel.add(infotxt);
		
		txtname1 = new JTextField();
		txtname1.setBounds(290, 11, 280, 20);
		panel.add(txtname1);
		txtname1.setColumns(10);
		
		txtname2 = new JTextField();
		txtname2.setColumns(10);
		txtname2.setBounds(290, 42, 280, 20);
		panel.add(txtname2);
		
		JLabel l4 = new JLabel("");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(590, 139, 369, 277);
		panel.add(l4);
		
		cbgen = new JComboBox();
		cbgen.setModel(new DefaultComboBoxModel(new String[] {"Choose a Gender", "Male", "Female"}));
		cbgen.setBounds(290, 73, 280, 20);
		panel.add(cbgen);
		
		JComboBox cbsport = new JComboBox();
		cbsport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=String.valueOf(cbsport.getSelectedItem());
					infotxt.setText(ods.print1(a));
					if(a=="Hiking") {
						l4.setIcon(new ImageIcon(menu1.class.getResource("/icon/hiking.jpg")));
					}else if(a=="Surfing") {
						l4.setIcon(new ImageIcon(menu1.class.getResource("/icon/surfingsport.jpg")));
					}else if(a=="Cycling") {
						l4.setIcon(new ImageIcon(menu1.class.getResource("/icon/Cycling.png")));
					}else {
						l4.setIcon(new ImageIcon(menu1.class.getResource("")));
					}
				
				
			}
		});
		cbsport.setMaximumRowCount(5);
		cbsport.setModel(new DefaultComboBoxModel(new String[] {"Choose a Sport", "Hiking", "Cycling", "Surfing"}));
		cbsport.setBounds(10, 41, 155, 22);
		panel.add(cbsport);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Outdoor Sport name");
		lblNewLabel_2.setBounds(10, 14, 155, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setBounds(204, 14, 76, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name");
		lblNewLabel_3_1.setBounds(204, 45, 76, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender");
		lblNewLabel_3_2.setBounds(204, 76, 76, 14);
		panel.add(lblNewLabel_3_2);
		
		JComboBox cbrace = new JComboBox();
		cbrace.setModel(new DefaultComboBoxModel(new String[] {"Choose a Race", "Melayu", "Cina", "India"}));
		cbrace.setBounds(290, 101, 280, 20);
		panel.add(cbrace);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Race");
		lblNewLabel_3_2_1.setBounds(204, 104, 76, 14);
		panel.add(lblNewLabel_3_2_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("table", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 11, 806, 405);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "sport", "firstname", "lastname", "gender", "race"
			}
			
		));
		try {
			String id1="";String sport1="";String name1="";String name2="";String gen1="";String rac1="";
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			x=new Scanner(new File("record.txt"));
			x.useDelimiter("[,\n]");

			while(x.hasNext()) {
				id1=x.next();
				sport1=x.next();
				name1=x.next();
				name2=x.next();
				gen1=x.next();
				rac1=x.next();
				
				model.addRow(new Object[]{
					id1,
					sport1,
					name1,
					name2,
					gen1,
					rac1,
			
			});
			}
			x.close();
		}catch(Exception e){
			JOptionPane.showConfirmDialog(null, "bruh, unable to load");
		}
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int row=table.getSelectedRow();
				int col=table.getSelectedColumn();
				String b=String.valueOf(table.getValueAt(row,col));
				
				
				inf.remrec(b);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data available","Proton registry",
								JOptionPane.OK_OPTION);}
					else {
						JOptionPane.showMessageDialog(null, "Select a row to delete","Proton registry",
								JOptionPane.OK_OPTION);}
				}
				
					else {
						model.removeRow(table.getSelectedRow());
						
					
				}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please pick an ID");
				}	
				
			
			}
		});
		btnNewButton.setBounds(10, 14, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Print to CSV");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File fl= new File("new1.csv");
					FileWriter csvW = new FileWriter(fl);
					BufferedWriter bw=new BufferedWriter(csvW);
					PrintWriter pw=new PrintWriter(bw);
					ArrayList<String> nfo1=new ArrayList<String>();
					nfo1=inf.print();
					bw.write("ID,Sport,First Name,Last Name,Gender,Race");
					bw.newLine();
					String g="";
					 for(int i=0;i<nfo1.size();i++)
				        {
						 	g=nfo1.get(i);
						 	bw.write(g);
				        }
					pw.flush();
					bw.flush();
					pw.close();
					bw.close();
					csvW.close();					
					JOptionPane.showMessageDialog(null, "Success");
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Oops something went wrong");
				}
			}
		});
		btnNewButton_1.setBounds(10, 48, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton butreg = new JButton("Register");
		butreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(cbsport.getSelectedItem()=="Choose a Sport"|| cbgen.getSelectedItem()=="Choose a Gender"||
							cbrace.getSelectedItem()=="Choose a Race") {
						JOptionPane.showMessageDialog(null,"Please Enter the info properly");
					}else {
				int rnum=rand.nextInt(1000000)+1;
				String id=String.valueOf(rnum);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						id,
						cbsport.getSelectedItem(),
						txtname1.getText(),
						txtname2.getText(),
						cbgen.getSelectedItem(),
						cbrace.getSelectedItem(),
						
				
				});
				inf.addrec(id,cbsport.getSelectedItem(),txtname1.getText(),txtname2.getText(),cbgen.getSelectedItem(),cbrace.getSelectedItem());
				txtname1.setText("");
				txtname2.setText("");
				cbgen.setSelectedItem("Choose a Gender");
				cbrace.setSelectedItem("Choose a Race");
				JOptionPane.showMessageDialog(null,txtname1.getText()+" added");
					
					}
				}catch(Exception e1){
					
				}
			}
		});
		butreg.setBounds(580, 98, 89, 23);
		panel.add(butreg);
		
	
	}
}
