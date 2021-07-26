package org.example;


import javax.ejb.Stateless;
import org.example.MyEjbInterface;

@Stateless
public class MyEjbBean implements MyEjbInterface{
    private String value;

    public MyEjbBean(){
        value = "default";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String test(){
        return "hello from ejb";
    }
}
