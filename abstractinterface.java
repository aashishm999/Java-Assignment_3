abstract class vehicle {
    abstract void start();
}

interface horn {
    void sound();

}

class car extends vehicle implements horn {
    void start() {
        System.out.println("Engine Started");
    }

    public void sound() {
        System.out.println("Car horns : Beep");
    }
}

public class abstractinterface {
    public static void main(String[] args) {
        vehicle audi = new car();
        audi.start();
        ((horn) audi).sound();

    }

}
