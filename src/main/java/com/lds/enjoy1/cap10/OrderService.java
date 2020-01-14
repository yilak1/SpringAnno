package com.lds.enjoy1.cap10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderDao dao;

    public void addOrder(){
        dao.insert();
        System.out.println("操作完成。。。。");
    }
}
