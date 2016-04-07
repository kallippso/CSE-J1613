/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;
import java.awt.image.RenderedImage;

/**
 *
 * @author Luis
 */
public class Shop {

    public static void main(String[] args) {


    }


    public Shop()
    {


    }


    public void createPart(ComponentType componentName, String name, double weight, double cost, String description, RenderedImage image)
    {
       RobotPart newModel;
       switch(componentName.getTypeName())
       {
           case "Head": //add to shop's data structure
               newModel = new Head(name, componentName, weight, cost, description, image);
               //headList.add(newModel);
               break;
           case "Torso"://add to shop's data structure
               //createTorso()
               //torsoList.add(newModel);
               break;
           case "Locomotor"://add to shop's data structure
               newModel = new Locomotor(name, componentName, weight, cost, description, image);
               //locomotorList.add(newModel);
               break;
           case "Battery"://add to shop's data structure
               newModel = new Battery(name, componentName, weight, cost, description, image);
               //batteryList.add(newModel);
               break;
           case "Arm"://add to shop's data structure
               newModel = new Arm(name, componentName, weight, cost, description, image);
               //armList.add(newModel);
               break;
           default:
               System.out.println("Component name not recognized.");
               break;
               
       }
    }


    void newCustomer()
    {


    }

    void placeOrder()
    {


    }


    void runReport()
    {


    }


    void save()
    {


    }

}
