/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL_Connection;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author keerthanaakannan
 */
public class SQL_Connect {

    java.sql.Statement stat;
    public SQL_Connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String dburl = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";

            String password = "bunny";

            Connection connection = DriverManager.getConnection(dburl, username, password);
            this.stat = connection.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQL_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public java.sql.Statement retStatement()
    {
        return stat;
    }
}
