

import java.sql.*;
import java.util.*;



public class tryConnectUserName {
    
    public boolean checkUser(String enteredUserName) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        DbHelper dbHelper = new DbHelper();
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT userName FROM login WHERE userName = '" + enteredUserName + "'";
            resultSet = statement.executeQuery(sql);
            
            return resultSet.next(); // Kullanıcı adı bulunursa true, bulunmazsa false dönecektir.
            
        } catch (SQLException exception) {
            dbHelper.getErrorMessages(exception);
            return false;
        } finally {
            statement.close();
            connection.close();
        }
    }
    

    
    
    
    
}
