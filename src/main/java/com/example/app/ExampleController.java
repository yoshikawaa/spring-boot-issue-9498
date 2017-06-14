package com.example.app;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Profile("default")
@Controller
public class ExampleController {

    @RequestMapping("simple")
    public String view() {
        return "simpleView";
    }

    @RequestMapping("excel")
    public String view2() {
        return "excelView";
    }
}
