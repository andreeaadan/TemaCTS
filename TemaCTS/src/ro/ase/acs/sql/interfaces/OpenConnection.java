package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface OpenConnection {
    public Connection openConnection() throws SQLException, ClassNotFoundException;
}
