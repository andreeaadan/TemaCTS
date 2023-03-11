package ro.ase.acs.sql.main;

import ro.ase.acs.sql.classes.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 public class Main {
            public static void main(String[] args) {
                String table = "employees";
                try {
                    OpenConnection Connection = new OpenConnection();
                    Connection connection = null;
                    connection = Connection.openConnection();
                    CreateTable createTable = new CreateTable();
                    createTable.createTable(connection, table);
                    InsertData insert = new InsertData();
                    insert.insert(connection, table);
                    ReadData read = new ReadData();
                    read.readData(connection, table);
                    CloseConnection closeConnection = new CloseConnection();
                    closeConnection.closeConnection(connection);
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
 }