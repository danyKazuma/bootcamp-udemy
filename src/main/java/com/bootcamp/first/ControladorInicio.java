package com.bootcamp.first;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(){
        log.info("ejecutando el controlador rest");
        log.debug("mas detalles del controlador");
        return "index";
    }
}
