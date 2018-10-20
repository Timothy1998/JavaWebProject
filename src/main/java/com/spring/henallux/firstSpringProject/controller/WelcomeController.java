package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.dao.MagicKeyDAO;
import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

@Controller
@RequestMapping(value="/hello")
public class WelcomeController {

    private MagicKeyDAO magicKeyDAO;

    @Autowired
    public WelcomeController(MagicKeyDAO magicKeyDAO){
        this.magicKeyDAO = magicKeyDAO;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title","Welcome Page");
        model.addAttribute("titlePage","Welcome to our world !");
        model.addAttribute("magicKeyForm", new MagicKeyForm());
        return "integrated:welcome";
    }



    @RequestMapping(value="/formMagic",method = RequestMethod.POST)
    public String getFormData(Model model,@ModelAttribute(value = "magicKeyForm") MagicKeyForm form){
            if (magicKeyDAO.getMagicKeys().contains(form.getMagicKey())) {
                model.addAttribute("titlePage", "Welcome to our inscription page !");
            } else {
                return "integrated:keyError";
            }
        return "redirect:/inscription";
    }
}
