package com.lemon.service;

import com.lemon.domain.Girl;
import com.lemon.demo.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by lemoon on 18/8/14 上午7:34
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;



    //事务的注解
    @Transactional
    public void insertTwo(){
        Girl girlA =new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        Girl girlB =new Girl();
        girlB.setAge(19);
        girlB.setCupSize("B");
        girlRepository.save(girlB);
    }
}
