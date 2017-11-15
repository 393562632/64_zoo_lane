package com.lvmama.keeper;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ChenQiang on 2017/11/14.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DemoServiceApplication {

    public static void main(String[] args) throws Exception {
        KeeperApplication.run(DemoServiceApplication.class, args);
    }

}
