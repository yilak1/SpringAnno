package com.lds.enjoy1.cap10;

import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void insert(){
        String sql = "INSERT INTO `order` (ordertime, ordermoney, orderstatus) " +
                "VALUES(?,?,?)";
        jdbcTemplate.update(sql, new Date(), 20, 0);
        int a= 1/0;
    }
}
