package com.pedro.DAO.user;

import com.pedro.DAO.ConnectionDB;
import com.pedro.DAO.generic.IBaseModelDAO;
import com.pedro.Models.generic.BaseModel;

import java.sql.Connection;
import java.util.List;

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
    public void insert(BaseModel model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, List<String> columns, BaseModel model) {

    }

    @Override
    public BaseModel findOne(int id) {
        return null;
    }

    @Override
    public void findOne(String column) {

    }

    @Override
    public void findMany() {

    }
}
