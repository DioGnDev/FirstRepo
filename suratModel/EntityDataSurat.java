/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suratModel;

/**
 *
 * @author Apli2-Server
 */
public class EntityDataSurat {
 
    private String nosurat;
    private String penerima;
    private String perihal;
    private String isi;

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getNosurat() {
        return nosurat;
    }

    public void setNosurat(String nosurat) {
        this.nosurat = nosurat;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }
    
    
    
}