/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import access.ArtPieceDAO;
import java.util.ArrayList;
import access.ExhibitionDAO;
import model.ExhibitionModel;
import access.MuseumDAO;
import model.MuseumModel;
import access.PresentationDAO;
import model.ArtPieceModel;
import model.PresentationModel;


/**
 *
 * @author casierrav
 */
public class InitialData {
    private ArrayList<MuseumModel>       museums       = null;
    private ArrayList<ExhibitionModel>   exhibitions   = null;
    private ArrayList<PresentationModel> presentations = null;
    private ArrayList<ArtPieceModel>     artPieces = null;
    
    /**
     * Zero-parameters constructor
     */
    public InitialData(){
        MuseumDAO museumDAO = new MuseumDAO();
        this.museums = museumDAO.getAllMuseums();
        this.museums.add(0, new MuseumModel(-1, "Todos los museos"));
        
        ExhibitionDAO exhibitionDAO = new ExhibitionDAO();
        this.exhibitions = exhibitionDAO.getAllExhibitions();
        this.exhibitions.add(0, new ExhibitionModel(-1, "Todas las exposiciones"));
        
        PresentationDAO presentationDAO = new PresentationDAO();
        this.presentations = presentationDAO.getAllPresentations();
        this.presentations.add(0, new PresentationModel(-1, "Todas las presentaciones", -1, -1));
        
        ArtPieceDAO artPieceDAO = new ArtPieceDAO();
        this.artPieces = artPieceDAO.getAllArtPieces();
    }

    /**
     * @return the museums
     */
    public ArrayList<MuseumModel> getMuseums() {
        return museums;
    }

    /**
     * @return the exhibitions
     */
    public ArrayList<ExhibitionModel> getExhibitions() {
        return exhibitions;
    }

    /**
     * @return the presentations
     */
    public ArrayList<PresentationModel> getPresentations() {
        return presentations;
    }

    /**
     * @return the artPieces
     */
    public ArrayList<ArtPieceModel> getArtPieces() {
        return artPieces;
    }
}