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

import java.io.File;
import java.util.ArrayList;

public class GUITest {
    
    public static void main(String[] args)
    {
        Settings settings = new Settings();
        
        //File roboPartsFile = new File("C:\\Users\\Christian\\Desktop\\cs\\roboParts.txt");
        
        
        
        LoginFrame test = new LoginFrame(settings);
        test.checkIdentity();                //Login test case
        
        //Sales toolbar
        /*JFrame testFrame = new JFrame("Shop Creation/Management Tool");
        testFrame.setSize(600, 480);
        testFrame.setLocation(100,100);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setJMenuBar(new GUIToolbar().createSalesToolbar());
        testFrame.setVisible(true);
        GUIPanel test = new GUIPanel(testFrame);*/
    }
}
