package org.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyService2 {
    @WebMethod
    public String testMethod(){
        return "test";
    }
}
