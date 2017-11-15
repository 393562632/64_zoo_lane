package com.lvmama.keeper;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ChenQiang on 2017/11/14.
 */
@Configuration
@ComponentScan
public class KeeperApplication {

    public static ConfigurableApplicationContext run(Object source, String[] args) {
        return run(new Object[]{source}, args);
    }

    public static ConfigurableApplicationContext run(Object[] sources, String[] args) {
        List<Object> sourcesExt = new ArrayList<>(Arrays.asList(sources));
        sourcesExt.add(KeeperApplication.class);
        SpringApplication app = new SpringApplication(sourcesExt.toArray());
        return app.run(args);
    }
}
