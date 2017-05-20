package com.man.tars.client.testapp;

import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;

public class ClientTest {
 /*   public static void main(String args[]){
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        HelloPrx proxy = communicator.stringToProxy(HelloPrx.class, "TestApp.HelloServer.HelloObj");
        String ret = proxy.hello(1000, "HelloWorld!");
        System.out.println(ret);
    }*/

    public static void main(String args[]){
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        HelloPrx proxy = communicator.stringToProxy(HelloPrx.class, "TestApp.HelloServer.HelloObj");
        proxy.async_hello(new HelloPrxCallback() {
            @Override
            public void callback_hello(String ret) {
                System.out.println(ret);
            }

            @Override
            public void callback_exception(Throwable ex) {

            }

            @Override
            public void callback_expired() {

            }
        }, 1000, "HelloWorld");
    }
}