package com.pedro.DAO.user;

import com.pedro.DAO.ConnectionDB;
import com.pedro.Models.generic.IBaseModelDAO;

import java.sql.Connection;

public class UserDAO extends ConnectionDB implements IBaseModelDAO {
    private Connection con;
    private final String table = "users";

    public UserDAO(String database, String user, String urlDB, String password) {
        super(database, user, urlDB, password);

        try {
            con = this.connect("users");
        } catch (Exception e) {
            System.out.printf(
                    "Erro ao conectar com o banco %s, verifique se a tabela %s esta criada ou o banco %s existe",
                    this.getDatabase(),
                    this.table,
                    this.getDatabase()
            );

            throw new RuntimeException(e);

        }

    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void findOne() {

    }

    @Override
    public void findMany() {

    }
}
