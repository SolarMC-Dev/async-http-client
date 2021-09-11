module org.asynchttpclient.client {
    requires com.typesafe.netty.core;
    requires io.netty.buffer;
    requires io.netty.codec;
    requires io.netty.codec.http;
    requires io.netty.common;
    requires io.netty.handler;
    requires io.netty.handler.proxy;
    requires io.netty.resolver;
    requires io.netty.transport;
    requires static io.netty.transport.epoll;
    requires static io.netty.transport.kqueue;
    requires java.activation;
    requires java.management;
    requires java.security.jgss;
    requires java.xml;
    requires org.asynchttpclient.utils;
    requires org.reactivestreams;
    requires org.slf4j;
    exports org.asynchttpclient;
    exports org.asynchttpclient.filter;
}
