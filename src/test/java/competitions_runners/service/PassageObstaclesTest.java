package competitions_runners.service;

import competitions_runners.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.LinkedList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Гонка")
class PassageObstaclesTest {


    @DisplayName("Прохождения препятствий")
    @Test
    void passageObstacles() {

        Cats cat1 = new Cats("Том", 150, 55);
        Cats cat2 = new Cats("Барсик", 120, 36);
        Cats cat3 = new Cats("Феликс", 160, 28);

        Humans human1 = new Humans("Иван", 3000, 350);
        Humans human2 = new Humans("Петр", 5450, 190);
        Humans human3 = new Humans("Артем", 6400, 410);

        Robots robot1 = new Robots("777", 9450, 17);
        Robots robot2 = new Robots("745", 15000, 25);

        Track track1 = new Track("Трек_1", 100);
        Track track2 = new Track("Трек_2", 3200);
        Track track3 = new Track("Трек_3", 5000);
        Wall wall1 = new Wall("Стена_1", 4);
        Wall wall2 = new Wall("Стена_2", 7);
        Wall wall3 = new Wall("Стена_3", 10);

        Participants[] players = {human1, human2, human3, cat1, cat2, cat3, robot1, robot2};
        Obstacles[] barriers = {track1, wall1, track2, wall3, track3, wall2};


        System.out.println("Гонка началась");
        System.out.println();
        for (int i = 0; i < players.length; i++) {
            System.out.println("Участник_" + (i + 1) + "- " + players[i].getName());
            System.out.println();

            for (int j = 0; j < barriers.length; j++) {
                System.out.println("Препятствие_" + (j + 1) + ("- ") + barriers[j].getName());

                new PassageObstacles()
                        .passageObstacles(players[i], barriers[j]);


                System.out.println();
            }

        }
    }
}