package com.datacenter.mssql.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name =   "AppConfig")
public class AppConfigEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String   RowId        ;

    @Column(nullable = false, unique = true)
    private int      ID;

}
