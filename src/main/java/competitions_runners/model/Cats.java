package competitions_runners.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class Cats implements Participants {



    private String name;
    private int length;
    private int height;

    public Cats(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }


    @Override
    public String getName() {
        return name;
    }


    public void run(int lengthObs) {
        if (length >= lengthObs){
            System.out.println("Кот " + name +  " бежит");
        }else {
            System.out.println("Кот " + name +  " не смог пробежать");
        }

    }

    public void jump(int heightObs) {
        if (height >= heightObs) {
            System.out.println("Кот " + name +  " прыгнул");
        }else {
            System.out.println("Кот " + name +  " не смог прыгнуть");

        }

    }


    public boolean check(int lengthObs) {

        return length >= lengthObs;

    }
}
