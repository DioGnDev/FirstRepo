/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suratModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Apli2-Server
 */
public class PasRegTabelModel extends AbstractTableModel{

    List<EntityDataSurat> listPasReg;
    
    
    public PasRegTabelModel(List<EntityDataSurat> listPasReg) {
        this.listPasReg = listPasReg;
    }

    @Override
    public int getRowCount() {
        
        return listPasReg.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return listPasReg.get(row).getNosurat();
            case 1:
                return listPasReg.get(row).getPenerima();
            case 2:
                return listPasReg.get(row).getPerihal(); 
            case 3:
                return listPasReg.get(row).getIsi();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "No Surat";  
            case 1:
                return "Penerima";
            case 2:
                return "Perihal";
            case 3:
                return "Isi Surat";
            default:
               return null;
                    
                      
                            
        }
    }
}
