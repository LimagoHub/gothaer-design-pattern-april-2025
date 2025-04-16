package de.fi;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        Connection con = DriverManager.getConnection("jdbc:h2:c:/tmp/db/gothaer;AUTO_SERVER=TRUE", "sa", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from tbl_personen");
        ResultSetMetaData rsmd = rs.getMetaData();

        for( int i = 1; i <= rsmd.getColumnCount(); i++ ){
            System.out.printf("%-40s", rsmd.getColumnName(i));
        }
        System.out.println();
        while( rs.next() ){
            for( int i = 1; i <= rsmd.getColumnCount(); i++ ){
                System.out.printf("%-40s", rs.getString(i));
            }
            System.out.println();
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
