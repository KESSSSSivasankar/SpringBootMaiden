package org.spring.springFramework.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController  
public class HomeController {  
	
    @GetMapping("/hello")  
    public String hello(){  
        return"shivashankar!";  
    }  
    
    @GetMapping("/homedata")
    ModelMap home() {
    	ModelMap modal =new ModelMap();
        modal.addAttribute("title", "Dear Learner");
        modal.addAttribute("message", "Welcome to SpringBoot");
        return modal;
    }
    
} 