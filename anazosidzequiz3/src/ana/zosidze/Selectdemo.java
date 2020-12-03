package ana.zosidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectdemo {
    public static void main(String[] args) {
        try{
            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection ("jdbc:h2:tcp://localhost/~/test", "sa","123");
            Statement myStatement = myConn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery("select * from car");
            while (myResultSet.next()) {
                System.out.println(myResultSet.getString("id") + " " + myResultSet.getString("manufacturer") + " "+ myResultSet.getString("model") +" "+ myResultSet.getString("price") );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
