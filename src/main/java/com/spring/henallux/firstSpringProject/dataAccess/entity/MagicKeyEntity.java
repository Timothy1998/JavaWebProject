package com.spring.henallux.firstSpringProject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table (name="magickey")
public class MagicKeyEntity {

    @Id
    @Column (name="idmagickey")
    private String key;

    public MagicKeyEntity() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
