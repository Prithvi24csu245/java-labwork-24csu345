public class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    void printDetails() {
        int perimeter = a + b + c;
        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Name: Monsih Rao \nroll no.: 24csu321 ");
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.printDetails();
    }
}
 
    

