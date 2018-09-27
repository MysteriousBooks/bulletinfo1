package com.bulletinfo.www.utils;

import com.bulletinfo.www.domain.Result;

/**
 * Created by Mysteriouseyes on 2018/9/6.
 */
public class ResultUtils {
    public static Result success(Object object){
        String msg = String.valueOf(object);
        object = EncrypDES.Encontent(msg);
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result filed(Object object){
        String msg = String.valueOf(object);
        object = EncrypDES.Encontent(msg);
        Result result = new Result();
        result.setCode(202);
        result.setMsg("失败");
        result.setData(object);
        return result;
    }

}
