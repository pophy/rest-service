package com.ipophy.helloworld;


import com.ipophy.model.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
public class helloController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello world";
    }


    @GetMapping(path = "/hello-bean/{name}")
    public HelloBean helloBean(@PathParam("id") int id,@PathVariable String name) {
        return new HelloBean(name,id);
    }
}
