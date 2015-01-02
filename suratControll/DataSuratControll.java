/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suratControll;

import java.util.ArrayList;
import java.util.List;
import suratDao.DaoDataSurat;
import suratDao.InterfaceDataSurat;
import suratModel.EntityDataSurat;
import suratView.FrameSurat;

/**
 *
 * @author Diiyo
 */
public class DataSuratControll {
    FrameSurat ui;
    InterfaceDataSurat i;
    List<EntityDataSurat> le;

    public DataSuratControll(FrameSurat ui) {
        this.ui=ui;
        i = new DaoDataSurat();
        le = new ArrayList<EntityDataSurat>();
        
        
    }
    
    public void insert(){
        EntityDataSurat e = new EntityDataSurat();
        e.setNosurat(ui.getNosurat().getText());
        e.setPenerima(ui.getPenerima().getText());
        e.setPerihal(ui.getPerihal().getText());
        e.setIsi(ui.getIsi().getText());
        
        i.insert(e);
        
    }
    
}
