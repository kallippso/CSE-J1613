/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
  //JTextField classification;
  ArrayList<User> users;
  
  boolean isInUse = false;
  
  int userClassification = -1;
  
  private Robot cursorMover;
  private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  
  FileOutputStream fos;
  ObjectOutputStream oos;
  
  FileInputStream fis;
  ObjectInputStream ois;



  public NewUser() {
    super("Please complete registration.");

    create = new JButton("Create");
    newUserPanel = new JPanel();
    userText = new JTextField(15);
    passText = new JPasswordField(15);
    username = new JLabel("Username: ");
    password = new JLabel("Password: ");


    setSize(300, 200);
    setLocation(500, 280);
    newUserPanel.setLayout (null); 


    create.setBounds(110, 110, 80, 20);
    userText.setBounds(110, 20, 150, 20);
    passText.setBounds(110, 55, 150, 20);
    username.setBounds(30, 18, 80, 20);
    password.setBounds(30, 53, 80, 20);

    newUserPanel.add(create);
    newUserPanel.add(userText);
    newUserPanel.add(passText);
    newUserPanel.add(username);
    newUserPanel.add(password);

    getContentPane().add(newUserPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    File check = new File("C:/Users/christian/Documents/NetBeansProjects/CSE-J1613/RobbieRobotShop/test");
    if (check.exists()) {
        if(users == null)
            users = new ArrayList<>();
      //Checks if the file exists. will not add anything if the file does exist.
    } else {
      try {
        File fileInstance = new File("C:/Users/christian/Documents/NetBeansProjects/CSE-J1613/RobbieRobotShop/test"); // write MenuArray to ObjectOutputStream
        fis = new FileInputStream(fileInstance);
        ois = new ObjectInputStream(fis);   
        users = (ArrayList<User>)ois.readObject();
        if(users == null)
            users = new ArrayList<>();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }




    create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {        
          File fileInstance = new File("C:/Users/christian/Documents/NetBeansProjects/CSE-J1613/RobbieRobotShop/test");
          String printedUsername = userText.getText();
          String printedPassword = passText.getText();
          
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
              users.add(new User(printedUsername, printedPassword));
              isInUse = false;
              fos = new FileOutputStream(fileInstance, true);
              oos = new ObjectOutputStream(fos);   
              oos.writeObject(users);
              //go to login screen
              LoginFrame logIn = new LoginFrame();
              logIn.checkIdentity();
          }
          
          
        } 
        catch (IOException d) {
          d.printStackTrace();
        }
      }
    }
    );
  }
}