package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CloseConnection {
    public void closeConnection(Connection connection) throws SQLException;
}
