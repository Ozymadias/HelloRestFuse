package com.app.fuse;

import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder {
    public void configure() {
        from("cxfrs:bean:restService").process(exchange -> {
            String msg = exchange.getIn().getBody(String.class);
            exchange.getOut().setBody("Hello World " + msg);
        });
    }
}
