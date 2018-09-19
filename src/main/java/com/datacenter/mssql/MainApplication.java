package com.datacenter.mssql;

import com.datacenter.mssql.entity.JfDeviceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.datacenter.mssql.service.JfDeviceRepository;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.datacenter.mssql.service")
public class MainApplication {


    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);
    }
}
