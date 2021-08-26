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
import model.ExhibitionModel;
import utils.ConnectionDB;


/**
 *
 * @author casierrav
 */
public class ExhibitionDAO {
    private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ExhibitionModel> getAllExhibitions() {
        ArrayList<ExhibitionModel> exhibitions = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT ex_id, ex_nombre FROM exposicion;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ExhibitionModel exhibition = new ExhibitionModel(result.getInt(1), result.getString(2));
                exhibitions.add( exhibition );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return exhibitions;
    }

    
    /**
     * 
     * @param id
     * @return 
     */
    public ExhibitionModel getExhibition(int id) {
        ExhibitionModel exhibition = null;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT ex_nombre FROM exposicion WHERE ex_id=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                exhibition = new ExhibitionModel(id, result.getString(1));
                break;
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return exhibition;
    }

    
    /**
     * 
     * @param exhibition 
     */
    public void insertExhibition(ExhibitionModel exhibition){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO exposicion(ex_id, ex_nombre) VALUES (?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, exhibition.getId());
            statement.setString(2, exhibition.getName());
            
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
     * @param exhibition 
     */
    public void updateExhibition(ExhibitionModel exhibition) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE exposicion SET ex_nombre =? WHERE ex_id=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, exhibition.getName());
            statement.setInt(2, exhibition.getId());
            
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
    public void deleteExhibition(int id) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM exposicion WHERE ex_id=?;";
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