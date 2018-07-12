package com.app.fuse;

import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder {
//    restConfiguration()
//                .component("servlet")//todo: kto to robi pod spodem
//                .host("0.0.0.0").port("8085")
//                .bindingMode(RestBindingMode.json);

    public void configure() {
        from("cxfrs:bean:restService").process(exchange -> {
            String msg = exchange.getIn().getBody(String.class);
            exchange.getOut().setBody("Hello World " + msg);
        });
    }
}
