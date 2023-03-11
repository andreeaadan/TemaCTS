package ro.ase.acs.sql.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData implements ro.ase.acs.sql.interfaces.InsertData{

    @Override
    public void insert(Connection connection, String table) throws SQLException {
        String sqlInsert = "INSERT INTO" + table + " VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlInsert);
        statement.close();

        String sqlInsertWithParams = "INSERT INTO" + table + " VALUES VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertWithParams);
       preparedStatement.setInt(1, 2);
        preparedStatement.setString(2, "Popescu Ion");
        preparedStatement.setString(3, "Iasi");
        preparedStatement.setDouble(4, 4500);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.commit();
    }
}
