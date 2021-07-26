package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySpringBean {
    private String value;

    @Autowired
    private MyEjbInterface myEjbBean;

    public MySpringBean(){
        value = "Test value";
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String test(){
        return myEjbBean.test();
    }
}
