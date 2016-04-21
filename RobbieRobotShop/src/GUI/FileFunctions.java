/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileFunctions {
    public static void serialize(ArrayList<? extends Object> serialize, File file) {
        try {
            if  (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(serialize);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("E: " + e.getMessage());
        }
    }
    
    public static ArrayList<Object> unserialize(File file) {        
        ArrayList<Object> arraylist = new ArrayList<Object>();
        try
        {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList)ois.readObject();
            ois.close();
            fis.close();
        } catch(Exception e) {
            System.out.println("E: " + e.getMessage());
        }
        return arraylist;
    }
}
