/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author christian
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class LoginFrame extends JFrame {
  JButton loginButton;
  JPanel loginPanel;
  JTextField userText;
  JTextField passText;
  JButton newUser;
  JLabel username;
  JLabel password;
  int userClassification = -1;
  
  private Robot cursorMover;
  private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  
  ArrayList<User> users;
  
  FileOutputStream fos;
  ObjectOutputStream oos;
  
  FileInputStream fis;
  ObjectInputStream ois;


  public LoginFrame()  {
      
    super("Welcome to Robbie's Robot Shop");

    
    
    
    
  }
  public int checkIdentity()
  {
    loginButton = new JButton("Login");
    loginPanel = new JPanel();
    userText = new JTextField(15);
    passText = new JPasswordField(15);
    newUser = new JButton("New User?");
    username = new JLabel("Username: ");
    password = new JLabel("Password: ");

    setSize(300, 200);
    setLocation(500, 280);
    loginPanel.setLayout (null); 


    userText.setBounds(110, 20, 150, 20);
    passText.setBounds(110, 55, 150, 20);
    loginButton.setBounds(90, 90, 120, 20);
    newUser.setBounds(90, 125, 120, 20);
    username.setBounds(30, 18, 80, 20);
    password.setBounds(30, 53, 80, 20);

    loginPanel.add(loginButton);
    loginPanel.add(userText);
    loginPanel.add(passText);
    loginPanel.add(newUser);
    loginPanel.add(username);
    loginPanel.add(password);

    getContentPane().add(loginPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    
    
    File check = new File("C:/Users/christian/Documents/NetBeansProjects/CSE-J1613/RobbieRobotShop/test");
    if (check.exists()) {

      //Checks if the file exists. will not add anything if the file does exist.
    } else {
      try {
        File fileInstance = new File("C:/Users/christian/Documents/NetBeansProjects/CSE-J1613/RobbieRobotShop/test"); // write MenuArray to ObjectOutputStream
        fileInstance.createNewFile();
        fis = new FileInputStream(fileInstance);
        ois = new ObjectInputStream(fis);   
        users = (ArrayList<User>)ois.readObject();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }

    
        //fos = new FileOutputStream(fileInstance, true);
        //oos = new ObjectOutputStream(fos);   
        //oos.writeObject(users);
    




    loginButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                        
        try {
          //File file = new File("userPass.txt");
          //Scanner scan = new Scanner(file);
          //String line = null;
          //FileWriter filewrite = new FileWriter(file, true);

          String username = " ";
          char[] password;
          String printedUsername = userText.getText();
          String printedPassword = passText.getText();


          for(User user: users)
          {
              if(printedUsername.equals(user.getUsername()))
              {
                  if(printedPassword.equals(user.getPassword()))
                  {
                        userClassification = user.getClassification();
                        JFrame currentFrame = null;
                        JFrame testFrame = new JFrame("Shop Creation/Management Tool");
                        testFrame.setSize(600, 480);
                        testFrame.setLocation(100,100);
                        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        testFrame.setJMenuBar(new GUIToolbar().createSalesToolbar());
                        testFrame.setVisible(true);
                        dispose();
                  }
                  else
                  {
                      JOptionPane sorry = new JOptionPane();
                      cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));
                      sorry.showConfirmDialog(null, "Password was not found for user.", "ERROR", JOptionPane.OK_CANCEL_OPTION);
                  }
              }
              else
              {
                  JOptionPane sorry = new JOptionPane();
                  cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));
                  sorry.showConfirmDialog(null, "User was not found.", "ERROR", JOptionPane.OK_CANCEL_OPTION);
              }
          }

          if (printedUsername.equals("") && printedPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please insert Username and Password");
          } 
          else {

            JOptionPane.showMessageDialog(null, "Wrong Username / Password");
            userText.setText("");
            passText.setText("");
            userText.requestFocus();
          }
        } 
        catch (Exception ioE) {
          
        }
      }
    }
    );

    newUser.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        NewUser user = new NewUser();
        dispose();
      }
    }
    );
    return userClassification;
  }
}
