public class Main {

    public static void main(String[] args) {
        double a,b,c,d,x1,x2;
        a = 1;
        b = 4;
        c = 3;
        d = b*b - 4*a*c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
            x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else if (d == 0){
            x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
            System.out.println("x = " + x1);
        } else {
            System.out.println("Действительных корней нет");
        }
    }
}
