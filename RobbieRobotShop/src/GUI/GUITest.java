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

public class GUITest {
    
    public static void main(String[] args)
    {
        LoginFrame test = new LoginFrame();
        test.checkIdentity();
        /*JFrame currentFrame = null;
        JFrame testFrame = new JFrame("Shop Creation/Management Tool");
        testFrame.setSize(600, 480);
        testFrame.setLocation(100,100);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setJMenuBar(new GUIToolbar().createSalesToolbar());
        testFrame.setVisible(true);*/
    }
}
