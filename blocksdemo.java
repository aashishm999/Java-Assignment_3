public class blocksdemo {
    static {
        System.out.println("This ia the static block");
    }

    {
        System.out.println("Instance Block");
    }

    blocksdemo(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
            blocksdemo demo = new blocksdemo();
            blocksdemo demo2 = new blocksdemo();

    }
}

