/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suratKoneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Apli2-Server
 */
public class ClassConnection {
    
    static  Connection conn;
    
    public ClassConnection(){
        conn = null;
    }
    
    public static Connection connection(){
        if(conn==null){
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setDatabaseName("data_surat");
        datasource.setUser("root");
        datasource.setPassword("");
        try{
           conn = datasource.getConnection();
        }
        catch(SQLException e){}
        }
        return conn;
    }
}
