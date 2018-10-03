package com.lemon.utils;

import com.lemon.domain.Result;

/**
 * Created by lemoon on 18/8/22 下午11:06
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
}
