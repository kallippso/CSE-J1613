/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */


public class Settings{
    public File usersFile = new File("C:\\Users\\Christian\\Desktop\\cs\\users.txt");
    public ArrayList<User> users = new ArrayList<User>();
    
    public Settings() {
        try {
            if (!usersFile.exists()) {
                usersFile.createNewFile();
            } else {
                ArrayList<Object> userObjects = FileFunctions.unserialize(usersFile);
                for (Object x : userObjects) {
                    users.add((User)x);
                }
                userObjects = null;
            }
        } catch (Exception e) {
            //System.out.println("S: " + e.getMessage());
        }
    }
}
