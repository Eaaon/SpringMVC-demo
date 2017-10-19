package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiancai.hjc on 2017/10/18.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    //映射一个action
    @RequestMapping("/demo")
    public  String index(){
        //返回一个demo.jsp这个视图
        return "demo";
    }

    //映射一个action
    @RequestMapping("/value")
    public @ResponseBody String changeValue(HttpServletRequest request){
        String name = request.getParameter("name");
        Map<String,String> map = new HashMap<String,String>();
        map.put("name",name);
        map.put("file","testFile");
        return map.toString();
    }
}
