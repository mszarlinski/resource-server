package com.example;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Maciej on 2015-10-16.
 */
@RestController
public class WhoAmIController {

    @PreAuthorize("authenticated")
    @RequestMapping("/whoAmI")
    public String whoAmI( final Principal principal) {
        return principal.getName();
    }
}
