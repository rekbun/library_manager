package com.talkto.library_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Win8
 * Date: 6/15/13
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {

    public UserController()
    {

    }


    @RequestMapping("/")
    public ModelAndView index()
    {
        ModelAndView modelAndView= new ModelAndView("/index");
        return modelAndView;
    }



}
