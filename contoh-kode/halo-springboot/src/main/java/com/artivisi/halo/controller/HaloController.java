package com.artivisi.halo.controller;

import java.security.Principal;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HaloController{
    
    @RequestMapping("/halo")
    public void halo(Model m){
    		m.addAttribute("waktu", new Date());
    }
    
    @RequestMapping("/saya")
    @ResponseBody
    public Principal infoUser(Principal u){
    		return u;
    }
}
