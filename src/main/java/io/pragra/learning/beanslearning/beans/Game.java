package io.pragra.learning.beanslearning.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
public class Game {
    private ITeam homeTeam;
    private ITeam awayTeam;

    public Game(@Qualifier("redSox") ITeam homeTeam, @Qualifier("whiteSox") ITeam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @PostConstruct
    public void initGame(){
        System.out.println("@@@@@@@@@@@@@@ GAME GONNA START SOON @@@@@@@@@@@@");
    }

    @PreDestroy
    public void complete(){
        System.out.println("&@^&@E^*&^@%^&@E%^%^&@%^&@%@^%&@%");
    }

    public ITeam playGame(){
        return Math.random()*10> 5 ? homeTeam: awayTeam;
    }

}
