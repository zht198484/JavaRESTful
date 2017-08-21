package com.example.demo.resource.config;

import com.example.demo.resource.DemoResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by zht198484 on 2017/8/21.
 */
@Component
public class DemoResourceConfig extends ResourceConfig {
    public DemoResourceConfig(){
        this.register(DemoResource.class);
    }
}
