import java.util.*;
import java.sql.*;

public class DbHelper {
    
    private String userName = "root";
    private String password = "1234";
    private String dbUrl = "jdbc:mysql://localhost:3306/classicmodels";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
    
    
    
    public Connection getConnection() throws SQLException  {
        
        return DriverManager.getConnection(dbUrl,userName,password);
        
    }
    
    
    public void getErrorMessages(SQLException exception){
        System.out.println("Error Messages : "+exception.getMessage());
        System.out.println("Error Code : "+exception.getErrorCode());
    }
    
    
}
