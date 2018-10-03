package com.lemon.esConfig;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;

/**
 * Created by lemoon on 18/10/3 下午6:19
 */
@Configuration
public class MyConfig {

    @Bean
    public TransportClient client() throws Exception{
        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9300    //这里是tcp端口，而不是es的http端口
        );

        Settings settings = Settings.builder()
                .put("cluster.name","lemon")
                .build();

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(node);
        return client;
    }
}