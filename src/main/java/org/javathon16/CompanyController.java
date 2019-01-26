package org.javathon16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @GetMapping("/go")
    public String go(){
        return "qqq";
    }

}
