package com.lemon.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by lemoon on 18/8/20 上午7:15
 */
@Aspect
@Component
public class HttpAspect {


    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //..表示任意参数
    @Pointcut("execution(public * com.lemon.controller.GirlController.girlList(..))")
    public void log(){
    }


    @Before("log()")
    public void doBefore(){
//        System.out.println(1111111111);
        logger.info("11111111111111");
    }

    @After("log()")
    public void doAfter(){
//        System.out.println(222222222);
        logger.info("22222222222222222");
    }
}
