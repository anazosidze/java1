package ana.zosidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updatedemo {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "123");
            // 2. Create Statment
            Statement myStatement = myConn.createStatement();
            String query = " UPDATE car SET price='250' WHERE id=1";

            myStatement.executeUpdate(query);
            System.out.println("Succsess");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
