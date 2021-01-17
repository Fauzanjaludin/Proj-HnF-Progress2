package sasikala;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class YogaGui {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField textField_2;
	private JTextField txtHeight;
	private JTextField txtWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YogaGui window = new YogaGui();
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
	public YogaGui() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 899, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel.setBounds(0, 0, 883, 505);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Our Yoga Centre");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lemon", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 863, 21);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(null, "Registration System", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 32, 863, 462);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("First Name :");
		lbl1.setBounds(10, 34, 72, 14);
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lbl1);
		
		txt1 = new JTextField();
		txt1.setBounds(81, 31, 153, 20);
		panel_1.add(txt1);
		txt1.setColumns(10);
		
		JLabel lbl2 = new JLabel("Last Name :");
		lbl2.setBounds(10, 70, 72, 14);
		lbl2.setForeground(Color.BLACK);
		lbl2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_1.add(lbl2);
		
		txt2 = new JTextField();
		txt2.setBounds(81, 67, 153, 20);
		panel_1.add(txt2);
		txt2.setColumns(10);
		
		JLabel lbl3 = new JLabel("Phone Num:");
		lbl3.setBounds(10, 107, 72, 14);
		lbl3.setForeground(Color.BLACK);
		lbl3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_1.add(lbl3);
		
		txt3 = new JTextField();
		txt3.setBounds(81, 104, 153, 20);
		panel_1.add(txt3);
		txt3.setColumns(10);
		
		JLabel lbl4 = new JLabel("Gender :");
		lbl4.setBounds(10, 141, 72, 14);
		lbl4.setForeground(Color.BLACK);
		lbl4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_1.add(lbl4);
		
		JRadioButton btn1 = new JRadioButton("Male");
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(81, 137, 72, 23);
		panel_1.add(btn1);
		
		JRadioButton btn2 = new JRadioButton("Female");
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(153, 137, 81, 23);
		panel_1.add(btn2);
		
		JLabel lbl5 = new JLabel("Nationality :");
		lbl5.setBounds(10, 182, 72, 14);
		lbl5.setForeground(Color.BLACK);
		lbl5.setHorizontalAlignment(SwingConstants.LEFT);
		lbl5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_1.add(lbl5);
		
		txt4 = new JTextField();
		txt4.setBounds(81, 179, 153, 20);
		panel_1.add(txt4);
		txt4.setColumns(10);
		
		JLabel lbl6 = new JLabel("Yoga experience before :");
		lbl6.setBounds(10, 226, 123, 14);
		lbl6.setForeground(Color.BLACK);
		lbl6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_1.add(lbl6);
		
		JComboBox cmb1 = new JComboBox();
		cmb1.setForeground(Color.BLACK);
		cmb1.setBounds(134, 222, 100, 22);
		cmb1.setModel(new DefaultComboBoxModel(new String[] {"Select one", "Yes", "No"}));
		panel_1.add(cmb1);
		
		JLabel lbl7 = new JLabel("Package offered days :");
		lbl7.setForeground(Color.BLACK);
		lbl7.setBounds(10, 274, 123, 14);
		lbl7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_1.add(lbl7);
		
		JComboBox cmb2 = new JComboBox();
		cmb2.setForeground(Color.BLACK);
		cmb2.setBounds(134, 270, 100, 22);
		cmb2.setModel(new DefaultComboBoxModel(new String[] {"Select one", "5 days", "Sat&Sun", "Twice in week", "Twice in month"}));
		panel_1.add(cmb2);	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 293, 275, 158);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea.setBackground(Color.WHITE);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(321, 65, 532, 168);
		panel_1.add(scrollPane_1);
		
		
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel lbResult = new JLabel("");
		lbResult.setBounds(607, 348, 226, 14);
		panel_1.add(lbResult);
		
		JLabel Height = new JLabel("Enter height(m)");
		Height.setForeground(Color.BLACK);
		Height.setBounds(607, 296, 92, 14);
		panel_1.add(Height);
		
		
		JLabel Weight = new JLabel("Enter weight(kg)");
		Weight.setForeground(Color.BLACK);
		Weight.setBounds(607, 323, 100, 14);
		panel_1.add(Weight);
		
		JButton btnNewButton = new JButton("Click here for info");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This is only for Obesity package !"
						+"\n"
						+" Calculate your BMI here\n"
						+" Send your current BMI to the respective trainers whatsapp number once you have registered.");
			}
		});
		btnNewButton.setBounds(622, 265, 136, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Choose A Package");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(57, 323, 136, 14);
		panel_1.add(lblNewLabel_1);
		
		txtHeight = new JTextField();
		txtHeight.setText("");
		txtHeight.setBounds(747, 293, 86, 20);
		panel_1.add(txtHeight);
		txtHeight.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(747, 319, 86, 20);
		panel_1.add(txtWeight);
		txtWeight.setColumns(10);
		
		JButton btn = new JButton("Calculate BMI");
		btn.setForeground(Color.BLACK);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double weight=Double.parseDouble(txtWeight.getText());
				double height=Double.parseDouble(txtHeight.getText());
				
				double bmi = weight / (height * height);
				if (bmi < 18.5) {
					lbResult.setText(" Underweight - BMI : "+ bmi);
				}else if (bmi<25) {
					lbResult.setText("Normal - BMI : "+ bmi);
				}else if (bmi<30) {
					lbResult.setText(" Overweight - BMI : "+ bmi);
				}else {
					lbResult.setText(" Obese - BMI : "+ bmi);
					
				}
			}
		});
		btn.setBounds(655, 382, 112, 23);
		panel_1.add(btn);
		btn.setVisible(true);

		
		
		JRadioButton btn3 = new JRadioButton("Stress Relief");
		btn3.setForeground(Color.BLACK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" Package : Stress Relief\n"
						+ " Poses & Benefits : \n"
						+"\n"
						+ " 1.Sukhasana(Easy Pose)\n"
						+ " Helps to calm down and eliminate anxiety.\n "
						+ " Reduces mental and physical exhaustion.\n"
						+ "\n"
						+ " 2.Balasana(Child's pose)\n"
						+ " Beneficial for your lymphatic system and nervous system.\n "
						+ " Calms your mind and release stress.\n"
						+"\n"
						+ " 3.Ananda Balasana (Happy baby pose)\n"
						+ " Calms you and get rid of fatigue and stress.\n "
						+ " It will gently stretch your spine and groin.\n"
						+"\n"
						+" 4.Uttanasana (Standing forward bend) \n"
						+ " Relieves mild depression and stress. \n"
						+ " It will calm your brain and stimulate your kidneys and liver.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks about stress relief will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+"\n"
						+" Trainer : 011-33905170\n"
						+"\n");
			}
		});
		btn3.setBounds(24, 346, 109, 23);
		panel_1.add(btn3);
		
		
		
		
		JRadioButton btn4 = new JRadioButton("Blood Pressure");
		btn4.setForeground(Color.BLACK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText( "Package : Blood Pressure\n"
						+" Poses & Benefits : \n"
						+"\n"
						+ " 1.Shavasana\n "
						+ " The easiest pose which you can try to control your blood pressure numbers.\n "
						+"\n"
						+ " 2.Bhujangasana\n"
						+ " Helpful in circulating blood and oxygen. \n"
						+ " This pose promotes heart health.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks on controlling blood pressure will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+ "\n"
						+" Trainer : 011-33905180\n"
						+"\n");
				
			}
		});
		btn4.setBounds(134, 346, 126, 23);
		panel_1.add(btn4);
		
		JRadioButton btn5 = new JRadioButton("Obesity");
		btn5.setForeground(Color.BLACK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText( "Package : Obesity\n"
						+ " Poses & Benefits : \n"
						+"\n"
						+ " 1.Dandasana\n"
						+ " This pose is an excellent abdomen toner.\n "
						+ " It is good for the upper body as it strengthens the wrists and arms.\n"
						+"\n"
						+ " 2.Kapal Bhati Pranayama\n"
						+ " This breathing technique increases the rate of metabolism and thus helps in reducing weight. \n"
						+ " It also improves digestive tract functioning, absorption and assimilation of nutrients.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+ " Tips and tricks on reducing and maintaining your weight will be shared during each classes you attend.\n"
						+"\n"
						+ " Each customers will receive a special gift once finish attending all te classes.\n"
						+ "\n"
						+" Trainer : 011-33905190\n"
						+"\n");
			}
		});
		btn5.setBounds(24, 372, 109, 23);
		panel_1.add(btn5);
		
		JRadioButton btn6 = new JRadioButton("Insomnia");
		btn6.setForeground(Color.BLACK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Package : Insomnia\n"
						+" Poses & Benefits : \n"
						+"\n"
						+" 1.Padangusthasana(Big Toe Pose)\n" 
						+" This pose stimulates the liver and kidneys in the back body, activating the parasympathetic nervous system,\n "
						+ "Which is responsible for releasing tension and putting the body to sleep.\n"
						+"\n"
						+" 2.Agnistambhasana(Fire Log Pose)\n"
						+" This pose actively focus on releasing tension in your hips,\n "
						+ " Your body will respond by releasing tension in other muscle groups, \n"
						+ " Which is preparing you for a relaxing night’s sleep.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered,\n "
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks on having a relaxing night sleep everyday will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+ "\n"
						+" Trainer : 011-33905110\n"
						+"\n");
			}
		});
		btn6.setBounds(134, 372, 109, 23);
		panel_1.add(btn6);
		
		JRadioButton btn7 = new JRadioButton("Back Pain");
		btn7.setForeground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" Package : Back Pain\n"
						+ " Poses & Benefits : \n"
						+"\n"
						+" 1. Cat-Cow \n"
						+" 2. Downward-Facing-Dog \n"
						+" 3. Extended Triangle \n"
						+" 4. Sphinx Pose \n"
						+" 5. Locust Pose\n"
						+"\n"
						+" All of the appropriate poses can relax and strengthen your body.\n"
						+" This will be useful in treating back pain."
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks to overcome from back pain will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+"\n"
						+" Trainer : 011-33905120\n"
						+"\n");
			}
		});
		btn7.setBounds(24, 407, 109, 23);
		panel_1.add(btn7);
		
		JButton Receipt = new JButton("Generate Receipt");
		Receipt.setForeground(Color.BLACK);
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("--------------------------------"
	                    + "-----------CONFIRMATION RECEIPT----"
	                    + "--------------------------"
	                    + "--------------------------"
	                    + "-------------------\n"); 
	  
	                textArea_1.setText(textArea_1.getText() 
	                              + " First Name: "
	                              + txt1.getText() 
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
	                              + " Last Name: "
	                              + txt2.getText() 
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
	                              + " Phone Number: "
	                              + txt3.getText() 
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
	                              + " Nationality: "
	                              + txt4.getText()
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
                            + " Yoga experience before : "
                            + cmb1.getSelectedItem() 
                                  .toString() 
                            + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
                            + " Package offered days selected: "
                            + cmb2.getSelectedItem() 
                                  .toString() 
                            + "\n"); 
	                
	             if (btn3.isSelected()) { 
	                    textArea_1.setText(textArea_1.getText() 
	                                  + " Wants to Join : "
	                                  + " Stress Relief \r\n"
	                                  + " Total Amount To Be Paid : RM 399\n"
	                                  + " Trainer : 011-33905170 "
	                                  +"\n"); 
	             }
	             
	                    if (btn4.isSelected()) { 
	                    textArea_1.setText(textArea_1.getText() 
	                                  + " Wants to Join : "
	                                  + " Blood Pressure \r\n"
	                                  + " Total Amount To Be Paid : RM 499\n"
	                                  + " Trainer : 011-33905180 "
	                                  + "\n"); 
	                    }
	                    if (btn5.isSelected()) {
	                    	textArea_1.setText(textArea_1.getText()
	                    			  + " Wants to Join : "
	                    			  + " Obesity \r\n"
	                    			  + " Total Amount To Be Paid : RM 599\n"
	                    			  + " Trainer : 011-33905190 "
	                    			  +"\n");
	                    }
	                    if (btn6.isSelected()) {
	                    	textArea_1.setText(textArea_1.getText()
	                    			  + " Wants to Join : "
	                    			  + " Insomnia \r\n"
	                    			  + " Total Amount To Be Paid : RM 399\n"
	                    			  + " Trainer : 011-33905110 "
	                    			  +"\n");
	                    }
	                    if (btn7.isSelected()) {
	                    	textArea_1.setText(textArea_1.getText()
	                    			  + " Wants to Join : "
	                    			  + " Back Pain \r\n"
	                    			  + " Total Amount To Be Paid : RM 399\n"
	                    			  + " Trainer : 011-33905120 "
	                    			  +"\n");
	                
	                } 
	                    if (e.getSource() == Receipt) { 
	                        try { 
	                            FileWriter fw 
	                                = new FileWriter( 
	                                    "yoga.txt", true); 
	                            fw.write(textArea_1.getText()); 
	                            fw.close(); 
	                        } 
	                        catch (Exception ae) { 
	                            System.out.println(ae); 
	                        } 
	                    } 
	                JOptionPane.showMessageDialog(textArea_1, "DATA SAVED SUCESSFULLY"); 
				
	                }
		
		});
		Receipt.setBounds(353, 26, 153, 30);
		panel_1.add(Receipt);
		
		JButton b2 = new JButton("Reset");
		b2.setForeground(Color.BLACK);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 b2.addActionListener( 
				            new ActionListener() { 
				                public void actionPerformed( 
				                    ActionEvent e) 
				                { 
				                    textArea.setText(""); 
				                    textArea_1.setText("");
				                    txt1.setText(""); 
				                    txt2.setText("");
				                    txt3.setText("");
				                    txt4.setText("");
				                    
				                } 
				            }); 
				  
			}
		});
		b2.setBounds(576, 26, 112, 30);
		panel_1.add(b2);
		
		JButton Print = new JButton("Print");
		Print.setForeground(Color.BLACK);
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{ 
                    try { 
                        textArea_1.print(); 
                    } 
                    catch (java.awt.print 
                               .PrinterException a) { 
                        System.err.format( 
                            "NoPrinter Found", 
                            a.getMessage()); 
                    } 
			}
			}
		});
		Print.setBounds(747, 26, 106, 30);
		panel_1.add(Print);
		
		
		
		
	
		
		
		
		
		
	}
	}
