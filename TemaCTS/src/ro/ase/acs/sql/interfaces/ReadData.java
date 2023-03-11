package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ReadData {
    public void readData(Connection connection, String table) throws SQLException;
}
