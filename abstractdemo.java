abstract class cartoon {
    abstract void toons();
}

class tomnjerry extends cartoon{
    void toons() {
        System.out.println("Tom and Jerry");

    }
}  

class ben10 extends cartoon {
    void toons(){
        System.out.println("Ben 10");
    }
    
}

public class abstractdemo {
    public static void main(String[] args) {
        cartoon c1 = new tomnjerry();
        cartoon c2 = new ben10();
        c1.toons();
        c2.toons();
    }

    
}

