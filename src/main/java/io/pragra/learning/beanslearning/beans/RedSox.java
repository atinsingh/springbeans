package io.pragra.learning.beanslearning.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data // toString, equalHash, reques
@Component
public class RedSox implements ITeam{

    @Value("${game.home.team}")
    private String name;

    @Value("${game.home.score}")
    private int score;


    @Override
    public String getTeamName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }
}
