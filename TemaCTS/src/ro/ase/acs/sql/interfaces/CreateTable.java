package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateTable {
    public void createTable(Connection connection, String table) throws SQLException;
}
