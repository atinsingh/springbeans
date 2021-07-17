package io.pragra.learning.beanslearning.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class WhiteSox implements ITeam{
    @Value("${game.away.team}")
    private String name;
    @Value("${game.away.score}")
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
