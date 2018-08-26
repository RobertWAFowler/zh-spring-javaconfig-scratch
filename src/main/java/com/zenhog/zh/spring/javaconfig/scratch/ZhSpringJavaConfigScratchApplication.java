package com.zenhog.zh.spring.javaconfig.scratch;

import com.zenhog.zh.spring.javaconfig.scratch.contollers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZhSpringJavaConfigScratchApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ZhSpringJavaConfigScratchApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }
}
