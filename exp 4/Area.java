import java.util.Scanner;

class Area {
    int length, breadth;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: Monsih Rao \nroll no.: 24csu321 ");
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Area rect = new Area(l, b);
        System.out.println("Area of rectangle: " + rect.returnArea());
        System.out.print(" Prithviraj 24csu345");
        
    }
}


