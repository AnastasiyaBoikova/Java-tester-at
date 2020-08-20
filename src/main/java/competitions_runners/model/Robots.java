package competitions_runners.model;

import lombok.AllArgsConstructor;


public class Robots implements Participants{

    private String name;
    private int length;
    private int height;

    public Robots(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public void run(int lengthObs) {
        if (length >= lengthObs){
            System.out.println("Робот " + name + " бежит");
        }else {
            System.out.println("Робот " + name + " не смог пробежать");
        }

    }

    public void jump(int heightObs) {
        if (height >= heightObs) {
            System.out.println("Робот " + name + " прыгнул");
        }else {
            System.out.println("Робот " + name + " не смог прыгнуть");
        }

    }


    @Override
    public String getName() {
        return name;
    }
}
