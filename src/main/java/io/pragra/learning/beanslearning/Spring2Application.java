package io.pragra.learning.beanslearning;

import io.pragra.learning.beanslearning.beans.Game;
import io.pragra.learning.beanslearning.conf.AppConf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;


public class Spring2Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        System.out.println(context.getBean("game", Game.class).playGame());
    }

}
