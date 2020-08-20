package competitions_runners.model;

import lombok.AllArgsConstructor;


public class Humans implements Participants {

    @Override
    public String getName() {
        return name;
    }

    private String name;
    private int length;
    private int height;

    public Humans(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }


    public void run(int lengthObs) {
        if (length >= lengthObs){
            System.out.println("Человек " + name + " бежит");
        } else {
            System.out.println("Человек " + name + " не смог пробежать");
        }

    }


    public void jump(int heightObs) {
        if (height >= heightObs) {
            System.out.println("Человек " + name + " прыгнул");
        } else {
            System.out.println("Человек " + name + " не смог прыгнуть");
        }
    }
}
