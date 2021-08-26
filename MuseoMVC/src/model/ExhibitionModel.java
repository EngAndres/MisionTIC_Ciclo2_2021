/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author casierrav
 */
public class ExhibitionModel {
    private int    id;
    private String name;
    
    
    /**
     * 
     * @param id
     * @param name 
     */
    public ExhibitionModel(int id, String name){
        this.id    = id;
        this.name = name;                
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String toString(){
        return this.name;
    }
}