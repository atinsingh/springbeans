package io.pragra.learning.beanslearning.conf;

import io.pragra.learning.beanslearning.beans.Game;
import io.pragra.learning.beanslearning.beans.ITeam;
import io.pragra.learning.beanslearning.beans.RedSox;
import io.pragra.learning.beanslearning.beans.WhiteSox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "io.pragra.learning.beanslearning.beans")
@PropertySource("classpath:application.properties")
public class AppConf {

}
