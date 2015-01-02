/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suratDao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import suratKoneksi.ClassConnection;
import suratModel.EntityDataSurat;

/**
 *
 * @author Diiyo
 */
public class DaoDataSurat implements InterfaceDataSurat{
    
    Connection con;
    
    private String insert = "insert into data (no_surat,penerima,perihal,isi_surat) values (?,?,?,?)";
    private String update = "update data set no_surat=?,penerima=?,perihal=?,isi_surat=?";
    private String delete = "delete from data where no_surat=?";
    private String searchbyName = "select * from pasreg where nama like ?";

    public DaoDataSurat() {
        con = ClassConnection.connection();
        
    }
   
    @Override
    public void insert(EntityDataSurat pasien) {
         PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(insert);
            ps.setString(1, pasien.getNosurat());
            ps.setString(2, pasien.getPenerima());
            ps.setString(3, pasien.getPerihal());
            ps.setString(4, pasien.getIsi());
            ps.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "your data was added succesfuly");
            
            
        }
        catch(SQLException e){e.printStackTrace();}
      
        finally{
            try{
                ps.close();
            }
            catch(SQLException e){e.printStackTrace();}
        }
    }

    @Override
    public void update(EntityDataSurat pasien) {
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(update);
            ps.setString(1, pasien.getNosurat());
            ps.setString(2, pasien.getPenerima());
            ps.setString(3, pasien.getPerihal());
            ps.setString(4, pasien.getIsi());
            ps.executeUpdate();
            
        }
        catch(SQLException e){e.printStackTrace();}
      
        finally{
            try{
                ps.close();
            }
            catch(SQLException e){e.printStackTrace();}
        }
    }

    @Override
    public void delete(EntityDataSurat Pasien) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<EntityDataSurat> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
}
