abstract class Animal {
    abstract void sound();
}

interface work {
    void play();
}

class cat extends Animal implements work {
    void sound() {
        System.out.println("Meow Meow");
    }

    public void play() {
        System.out.println("Cat plays with Balls");
    }
}

public class abstractinterfacedemo {
    public static void main(String[] args) {
        cat ani = new cat();
            ani.sound();
            ani.play();
    }

}
