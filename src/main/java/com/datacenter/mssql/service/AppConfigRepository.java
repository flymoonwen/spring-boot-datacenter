package com.datacenter.mssql.service;

import com.datacenter.mssql.entity.AppConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppConfigRepository extends JpaRepository<String, AppConfigEntity> {


}
