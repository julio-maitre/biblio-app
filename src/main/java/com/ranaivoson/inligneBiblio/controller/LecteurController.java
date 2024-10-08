package com.ranaivoson.inligneBiblio.controller;

import com.ranaivoson.inligneBiblio.dto.LecteurDTO;
import com.ranaivoson.inligneBiblio.service.LecteurService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class LecteurController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private LecteurService lecteurService;

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/Home")
    public String home(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("lecteurDetail", userDetails);
        return "consultation";
    }

    @GetMapping("/Connexion")
    public String connexion(Model model, LecteurDTO lecteurDTO){
        model.addAttribute("lecteur", lecteurDTO);
        return "login";
    }

    @GetMapping("/Inscription")
    public String inscription(Model model, LecteurDTO lecteurDTO){
        model.addAttribute("lecteur", lecteurDTO);
        return "register";
    }

    @PostMapping("Inscription")
    public String inscriptionSauve(@ModelAttribute("Lecteur") LecteurDTO lecteurDTO){
        lecteurService.save(lecteurDTO);
        return "login";
    }
}
