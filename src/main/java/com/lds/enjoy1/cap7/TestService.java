package com.lds.enjoy1.cap7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class TestService {

    //@Qualifier("testDao")
    @Autowired(required = false)
    //@Resource(name = "testDao2")
    //@Inject
    private TestDao testDao;

    public void println(){
        System.out.println(testDao);
    }
}
