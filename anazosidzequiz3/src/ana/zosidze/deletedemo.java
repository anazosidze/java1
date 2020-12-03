package ana.zosidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deletedemo {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "123");
            Statement myStatement = myConn.createStatement();

            String query = "DELETE FROM car WHERE manufacturer='jiguli'";

            int deletedRows=myStatement.executeUpdate(query);  // abrunebs ramdeni row წაიშალა
            System.out.println("deleted : "+deletedRows+" Row");
            System.out.println("Succsess");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
