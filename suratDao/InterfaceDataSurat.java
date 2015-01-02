/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suratDao;

import java.util.List;
import suratModel.EntityDataSurat;

/**
 *
 * @author Apli2-Server
 */
public interface InterfaceDataSurat {
    
    public void insert(EntityDataSurat Pasien);
    public void update(EntityDataSurat Pasien);
    public void delete(EntityDataSurat Pasien);
    public List<EntityDataSurat> getAll();
    
}
