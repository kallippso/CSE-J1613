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

import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class GUIPanel extends JFrame
{
	String[] labels = {"Part Name: ", "Fax: ", "Email: ", "Address: "};
        int numPairs = labels.length;

	public GUIPanel(JFrame currFrame)
	{
            JLayeredPane testPanel = new JLayeredPane();
            BoxLayout layout = new BoxLayout(testPanel, Y_AXIS);
            testPanel.setLayout(layout);
            
            for (int i = 0; i < numPairs; i++) {
                JLabel l = new JLabel(labels[i], JLabel.TRAILING);
                testPanel.add(l);
                JTextField textField = new JTextField(10);
                l.setLabelFor(textField);
                testPanel.add(textField);
            }
            
            currFrame.setLayeredPane(testPanel);
            testPanel.setSize(50, 25);
            currFrame.setVisible(true);
        }
}