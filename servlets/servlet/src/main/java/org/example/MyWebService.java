package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class MyWebService {



    @Autowired
    MySpringBean mySpringBean;

    @WebMethod
    public String testMethod(){

        return mySpringBean.test();
    }
}
