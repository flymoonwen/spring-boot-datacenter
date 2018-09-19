package com.datacenter.mssql.controller;

import com.datacenter.mssql.entity.JfDeviceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datacenter.mssql.service.JfDeviceRepository;

import java.util.Optional;

@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/server")
public class JfDeviceController {


    @Autowired
    private JfDeviceRepository deviceRepository;

    @RequestMapping("/jfdevice")
    @ResponseBody
    public String getJfDevice(){


       Optional<JfDeviceEntity> entity  = deviceRepository.findById(0L);
        if(entity.isPresent())
        {
            return entity.get().getHvalue();
        }else{
            return "不存在";
        }


    }
}
