/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static sun.security.jgss.GSSUtil.login;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;

/**
 *
 * @author christian
 */

public class NewUser extends JFrame {
   
  JButton create;
  JPanel newUserPanel;
  JTextField username;
  JTextField password;
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
    username = new JTextField(15);
    password = new JPasswordField(15);


    setSize(300, 200);
    setLocation(500, 280);
    newUserPanel.setLayout (null); 


    username.setBounds(70, 30, 150, 20);
    password.setBounds(70, 65, 150, 20);
    create.setBounds(110, 100, 80, 20);

    newUserPanel.add(create);
    newUserPanel.add(username);
    newUserPanel.add(password);

    getContentPane().add(newUserPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    File check = new File("userinfo.txt");
    if (check.exists()) {

      //Checks if the file exists. will not add anything if the file does exist.
    } else {
      try {
        File fileInstance = new File("userinfo.txt"); // write MenuArray to ObjectOutputStream
        fis = new FileInputStream(fileInstance);
        ois = new ObjectInputStream(fis);   
        users = (ArrayList<User>)ois.readObject();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }




    create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {        
          File fileInstance = new File("userinfo.txt");
          String printedUsername = username.getText();
          String printedPassword = password.getText();
          
          for(User user: users)
          {
              if(printedUsername.equals(user.getUsername()))
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