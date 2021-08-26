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
import model.PresentationModel;
import utils.ConnectionDB;

/**
 *
 * @author casierrav
 */
public class PresentationDAO {
    
    private Connection conn = null;
    
    /**
     * 
     * @return 
     */
    public ArrayList<PresentationModel> getAllPresentations() {
        ArrayList<PresentationModel> presentations = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT pre_id, pre_fechainicial, pre_ob_id, pre_mu_id FROM presentacion;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                PresentationModel presentation = new PresentationModel(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4));
                presentations.add( presentation );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return presentations;
    }

    
    /**
     * 
     * @param idMuseum
     * @return 
     */
    public ArrayList<PresentationModel> getPresentationsByMuseum(int idMuseum) {
        ArrayList<PresentationModel> presentations = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT pre_id, pre_fechainicial, pre_ob_id, pre_mu_id FROM presentacion WHERE pre_mu_id=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idMuseum);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                PresentationModel presentation = new PresentationModel(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4));
                presentations.add( presentation );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return presentations;
    }
    
    
    /**
     * 
     * @param id
     * @return 
     */
    public PresentationModel getPresentation(int id) {
        PresentationModel presentation = null;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT pre_fechainicial, pre_ob_id, pre_mu_id FROM presentacion WHERE pre_id=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                presentation = new PresentationModel(id, result.getString(1), result.getInt(2), result.getInt(3));
                break;
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return presentation;
    }

    
    /**
     * 
     * @param presentation 
     */
    public void insertPresentation(PresentationModel presentation){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES (?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, presentation.getDates());
            statement.setInt(2, presentation.getArtPieceFK());
            statement.setInt(3, presentation.getMuseumFK());
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    
    /**
     * 
     * @param presentation 
     */
    public void updatePresentation(PresentationModel presentation) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE presentacion SET pre_fechainicial =? WHERE pre_id=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, presentation.getDates());
            statement.setInt(2, presentation.getId());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    
    /**
     * 
     * @param id 
     */
    public void deletePresentation(int id) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM presentacion WHERE pre_id=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
}
