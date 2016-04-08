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


public class GUIToolbar {
    //menu is the file menu
    JMenu fileMenu, editMenu, createMenu, viewMenu, toolsMenu, helpMenu;
    JMenuBar menuBar = new JMenuBar();
    JMenuItem menuItem;
 
    public GUIToolbar()
    {
    }
    
    public void createFileMenu()
    {
        fileMenu = new JMenu("File");
        fileMenu.getAccessibleContext().setAccessibleDescription("File menu");
        menuBar.add(fileMenu);
        
        menuItem = new JMenuItem("New Shop");
        menuItem.getAccessibleContext().setAccessibleDescription("Creates a new shop.");
        fileMenu.add(menuItem);

        fileMenu.addSeparator();
        
        menuItem = new JMenuItem("Load Shop");
        menuItem.getAccessibleContext().setAccessibleDescription("Loads an already created shop.");
        fileMenu.add(menuItem);

        fileMenu.addSeparator();
        
        menuItem = new JMenuItem("Save Shop");
        menuItem.getAccessibleContext().setAccessibleDescription("Saves current shop.");
        fileMenu.add(menuItem);

        fileMenu.addSeparator();
        
        menuItem = new JMenuItem("Exit");
        menuItem.getAccessibleContext().setAccessibleDescription("Saves current shop.");
        fileMenu.add(menuItem);
      
    }
    
    public void createEditMenu()
    {
        editMenu = new JMenu("Edit");
        editMenu.getAccessibleContext().setAccessibleDescription("Edit menu");
        menuBar.add(editMenu);
        
        menuItem = new JMenuItem("Cut");
        menuItem.getAccessibleContext().setAccessibleDescription("Cut.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        editMenu.add(menuItem);

        editMenu.addSeparator();
        
        menuItem = new JMenuItem("Copy");
        menuItem.getAccessibleContext().setAccessibleDescription("Copy.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        editMenu.add(menuItem);

        editMenu.addSeparator();
        
        menuItem = new JMenuItem("Paste");
        menuItem.getAccessibleContext().setAccessibleDescription("Paste.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        editMenu.add(menuItem);

        editMenu.addSeparator();
        
        menuItem = new JMenuItem("Preferences");
        menuItem.getAccessibleContext().setAccessibleDescription("Opens preferences menu.");
        editMenu.add(menuItem);        
    }
    
    public void createCreateMenu()
    {
        createMenu = new JMenu("Create");
        createMenu.getAccessibleContext().setAccessibleDescription("Create menu");
        menuBar.add(createMenu);
        
        menuItem = new JMenuItem("Order");
        menuItem.getAccessibleContext().setAccessibleDescription("Create order.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));

        createMenu.add(menuItem);

        createMenu.addSeparator();
        
        menuItem = new JMenuItem("Customer");
        menuItem.getAccessibleContext().setAccessibleDescription("Create customer.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);

        createMenu.addSeparator();
        
        menuItem = new JMenuItem("Sales Associate");
        menuItem.getAccessibleContext().setAccessibleDescription("Create sales associate.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);

        createMenu.addSeparator();
        createMenu.addSeparator();
        
        menuItem = new JMenuItem("Robot Model");
        menuItem.getAccessibleContext().setAccessibleDescription("Create robot model.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);

        createMenu.addSeparator();
        
        menuItem = new JMenuItem("Robot Component");
        menuItem.getAccessibleContext().setAccessibleDescription("Create robot component.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        createMenu.add(menuItem);        
    }
    
    public void createViewMenu()
    {
        viewMenu = new JMenu("View");
        viewMenu.getAccessibleContext().setAccessibleDescription("View menu");
        menuBar.add(viewMenu);
        
        menuItem = new JMenuItem("Orders");
        menuItem.getAccessibleContext().setAccessibleDescription("View orders.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        
        menuItem = new JMenuItem("Customers");
        menuItem.getAccessibleContext().setAccessibleDescription("View customers.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        
        menuItem = new JMenuItem("Sales Associates");
        menuItem.getAccessibleContext().setAccessibleDescription("View sales associates.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        viewMenu.addSeparator();
        
        menuItem = new JMenuItem("Robot Models");
        menuItem.getAccessibleContext().setAccessibleDescription("View robot models.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
        viewMenu.add(menuItem);

        viewMenu.addSeparator();
        
        menuItem = new JMenuItem("Robot Components");
        menuItem.getAccessibleContext().setAccessibleDescription("View robot components.");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
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
        
        menuItem = new JMenuItem("Quick Start");
        menuItem.getAccessibleContext().setAccessibleDescription("Starts you off with pre-made shop items/customers/workers.");
        helpMenu.add(menuItem);

        helpMenu.addSeparator();
        
        menuItem = new JMenuItem("Manual");
        menuItem.getAccessibleContext().setAccessibleDescription("Loads the manual.");
        helpMenu.add(menuItem);

        helpMenu.addSeparator();
        
        menuItem = new JMenuItem("About");
        menuItem.getAccessibleContext().setAccessibleDescription("Loads the about message.");
        helpMenu.add(menuItem);

    }
    
    public JMenuBar createStandardToolbar()
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
