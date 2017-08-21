package com.example.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zht198484 on 2017/8/21.
 */
@Path("demo")
public class DemoResource {
    @GET
    @Produces("application/json")
    public List<String> demo(){
        return Arrays.asList("a","b");
    }
}
