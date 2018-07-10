package com.app.fuse;

import org.apache.camel.Exchange;

public class Processor implements org.apache.camel.Processor {
    public void process(Exchange exchange) {
        String msg = exchange.getIn().getBody(String.class);
        exchange.getOut().setBody("Hello World " + msg);
    }
}
