class Calculator {
    int add(int a, int b){
        return a + b;
    }
    int subs(int a, int b){
        return a - b;
    }
    int multiply(int a, int b){
        return a * b;
    }
    int divide(int a, int b){
        return a / b;
    }
}

public class calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Addition : " + cal.add(50, 20));
                System.out.println("Substraction : " + cal.subs(50, 20));
                        System.out.println("Multiplication : " + cal.multiply(50, 20));
                                System.out.println("Division : " + cal.divide(50, 20));

    }
    
}
