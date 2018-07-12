package com.app.fuse;

import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder {
    public void configure() throws Exception {
        from("cxfrs:bean:restService").process(new Processor());
    }
}
