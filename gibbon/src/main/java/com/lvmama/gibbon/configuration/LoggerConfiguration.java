package com.lvmama.gibbon.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Denys Kovalenko on 4/4/2017.
 */
@Configuration
@ConditionalOnExpression("${log.debug:false}")
public class LoggerConfiguration implements InitializingBean, DisposableBean {
    private static Logger logger = LogManager.getLogger(LoggerConfiguration.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        for(;;){
            logger.info("info Logging application message");
            logger.debug("debug Logging application message");
            Thread.currentThread().sleep(1000);
        }
    }

    @Override
    public void destroy() throws Exception {
        logger.info("Destroy...");
    }
}
