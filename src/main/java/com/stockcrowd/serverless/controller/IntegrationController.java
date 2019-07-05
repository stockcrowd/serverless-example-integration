package com.stockcrowd.serverless.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;


@RestController
@EnableWebMvc
public class IntegrationController {

    @RequestMapping(path = "/integration1", method = RequestMethod.GET)
    public Map<String, String> integration1() {
        Map<String, String> responseJson = new HashMap<>();
        responseJson.put("isServerLess", "S");
        responseJson.put("description", "AWS Lambda OK");
        return responseJson;
    }

}
