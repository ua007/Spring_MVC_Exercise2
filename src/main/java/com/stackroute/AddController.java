package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AddController {

    @RequestMapping("/printMessage")
    public ModelAndView displayMessage(HttpServletRequest request, HttpServletResponse response)
    {
        String userName=request.getParameter("username");
        String password=request.getParameter("password");

        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("message",userName);

        return mv;
    }
}
