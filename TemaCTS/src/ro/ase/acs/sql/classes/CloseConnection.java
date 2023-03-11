package ro.ase.acs.sql.classes;

import java.sql.Connection;
import java.sql.SQLException;

public class CloseConnection implements ro.ase.acs.sql.interfaces.CloseConnection {

    @Override
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
