package competitions_runners.model;

import lombok.AllArgsConstructor;


public class Wall implements Obstacles {

    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    @Override
    public void move(Participants obj) {
        obj.jump(height);

    }

//    @Override
//    public boolean check(int heightObj) {
//
//        return heightObj >= height;
//
//    }


}
