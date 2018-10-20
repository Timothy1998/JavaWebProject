package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/hello")
public class WelcomeController {
    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title","Welcome Page");
        model.addAttribute("titlePage","Welcome to our world !");
        model.addAttribute("magicKeyForm", new MagicKeyForm());
        return "integrated:welcome";
    }

    @RequestMapping(value="/formMagic",method = RequestMethod.POST)
    public String getFormData(Model model,@ModelAttribute(value = "magicKeyForm") MagicKeyForm form){
        if(form.getMagicKey().equals("111")){
            model.addAttribute("titlePage","Welcome to our inscription page !");
        }
        else{
            return "integrated:keyError";
        }
        System.out.println("passe dans la méthode post du welcomeController");
        return "redirect:/inscription";
    }
}
