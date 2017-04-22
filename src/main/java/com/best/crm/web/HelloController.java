package com.best.crm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by star2013 on 2017-4-14.
 */
@Controller
@RequestMapping("/")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = { "index", "" })
    public String index(){
        return "hello";
    }
}
