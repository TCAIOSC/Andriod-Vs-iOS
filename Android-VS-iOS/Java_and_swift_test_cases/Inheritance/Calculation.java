
class Calculation {
    int z = 0;

    public void addition(int ab, int y) {
        z = ab + y;
        System.out.println(z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println(z);
    }
}

public class My_Calculation extends Calculation {
    public void multiplication(int x, int yy) {
        z = x * yy;
        System.out.println(z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}