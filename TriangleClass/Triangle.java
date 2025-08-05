class Triangle {
    // Defining attributes for the class Triangle
    private double SideA;
    private double SideB;
    private double SideC;
    private static int TotalObjects;
    
    // Null Constructor for Equilateral triangle
    public Triangle() {
        this.SideA = 1.0;
        this.SideB = 1.0;
        this.SideC = 1.0;
        TotalObjects += 1;
    }
    // Parameterized Constructor for Equilateral triangle
    public Triangle(double PointX) {
        this.SideA = PointX;
        this.SideB = PointX;
        this.SideC = PointX;
        TotalObjects += 1;
    }
    // Paramterized Constructor for Isoceles Triangle
    public Triangle(double PointX, double PointY) {
        this.SideA = PointX;
        this.SideB = PointX;
        this.SideC = PointY;
        TotalObjects += 1;
    }
    // Paramterized Constructor for  Triangle
    public Triangle(double PointX, double PointY, double PointZ) {
        this.SideA = PointX;
        this.SideB = PointY;
        this.SideC = PointZ;
        TotalObjects += 1;
    }
    // Copy Constructor for Triangle
    public Triangle(Triangle TriangleObject) {
        this.SideA = TriangleObject.SideA;
        this.SideB = TriangleObject.SideB;
        this.SideC = TriangleObject.SideC;
        TotalObjects += 1;
    }
    // Setter for Side A
    public void SetSideA(double PointA) {
        this.SideA = PointA;
    }
    // Setter for Side B
    public void SetSideB(double PointB) {
        this.SideB = PointB;
    }
    // Setter for Side C
    public void SetSideC(double PointC) {
        this.SideC = PointC;
    }
    // Getter for Side A
    public double GetSideA() {
        return this.SideA;
    }
    // Getter for Side B
    public double GetSideB() {
        return this.SideB;
    }
    // Getter for Side C
    public double GetSideC() {
        return this.SideC;
    }
    // returns number of objects associated with class Triangle
    public static int TotalTriangles() {
        return TotalObjects;
    }
    // returns perimeter of a specific triangle
    public double Perimeter() {
        return (this.SideA + this.SideB + this.SideC);
    }
    // Validates if a specific triangle is Right-Angled or not
    public boolean isRightAngled() {
        // checking side A as hypotenuse
        if (this.SideA > this.SideB && this.SideA > this.SideC) {
            if (this.SideC*this.SideC + this.SideB*this.SideB == this.SideA*this.SideA) {
                return true;
            }
        }
        // checking side B as hypotenuse
        if (this.SideB > this.SideA && this.SideB > this.SideC) {
            if (this.SideC*this.SideC + this.SideA*this.SideA == this.SideB*this.SideB) {
                return true;
            }
        }
        // checking side C as hypotenuse
        if (this.SideC > this.SideA && this.SideC > this.SideA) {
            if (this.SideB*this.SideB + this.SideA*this.SideA == this.SideC*this.SideC) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String triangleType;
        if (this.SideA + this.SideB == this.SideA + this.SideC || this.SideA + this.SideB == this.SideB + this.SideC || this.SideA + this.SideC == this.SideB + this.SideC) {
            if (this.SideA + this.SideB == this.SideA + this.SideC && this.SideA + this.SideB == this.SideB + this.SideC && this.SideA + this.SideC == this.SideB + this.SideC) {
                triangleType = "Equilateral";
            }
            else {
            triangleType = "Isoceles";
            }
        }
        else {
        triangleType = "Scalene";
        }
        return "{ A Triangle having 3 sides, which is " + (isRightAngled() ? "a" : "not a") + " Right Angled Triangle" + ", is an " + triangleType + " triangle and is having 3 sides" + " with Side A = " + this.SideA + " ,Side B = " + this.SideB + " ,Side C = " + this.SideC + " }";
    }
}