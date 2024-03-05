package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    public Statement statement;
    public Connn(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","admin123");
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}