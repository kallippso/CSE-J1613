/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;
/**
 *
 * @author christian
 */
public class ComponentType{
    private String typeName;
    private Class className;
    
    public ComponentType(String typeName, Class className)
    {
        this.typeName = typeName;
        this.className = className;
    }
    
    public String getTypeName()
    {
        return typeName;
    }
    
    public Class getClassName()
    {
        return className;
    }
    protected void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }
}
