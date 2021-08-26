/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ChangeEvent;
import controller.ClickEvent;
import controller.InitialData;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.ArtPieceModel;
import model.MuseumModel;
import model.PresentationModel;

/**
 *
 * @author casierrav
 */
public class ControlsPanel extends JPanel {
 
    private JLabel                       lblMuseums;
    private JComboBox<MuseumModel>       cbxMuseumsList;
    private JLabel                       lblPresentations;
    private JComboBox<PresentationModel> cbxPresentationsList;
    private JLabel                       lblName;
    private JTextField                   txtName;
    private JButton                      btnSearch;
    private JButton                      btnAddArtPiece;
    private JTable                       tblResults;
    
    /**
     * Constructor of the ControlsPanel class.
     * @param resultsPanel
     */
    public ControlsPanel(ResultsPanel resultsPanel){
        this.tblResults = resultsPanel.getTblResults();
        initComponents();
    }
    
    
    /**
     * 
     */
    private void initComponents(){
        setLayout(new GridLayout(2,1));
        InitialData initialData = new InitialData();
        
        // Complete ArtPieces info
        this.setTblResults(initialData.getArtPieces());
        
        // Museum selection
        this.lblMuseums = new JLabel("Museos");
        add(this.getLblMuseums());
        
        this.cbxMuseumsList = new JComboBox();
        this.cbxMuseumsList.setModel(new DefaultComboBoxModel<>(initialData.getMuseums().toArray(new MuseumModel[initialData.getMuseums().size()])));
        this.cbxMuseumsList.setSelectedIndex(0);
        add(this.getCbxMuseumsList());
        
        ChangeEvent changeEvent = new ChangeEvent(this);
        this.getCbxMuseumsList().addActionListener(changeEvent);
        
        
        // Exhibition selection
        this.lblPresentations = new JLabel("Presentación");
        add(this.getLblPresentations());
        
        this.cbxPresentationsList = new JComboBox();
        this.setCbxPresentationsList(initialData.getPresentations());
        add(this.getCbxPresentationsList());
        
        
        // Name patttern 
        this.lblName = new JLabel("Nombre de la Obra");
        add(this.getLblName());
        
        this.txtName = new JTextField();
        add(this.getTxtName());
        
        
        // Search button
        this.btnSearch = new JButton("Buscar");
        add(this.btnSearch);
        
        ClickEvent clickEvent = new ClickEvent(this);
        this.btnSearch.addActionListener(clickEvent);
        
        // Insert  button
        this.btnAddArtPiece = new JButton("Agregar Nueva Obra");
        add(this.getBtnAddArtPiece());
        this.getBtnAddArtPiece().addActionListener(clickEvent);
    }

    /**
     * @return the lblMuseums
     */
    public JLabel getLblMuseums() {
        return lblMuseums;
    }

    /**
     * @return the cbxMuseumsList
     */
    public JComboBox getCbxMuseumsList() {
        return cbxMuseumsList;
    }

    /**
     * @return the lblPresentations
     */
    public JLabel getLblPresentations() {
        return lblPresentations;
    }

    /**
     * @return the cbxPresentationsList
     */
    public JComboBox getCbxPresentationsList() {
        return cbxPresentationsList;
    }

    /**
     * @return the lblName
     */
    public JLabel getLblName() {
        return lblName;
    }

    /**
     * @return the txtName
     */
    public JTextField getTxtName() {
        return txtName;
    }

    /**
     * @return the btnSearch
     */
    public JButton getBtnSearch() {
        return btnSearch;
    }

    /**
     * @return the tblResults
     */
    public JTable getTblResults() {
        return tblResults;
    }

    /**
     * @param presentations
     */
    public void setCbxPresentationsList(ArrayList<PresentationModel> presentations) {
        this.cbxPresentationsList.setModel(new DefaultComboBoxModel<>(presentations.toArray(new PresentationModel[presentations.size()])));
        this.getCbxPresentationsList().setSelectedIndex(0);
    }

    /**
     * @param artPieces
     */
    public void setTblResults(ArrayList<ArtPieceModel> artPieces) {
        String[] headers = {"ID", "Nombre", "Tipo", "Costo", "Museo", "Exposición", "Presentación"};
        this.tblResults.removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.tblResults.setModel(tableModel);
        for(int i=0; i<artPieces.size(); i++){
            tableModel.addRow(artPieces.get(i).toArray() );
        }
    }

    /**
     * @return the btnAddArtPiece
     */
    public JButton getBtnAddArtPiece() {
        return btnAddArtPiece;
    }

   
}