/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import access.ArtPieceDAO;
import controller.ClickEvent;
import controller.InitialData;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.ArtPieceModel;
import model.ExhibitionModel;
import model.MuseumModel;

/**
 *
 * @author casierrav
 */
public class AddArtPiece extends JFrame implements ActionListener {
    private JLabel                     lblId;
    private JTextField                 txtId;
    private JLabel                     lblName;
    private JTextField                 txtName;
    private JLabel                     lblType;
    private JTextField                 txtType;
    private JLabel                     lblPrice;
    private JTextField                 txtPrice;
    private JLabel                     lblExhibition;
    private JComboBox<ExhibitionModel> cbxExhibition;
    private JLabel                     lblOnPresentation;
    private JCheckBox                  chbOnPresentation;
    private JLabel                     lblMuseums;
    private JComboBox<MuseumModel>     cbxMuseums;
    private JLabel                     lblPresentation;
    private JTextField                 txtPresentation;
    private JButton                    btnInsertArtPiece;
    
    public AddArtPiece(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Museos - Agregar Obra");
        setLayout(new GridLayout(8,2));
        InitialData initialData = new InitialData();
        
        this.lblId = new JLabel("ID de la Obra");
        add(this.lblId);
        this.txtId = new JTextField();
        add(this.txtId);
        
        
        this.lblName = new JLabel("Nombre de la Obra");
        add(this.lblName);
        this.txtName = new JTextField();
        add(this.txtName);
        
        
        this.lblType = new JLabel("Tipo de Obra");
        add(this.lblType);
        this.txtType = new JTextField();
        add(this.txtType);
        
        
        this.lblPrice = new JLabel("Precio de la Obra");
        add(this.lblPrice);
        this.txtPrice = new JTextField();
        add(this.txtPrice);
        
        this.lblExhibition = new JLabel("Seleccione exposición:");
        add(this.lblExhibition);
        this.cbxExhibition = new JComboBox();
        this.cbxExhibition.setModel(new DefaultComboBoxModel<>(initialData.getExhibitions().toArray(new ExhibitionModel[initialData.getExhibitions().size()])));
        this.cbxExhibition.setSelectedIndex(0);
        add(this.cbxExhibition);
               
        
        this.lblOnPresentation = new JLabel("Agregar presentación?");
        this.chbOnPresentation = new JCheckBox();
        
        this.lblMuseums = new JLabel("Seleccione museo:");
        this.cbxMuseums = new JComboBox<>();
        
        this.lblPresentation = new JLabel("Escriba Presentación");
        this.txtPresentation = new JTextField();
        
        this.btnInsertArtPiece = new JButton("Agregar a BD");
        add(this.btnInsertArtPiece);
        
        this.btnInsertArtPiece.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnInsertArtPiece) {
            int    id = Integer.parseInt( (String)this.txtId.getText()); 
            String name = (String)this.txtName.getText(); 
            String type = (String)this.txtType.getText(); 
            double price= Double.parseDouble( (String)this.txtPrice.getText());  
            int    idExhibitionFK = ((ExhibitionModel)this.cbxExhibition.getSelectedItem()).getId();
    
            ArtPieceModel artPiece = new ArtPieceModel(id, name, type, price, idExhibitionFK);
            
            
            //System.out.println(idMuseum + " " + idPresentation + " " + datePresentation + " " + artPieceName);
            ArtPieceDAO artPieceDAO = new ArtPieceDAO();
            artPieceDAO.insertArtPiece(artPiece);
        }
    }
}
