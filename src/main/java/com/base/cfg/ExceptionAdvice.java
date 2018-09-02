package com.base.cfg;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.base.commons.vo.Message;

import java.util.HashMap;
import java.util.Map;
 

@ControllerAdvice
public class ExceptionAdvice {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Message errorHandler(Exception ex) {
        return Message.error(ex, ex.getMessage(), 500);
    }
    
    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    /*@ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map myErrorHandler(MyException ex) {
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }*/
 
}
