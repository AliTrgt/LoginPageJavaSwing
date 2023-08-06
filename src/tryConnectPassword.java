
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class tryConnectPassword {
     
   
    public boolean checkPassword(String enteredPassword) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        DbHelper dbHelper = new DbHelper();
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT userName FROM login WHERE userName = '" + enteredPassword + "'";
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
