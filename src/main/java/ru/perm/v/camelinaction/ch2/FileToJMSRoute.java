package ru.perm.v.camelinaction.ch2;

import org.apache.camel.builder.RouteBuilder;

public class FileToJMSRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("ftp://rider.com/orders?username=rider&password=secret")
                .to("jms:incomingOrders");
    }
}
