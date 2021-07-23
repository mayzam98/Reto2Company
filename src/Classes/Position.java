/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mayko
 */
public class Position {
    
    private String namePosition;
    private int hierarchicalLevel;

    public Position(String namePosition, int hierarchicalLevel) {
        
        this.namePosition = namePosition;
        this.hierarchicalLevel = hierarchicalLevel;
    
    }
    
    /**
     * @return the namePosition
     */
    public String getNamePosition() {
        return namePosition;
    }

    /**
     * @param namePosition the namePosition to set
     */
    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    /**
     * @return the hierarchicalLevel
     */
    public int getHierarchicalLevel() {
        return hierarchicalLevel;
    }

    /**
     * @param hierarchicalLevel the hierarchicalLevel to set
     */
    public void setHierarchicalLevel(int hierarchicalLevel) {
        this.hierarchicalLevel = hierarchicalLevel;
    }
    
}
