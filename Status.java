
package j1613;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the class defining a Status
 */

public class Status {
    
    // private instance variables
    private final int PROCESSING = 0;
    private final int WORKING = 1;
    private final int READY = 2;
    private final int SHIPPING = 3;
    private final int COMPLETED = 4;
    private int status;
    
    // constructors
    public Status()
    {
        status = PROCESSING;
    }
    
    public Status(int i)
    {
        status = i;
    }
    
    //methods
    public int getStatus(){
        return status;
    }
    
    public void setStatus(int i){
        this.status = i;
    }
    
    @Override
    public String toString()
    {
        if(status == 0)
            return "Processing";
        else if(status == 1)
            return "Working";
        else if(status == 2)
            return "Ready";
        else if(status == 3)
            return "Shipping";
        else if(status == 4)
            return "Completed";
        return "invalid";
    }
}
