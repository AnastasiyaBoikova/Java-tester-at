package competitions_runners.service;

import competitions_runners.model.Obstacles;
import competitions_runners.model.Participants;

public class PassageObstacles {

    public void passageObstacles(Participants participants, Obstacles obstacles) {


        obstacles.move(participants);


    }


}
