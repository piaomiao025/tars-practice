package com.man.tars.server.testapp;
import com.man.tars.server.testapp.HelloServant;

public class HelloServantImpl implements HelloServant {
    @Override
    public String hello(int no, String name) {
        return String.format("hello no=%s, name=%s, time=%s", no, name, System.currentTimeMillis());
    }
}