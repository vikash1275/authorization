/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dashboard.controller;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author backup
 */

@RestController
public class UserController {
    
     @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }

    
}
