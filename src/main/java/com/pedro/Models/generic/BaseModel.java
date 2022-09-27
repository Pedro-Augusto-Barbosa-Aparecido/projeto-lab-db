package com.pedro.Models.generic;

import java.util.Date;

public abstract class BaseModel {
    protected String id;
    protected String name;
    protected Date createdAt;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

}
