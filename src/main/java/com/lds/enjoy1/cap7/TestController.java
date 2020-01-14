package com.lds.enjoy1.cap7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

}
