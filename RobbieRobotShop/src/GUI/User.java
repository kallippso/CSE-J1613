/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Map;

/**
 *
 * @author christian
 */
public class User {
    
      String username;
      String password;
      int classification;
      
      public User(String username, String password)
      {
          this.username = username;
          this.password = password;
          classification = 0;
      }
      
      public User(String username, String password, int classification)
      {
          this.username = username;
          this.password = password;
          this.classification = classification;
      }
      
      private void changePassword(String newPassword)
      {
          password = newPassword;
      }
      
      public String getUsername()
      {
          return username;
      }
      
      public String getPassword()
      {
          return password;
      }
      
      public int getClassification()
      {
          return classification;
      }
      
      public void setClassification(int newClassification)
      {
          classification = newClassification;
      }
}
