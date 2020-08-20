package competitions_runners.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class Track implements Obstacles {

    private String name;
    private int length;

    public String getName() {
        return name;
    }

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }


    @Override
    public void move(Participants obj) {

        obj.run(length);

    }

//    @Override
//    public boolean check() {
//
//        return lengthObj >= length;
//
//    }


}
