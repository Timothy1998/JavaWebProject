package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.constant.Constants;
import com.spring.henallux.firstSpringProject.dataAccess.dao.UserDAO;
import com.spring.henallux.firstSpringProject.model.User;
import com.spring.henallux.firstSpringProject.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping (value="/inscription")
@SessionAttributes({Constants.CURRENT_USER})
public class InscriptionController {

    private HobbiesService hobbiesService;
    private UserDAO userDAO;

    @ModelAttribute(Constants.CURRENT_USER)
    public User user(){
        return new User();
    }

    @Autowired
    public InscriptionController(HobbiesService hobbiesService, UserDAO userDAO) {
        this.hobbiesService = hobbiesService;
        this.userDAO = userDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("hobbies", hobbiesService.getHobbies());
        model.addAttribute("userInscription", new User());
        return "integrated:userInscription";
    }

    @RequestMapping(value="/send",method = RequestMethod.POST)
    public String getFormData(Model model,
                              @Valid @ModelAttribute(value = Constants.CURRENT_USER) User user,
                              final BindingResult errors){
        if(!errors.hasErrors()) {
            model.addAttribute("user", user);
            userDAO.save(user);
            return "redirect:/gift";
        } else {
            return "redirect:/inscription";
        }
    }
}
