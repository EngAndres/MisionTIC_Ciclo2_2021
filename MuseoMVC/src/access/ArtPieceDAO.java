/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import model.ArtPieceModel;
import utils.ConnectionDB;

/**
 *
 * @author casierrav
 */
public class ArtPieceDAO {
    
    private Connection conn = null;
    
    /**
     * 
     * @return 
     */
    public ArrayList<ArtPieceModel> getAllArtPieces() {
        ArrayList<ArtPieceModel> artPieces = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT obra.ob_id, obra.ob_nombre, obra.ob_tipo, obra.ob_costo, museo.mu_nombre, exposicion.ex_nombre, presentacion.pre_fechainicial\n" +
                         "FROM obra\n" +
                         "JOIN exposicion ON obra.ob_ex_id=exposicion.ex_id\n" +
                         "JOIN presentacion ON presentacion.pre_ob_id=obra.ob_id\n" +
                         "JOIN museo ON presentacion.pre_mu_id=museo.mu_id;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ArtPieceModel artPiece = new ArtPieceModel(result.getInt(1), result.getString(2), result.getString(3), result.getDouble(4), result.getString(5), result.getString(6), result.getString(7));
                artPieces.add( artPiece );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return artPieces;
    }

    
    public ArrayList<ArtPieceModel> getFilteredArtPieces(int idMuseum, int idPresentation, String datePresentation, String artPieceName) {
        ArrayList<ArtPieceModel> artPieces = new ArrayList();
        int case_ = -1;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT obra.ob_id, obra.ob_nombre, obra.ob_tipo, obra.ob_costo, museo.mu_nombre, exposicion.ex_nombre, presentacion.pre_fechainicial\n" +
                         "FROM obra\n" +
                         "JOIN exposicion ON obra.ob_ex_id=exposicion.ex_id\n" +
                         "JOIN presentacion ON presentacion.pre_ob_id=obra.ob_id\n" +
                         "JOIN museo ON presentacion.pre_mu_id=museo.mu_id\n" + 
                         "WHERE obra.ob_nombre LIKE ?";
            if(idMuseum != -1){
                if(idPresentation != -1){
                    sql += " AND presentacion.pre_id=?;";
                    case_ = 1;
                }
                else{
                    sql += " AND  presentacion.pre_mu_id=?;";
                    case_ = 2;
                }
            }
            else if(idPresentation != -1){
                    sql += " AND presentacion.pre_fechainicial=?;";
                    case_ = 3;
            }
            System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(sql);            
            statement.setString(1, "%"+artPieceName+"%");
            switch(case_){
                case 1:     statement.setInt(2, idPresentation);        break;
                case 2:     statement.setInt(2, idMuseum);              break;
                case 3:     statement.setString(2, datePresentation);   break;
            }
            System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                ArtPieceModel artPiece = new ArtPieceModel(result.getInt(1), result.getString(2), result.getString(3), result.getDouble(4), result.getString(5), result.getString(6), result.getString(7));
                artPieces.add( artPiece );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return artPieces;
    }
    
    
    public void insertArtPiece(ArtPieceModel artPiece){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO obra(ob_id, ob_nombre, ob_tipo, ob_costo, ob_ex_id) VALUES(?, ?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, artPiece.getId());
            statement.setString(2, artPiece.getName());
            statement.setString(3, artPiece.getType());
            statement.setDouble(4, artPiece.getPrice());
            statement.setInt(5, artPiece.getIdExhibitionFK());
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
}
