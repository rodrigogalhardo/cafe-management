/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.util.Objects;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import Views.AdminappView;
import javax.swing.JPasswordField;
/**
 *
 * @author Thang Le
 */
public class LoginView {
    private AdminappView app;
    private JFrame jf;
    private JTextField nameText;
    private JPasswordField passText;
    
    LoginView()
    {
        jf=new JFrame("Login | Admin App");
        jf.setSize(600, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // đóng frame 
        jf.setResizable(false);

        jf.setLocationRelativeTo(null);
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        
        
        /*LOGO*/
        JPanel brandSection = new JPanel();
        brandSection.setBackground(new Color(228,249,245));
        
        JLabel brandImage = new JLabel();
        URL imgURL = getClass().getResource("../image/logo.png");
        brandImage.setIcon(new ImageIcon(imgURL));
        
        JLabel brandText = new JLabel("Starbucks – The Best Coffee and Espresso Drinks");
        brandText.setForeground(new Color(0,107,68));
        brandText.setBackground(new Color(228,249,245));
        brandText.setFont(new Font("SansSerif", Font.PLAIN, 20));
        
        brandSection.add(Box.createRigidArea(new Dimension(5, 0)));
        brandSection.add(brandImage);
        brandSection.add(Box.createRigidArea(new Dimension(15, 0)));
        brandSection.add(brandText);
        brandSection.add(Box.createRigidArea(new Dimension(10, 0)));
        /*END LOGO */
        
        
         /*info detail*/
        JPanel detail=new JPanel();
        detail.setLayout(new BoxLayout(detail,BoxLayout.Y_AXIS));
        detail.setBackground(new Color(228,249,245));
        detail.setPreferredSize(new Dimension(panel.getWidth(),panel.getHeight()));
        
        /*USERNAME*/
        JPanel Namegroup=new JPanel();
        Namegroup.setLayout(new BoxLayout(Namegroup,BoxLayout.X_AXIS));
        Namegroup.setBackground(new Color(228,249,245));
        Namegroup.setMaximumSize(new Dimension(300, 30));
        
         nameText=new JTextField();
         nameText.setAlignmentX(Component.CENTER_ALIGNMENT);
         JLabel nameLabel=new JLabel("Username : ");
         nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Namegroup.add(Box.createRigidArea(new Dimension(5,0)));
        Namegroup.add(nameLabel);
        Namegroup.add(Box.createRigidArea(new Dimension(48,0)));
        Namegroup.add(nameText);
        Namegroup.add(Box.createRigidArea(new Dimension(5,0))); 
        /*END USERNAME*/
        
        
        /*PASSWORD*/
         JPanel Passgroup=new JPanel();
        Passgroup.setLayout(new BoxLayout(Passgroup,BoxLayout.X_AXIS));
        Passgroup.setBackground(new Color(228,249,245));
        Passgroup.setMaximumSize(new Dimension(300, 30));
        
         passText=new JPasswordField();
         passText.setAlignmentX(Component.CENTER_ALIGNMENT);
         JLabel passLabel=new JLabel("Password : ");
         passLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Passgroup.add(Box.createRigidArea(new Dimension(5,0)));
        Passgroup.add(passLabel);
        Passgroup.add(Box.createRigidArea(new Dimension(48,0)));
        Passgroup.add(passText);
        Passgroup.add(Box.createRigidArea(new Dimension(5,0))); 
        /*END PASSWORD*/
        
        /*end info detail*/
         /*Button Add,Cancel*/
        JPanel Btngroup=new JPanel();
        Btngroup.setLayout(new BoxLayout(Btngroup,BoxLayout.X_AXIS));
        Btngroup.setBackground(new Color(228,249,245));
        Btngroup.setMaximumSize(new Dimension(300, 30));
        
        JButton btnCancel=new JButton("Cancel");
        btnCancel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton btnAdd=new JButton("Login");
        btnAdd.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        Btngroup.add(Box.createRigidArea(new Dimension(25,0)));
        Btngroup.add(btnCancel);
        Btngroup.add(Box.createRigidArea(new Dimension(115,0)));
        Btngroup.add(btnAdd);
        /*end Button Add,Cancel*/
        
        detail.add(Box.createRigidArea(new Dimension(0,20)));
        detail.add(Namegroup);
        detail.add(Box.createRigidArea(new Dimension(0,20)));
        detail.add(Passgroup);
        detail.add(Box.createRigidArea(new Dimension(0,20)));
        detail.add(Btngroup);
        
        
        panel.add(brandSection);
        panel.add(Box.createRigidArea(new Dimension(10,0)));
        panel.add(detail);
        
        /*Event Btn Add,Cancel*/
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //xử lý sự kiện check login
                if(nameText.getText().toString().equals("")==false)
                {
                    //Xu ly btn add
                    JOptionPane.showMessageDialog(null, "Đăng nhập  thành công!");
                    app=new AdminappView();
                    jf.dispose();
                }
            }
        });
        
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 //Xu ly btn cancel
                 JOptionPane.showMessageDialog(null, "Exit");
                  jf.dispose();
            }
        });
        
        jf.getContentPane().add(brandSection,BorderLayout.PAGE_START);
        jf.getContentPane().add(detail,BorderLayout.CENTER);
        jf.setVisible(true);
    }
}
