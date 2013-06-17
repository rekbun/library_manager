package com.talkto.library_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


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

    @RequestMapping("/signup")
    public ModelAndView signup()
    {
        return new ModelAndView("/signup");
    }

    @RequestMapping(value = "/signup",method=RequestMethod.POST)
    public ModelAndView signupPost(@RequestParam final String email,@RequestParam final String password
                                   ,@RequestParam final String cPassword,HttpSession session)
    {

        return null;
    }
}
