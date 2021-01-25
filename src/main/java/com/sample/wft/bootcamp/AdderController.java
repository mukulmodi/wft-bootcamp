package com.sample.wft.bootcamp;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdderController {

    @RequestMapping(value = "/**")
    public HashMap<String, String> test(HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();

        System.out.println(request.getRequestURI());
        int num = Integer.parseInt(request.getRequestURI().substring(1));
        int randomNum = (int) (Math.random() * (25-0+1) + 0);
        result.put("Sum", String.valueOf(num + randomNum));
        return result;
    }
}
