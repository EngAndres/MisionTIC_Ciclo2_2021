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
public class PresentationModel {
    private int    id;
    private String dates;
    private int    artPieceFK;
    private int    museumFK;
        
    /**
     * 
     * @param dates
     * @param artPieceFK
     * @param museumFK 
     */
    public PresentationModel(String dates, int artPieceFK, int museumFK){
        this.dates      = dates;
        this.artPieceFK = artPieceFK;
        this.museumFK   = museumFK;
    }
    
    /**
     * 
     * @param id
     * @param dates
     * @param artPieceFK
     * @param museumFK 
     */
    public PresentationModel(int id, String dates, int artPieceFK, int museumFK){
        this.id         = id;
        this.dates      = dates;
        this.artPieceFK = artPieceFK;
        this.museumFK   = museumFK;
    }
    
    /**
     * @return the dates
     */
    public String getDates() {
        return dates;
    }

    /**
     * @param dates the dates to set
     */
    public void setDates(String dates) {
        this.dates = dates;
    }

    /**
     * @return the artPieceFK
     */
    public int getArtPieceFK() {
        return artPieceFK;
    }

    /**
     * @return the museumFK
     */
    public int getMuseumFK() {
        return museumFK;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    public String toString(){
        return this.dates;
    }
}