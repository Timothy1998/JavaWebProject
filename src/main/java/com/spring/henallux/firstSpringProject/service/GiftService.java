package com.spring.henallux.firstSpringProject.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService {
    public String chooseGift(String hobby, int age) {
        String gift;
        if(age < 5) {
            gift = "puzzle";
        } else if(age <= 10) {
            gift = "DVD";
        } else {
            gift = "book";
        }

        return "you will receive a " + gift + " about " + hobby;
    }
}
