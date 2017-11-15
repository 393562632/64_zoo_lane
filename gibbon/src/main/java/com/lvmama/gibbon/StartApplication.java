package com.lvmama.gibbon;

import com.lvmama.keeper.KeeperApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ChenQiang on 2017/11/15.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class StartApplication {

    public static void main(String[] args) {
        KeeperApplication.run(StartApplication.class, args);
    }
}
