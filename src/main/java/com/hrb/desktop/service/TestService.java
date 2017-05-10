package com.hrb.desktop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by x148128 on 09/05/2017.
 */
@Component
public class TestService {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        System.out.println("\n\n--> service Init." + dataSource.toString());

    }
}
