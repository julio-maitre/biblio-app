package com.ranaivoson.inligneBiblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ConsultationController {
    @GetMapping("/consultation")
    public String consultationPage() {
        return "consultation"; // Assurez-vous que le nom correspond à votre template
    }
}


