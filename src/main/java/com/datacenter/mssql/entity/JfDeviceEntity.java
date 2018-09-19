package com.datacenter.mssql.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "JfDevIns")
public class JfDeviceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long insid;



    @Column(nullable = false, unique = true)
    private String insname;

    @Column(nullable = false, unique = true)
    private String hvalue;


    public String getInsname() {
        return insname;
    }

    public String getHvalue() {
        return hvalue;
    }


    public long getId() {
        return insid;
    }


}
