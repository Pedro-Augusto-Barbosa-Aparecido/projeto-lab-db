package com.pedro.DAO.generic;

import com.google.protobuf.Any;
import com.pedro.Models.generic.BaseModel;

import java.util.List;

public interface IBaseModelDAO {
    public void insert(BaseModel model);
    public void delete(int id);
    public void update(int id, List<String> columns, BaseModel model);
    public BaseModel findOne(int id);
    public void findOne(String column);
    public void findMany();

}
