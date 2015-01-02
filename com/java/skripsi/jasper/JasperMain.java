/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.skripsi.jasper;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import suratKoneksi.ClassConnection;



/**
 *
 * @author Diiyo
 */
public class JasperMain {
    
    Connection conn = ClassConnection.connection();
 
    
    public void showReport(){
         
        //Path to your .jasper file in your package
        String reportName = "/Users/Diiyo/Documents/myReport.jasper";
               
        //Get a stream to read the file
        //InputStream is = this.getClass().getClassLoader().getResourceAsStream(reportName);
 
        
       try{
            File file = new File(reportName);
            System.out.println(file.exists());
            FileInputStream fis = new FileInputStream(file);
            
            //Fill the report with parameter, connection and the stream reader     
            JasperPrint jp = JasperFillManager.fillReport(fis, null ,conn);
            
         
            //Viewer for JasperReport
            JRViewer jv = new JRViewer(jp);
     
            //Insert viewer to a JFrame to make it showable
            JFrame jf = new JFrame();
            jf.getContentPane().add(jv);
            jf.validate();
            jf.setVisible(true);
            jf.setSize(new Dimension(800,600));
            jf.setLocation(300,100);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
     } 
            catch (JRException ex) {
            System.out.println(ex.getMessage());
        } 
            catch(FileNotFoundException fe){System.out.println(fe.getMessage());}
       
    }
}