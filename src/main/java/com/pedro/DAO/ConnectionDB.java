package com.pedro.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDB {
    private String database;
    private String user;
    private String password;
    private String urlDB;

    public ConnectionDB(String database, String user, String urlDB, String password) {
        this.database = database;
        this.user = user;
        this.urlDB = "jdbc:mysql://" + urlDB + "/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        this.password = password;

    }

    public Connection connect(String table) throws Exception {
        Connection con = null;

        try {
            con = DriverManager.getConnection(this.urlDB, this.user, this.password);
        } catch (SQLException e) {
            throw new Exception(e);
        }

        return con;

    }

    public String getUrlDB() {
        return urlDB;
    }

    public String getDatabase() {
        return database;
    }

    public String getUserName() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
