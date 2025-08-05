public class Main {
    public static void main(String[] args) {

        // 1. Null Constructor (Equilateral triangle)
        Triangle t1 = new Triangle();
        System.out.println("t1: " + t1.toString());
        System.out.println("Perimeter of t1: " + t1.Perimeter());
        System.out.println("Is t1 Right Angled? " + t1.isRightAngled());
        System.out.println();

        // 2. Parameterized Constructor (Equilateral)
        Triangle t2 = new Triangle(5);
        System.out.println("t2: " + t2.toString());
        System.out.println("Perimeter of t2: " + t2.Perimeter());
        System.out.println("Is t2 Right Angled? " + t2.isRightAngled());
        System.out.println();

        // 3. Parameterized Constructor (Isosceles)
        Triangle t3 = new Triangle(5, 7);
        System.out.println("t3: " + t3.toString());
        System.out.println("Perimeter of t3: " + t3.Perimeter());
        System.out.println("Is t3 Right Angled? " + t3.isRightAngled());
        System.out.println();

        // 4. Parameterized Constructor (Scalene)
        Triangle t4 = new Triangle(3, 4, 5);
        System.out.println("t4: " + t4.toString());
        System.out.println("Perimeter of t4: " + t4.Perimeter());
        System.out.println("Is t4 Right Angled? " + t4.isRightAngled());
        System.out.println();

        // 5. Copy Constructor
        Triangle t5 = new Triangle(t4);
        System.out.println("t5 (copy of t4): " + t5.toString());
        System.out.println();

        // 6. Testing setters
        t5.SetSideA(6);
        t5.SetSideB(8);
        t5.SetSideC(10);
        System.out.println("t5 after setters: " + t5.toString());
        System.out.println("Perimeter of t5: " + t5.Perimeter());
        System.out.println("Is t5 Right Angled? " + t5.isRightAngled());
        System.out.println();

        // 7. Testing getters (Note: your current getters are named SetSideA(), SetSideB(), SetSideC() — should be renamed)
        System.out.println("t5 SideA: " + t5.GetSideA());
        System.out.println("t5 SideB: " + t5.GetSideB());
        System.out.println("t5 SideC: " + t5.GetSideC());
        System.out.println();

        // 8. Object count
        System.out.println("Total Triangle objects created: " + Triangle.TotalTriangles());
    }
}

