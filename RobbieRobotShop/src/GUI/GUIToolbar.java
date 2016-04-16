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
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Dimension;

public class GUIToolbar {
    //menu is the file menu
    JMenu fileMenu, editMenu, createMenu, viewMenu, toolsMenu, helpMenu;
    JMenuBar menuBar = new JMenuBar();
    JMenuItem menuItem;
    Robot cursorMover;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
 
    public GUIToolbar()
    {
        try {
            cursorMover = new Robot();
        } catch(Exception e)
        {
        }
    }
    
    public void createFileMenu()
    {
        fileMenu = new JMenu("File");
        fileMenu.getAccessibleContext().setAccessibleDescription("File menu");
        menuBar.add(fileMenu);
        
        menuItem = new JMenuItem(new AbstractAction("New Shop")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Creates a new shop.");
        fileMenu.add(menuItem);

        fileMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Load Shop")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();  
                            cursorMover.mouseMove((int)(22.5*screenSize.getWidth()/48), (int)(25.5*screenSize.getHeight()/48)); 
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Loads an already created shop.");
        fileMenu.add(menuItem);

        fileMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Save Shop")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION); 
                            cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));  
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Saves current shop.");
        fileMenu.add(menuItem);

        fileMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Exit") 
        {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {
                            JOptionPane areYouSure = new JOptionPane();
                            int areYouSureSelection = areYouSure.showConfirmDialog(null, "Do you really want to exit? All unsaved progress will be lost.","Warning", JOptionPane.YES_NO_OPTION);
                            cursorMover.mouseMove((int)(screenSize.getWidth()/2.0), (int)(screenSize.getHeight()/2.0));
                            if(areYouSureSelection == JOptionPane.YES_OPTION)
                                System.exit(0);
                            else{}
                        }
        });
        
        menuItem.getAccessibleContext().setAccessibleDescription("Saves current shop.");
        fileMenu.add(menuItem);
      
    }
    
    public void createEditMenu()
    {
        editMenu = new JMenu("Edit");
        editMenu.getAccessibleContext().setAccessibleDescription("Edit menu");
        menuBar.add(editMenu);
        
        menuItem = new JMenuItem(new AbstractAction("Cut")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "Nothing could have possible been made to cut.", "What were you thinking?", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Cut.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        editMenu.add(menuItem);

        editMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Copy")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "Nothing could have possible been made to copy.", "What were you thinking?", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Copy.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        editMenu.add(menuItem);

        editMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Paste")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "Nothing could have possible been made to paste.", "What were you thinking?", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Paste.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        editMenu.add(menuItem);

        editMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Preferences")
        {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            JFrame preferences = new JFrame("Preferences");
                            preferences.setSize(600, 480);
                            preferences.setLocation(150,150);
                            preferences.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            preferences.setVisible(true);
                        }
        });
        
        
        menuItem.getAccessibleContext().setAccessibleDescription("Opens preferences menu.");
        editMenu.add(menuItem);        
    }
    
    public void createCreateMenu()
    {
        createMenu = new JMenu("Create");
        createMenu.getAccessibleContext().setAccessibleDescription("Create menu");
        menuBar.add(createMenu);
        
        menuItem = new JMenuItem(new AbstractAction("Order")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Create order.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));

        createMenu.add(menuItem);

        createMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Customer")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Create customer.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);

        createMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Sales Associate")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Create sales associate.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);

        createMenu.addSeparator();
        createMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Robot Model")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Create robot model.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);

        createMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Robot Component")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Create robot component.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);        
    }
    
    public void createViewMenu()
    {
        viewMenu = new JMenu("View");
        viewMenu.getAccessibleContext().setAccessibleDescription("View menu");
        menuBar.add(viewMenu);
        
        menuItem = new JMenuItem(new AbstractAction("Orders")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("View orders.");
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Customers")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("View customers.");
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Sales Associates")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("View sales associates.");
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        viewMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Robot Models")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("View robot models.");
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Robot Components")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("View robot components.");;
        viewMenu.add(menuItem);        
    }
    
    public void createToolsMenu()
    {
        toolsMenu = new JMenu("Tools");
        toolsMenu.getAccessibleContext().setAccessibleDescription("Tools menu");
        menuBar.add(toolsMenu);
    }
    
    public void createHelpMenu()
    {
        helpMenu = new JMenu("Help");
        helpMenu.getAccessibleContext().setAccessibleDescription("Help menu");
        menuBar.add(helpMenu);
        
        menuItem = new JMenuItem(new AbstractAction("Quick Start")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Starts you off with pre-made shop items/customers/workers.");
        helpMenu.add(menuItem);

        helpMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("Manual")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane sorry = new JOptionPane();
                            sorry.showConfirmDialog(null, "This feature is currently not available.", "Sorry about that.", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Loads the manual.");
        helpMenu.add(menuItem);

        helpMenu.addSeparator();
        
        menuItem = new JMenuItem(new AbstractAction("About")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                            JOptionPane about = new JOptionPane();
                            about.showConfirmDialog(null, "The GUI you are currently using was created 4/8/2016. Hopefully more features have been added since then.", "About", JOptionPane.OK_CANCEL_OPTION);   
            }
        });
        menuItem.getAccessibleContext().setAccessibleDescription("Loads the about message.");
        helpMenu.add(menuItem);

    }
    
    public JMenuBar createSalesToolbar()
    {
        createFileMenu();
        createEditMenu();
        createCreateMenu();
        createViewMenu();
        createToolsMenu();
        createHelpMenu();
        return menuBar;
    }
}
