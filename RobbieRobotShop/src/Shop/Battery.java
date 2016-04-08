/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battery;

/**
 *
 * @author Kallippso
 */
public class Battery {

    private double energy;
    private double maxPower;
    
    public Battery(){
        energy = -1;
        maxPower = -1;
}
    public Battery (double energy, double maxPower){
        this.energy = energy;
        this.maxPower = maxPower;
    }
    public double getEnergy(){
        return energy;
    }
    public double getMaxPower(){
        return maxPower;
    }
}
