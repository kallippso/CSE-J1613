/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import javax.swing.JLabel;

/**
 *
 * @author christian
 */

public class NewUser extends JFrame {
   
  JButton create;
  JPanel newUserPanel;
  JTextField userText;
  JTextField passText;
  JLabel username;
  JLabel password;
  JLabel classText;
  JLabel classExplain;
  JTextField classification;
  ArrayList<User> users;
  Settings settings;
  
  boolean isInUse = false;
  
  int userClassification = -1;
  
  private Robot cursorMover;
  private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  
  FileOutputStream fos;
  ObjectOutputStream oos;
  
  FileInputStream fis;
  ObjectInputStream ois;



  public NewUser(Settings settings) {
    super("Please complete registration.");
    this.users = settings.users;
    this.settings = settings;
    
    try {
        cursorMover = new Robot();
    } catch(Exception e)
    {
    }

    create = new JButton("Create");
    newUserPanel = new JPanel();
    userText = new JTextField(15);
    passText = new JPasswordField(15);
    username = new JLabel("Username: ");
    password = new JLabel("Password: ");
    classification = new JTextField(15);
    classText = new JLabel("Class(0, 1, 2):");
    classExplain = new JLabel("0 - Cust, 1 - SA, 2 - Manager");
    

    setSize(300, 220);
    setLocation(500, 280);
    newUserPanel.setLayout (null); 


    create.setBounds(110, 140, 80, 20);
    userText.setBounds(110, 20, 150, 20);
    passText.setBounds(110, 55, 150, 20);
    classification.setBounds(110, 90, 150, 20);
    username.setBounds(30, 18, 80, 20);
    password.setBounds(30, 53, 80, 20);
    classText.setBounds(30, 88, 80, 20);
    classExplain.setBounds(30, 110, 180, 20);

    newUserPanel.add(create);
    newUserPanel.add(userText);
    newUserPanel.add(passText);
    newUserPanel.add(username);
    newUserPanel.add(password);
    newUserPanel.add(classification);
    newUserPanel.add(classText);
    newUserPanel.add(classExplain);
    

    getContentPane().add(newUserPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
          
          // populate users;
          
          String printedUsername = userText.getText();
          String printedPassword = passText.getText();
          int printedClassification = Integer.parseInt(classification.getText());
          
          if(printedClassification < 0 || printedClassification > 2){
             isInUse = true;
                  JOptionPane sorry = new JOptionPane();
                  cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));
                  sorry.showConfirmDialog(null, "Invalid classification.", "ERROR", JOptionPane.OK_CANCEL_OPTION);
             
          }
          
          for(int i = 0; i < users.size(); i++)
          {
              if(printedUsername.equals(users.get(i).getUsername()))
              {
                  isInUse = true;
                  JOptionPane sorry = new JOptionPane();
                  cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));
                  sorry.showConfirmDialog(null, "Username already in use.", "ERROR", JOptionPane.OK_CANCEL_OPTION);
              }
          }
          
          if(!isInUse)
          {
              users.add(new User(printedUsername, printedPassword, printedClassification));
              isInUse = false;
              try {
                FileFunctions.serialize(users, settings.usersFile);
              } catch (Exception e) {
                  // e
              }
              //go to login screen
              LoginFrame logIn = new LoginFrame(settings);
              logIn.checkIdentity();
              dispose();
          }
      }
    }
    );
  }
}