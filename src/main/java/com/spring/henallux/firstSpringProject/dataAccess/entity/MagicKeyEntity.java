package com.spring.henallux.firstSpringProject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table (name="magickey")
public class MagicKeyEntity {

    @Id
    @Column (name="key")
    private Integer key;

    public MagicKeyEntity() {
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
}
