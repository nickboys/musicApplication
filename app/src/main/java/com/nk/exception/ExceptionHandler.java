package com.nk.exception;

import com.nk.model.domain.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 87825 on 2018/3/10.
 */
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MyException.class)
    public Response allException() {
        Response response = Response.SUCCESS;
        Map map = new HashMap();
        map.put("msg", "empty result");
        response.setData(map);
        return response;
    }
}
