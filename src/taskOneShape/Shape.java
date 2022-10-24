package taskOneShape;

public interface Shape {

    public void calculatedArea(int num);
    public void calculatedPerimeter(int num);
}

class Circle implements Shape{
    public void calculatedArea(int radius){
        System.out.println("The area of the circle is: " + Math.PI * radius * radius);

    }
    public void calculatedPerimeter(int radius){
        System.out.println("The perimeter of the circle is: " + 2 * Math.PI * radius);
    }
}

class Square implements Shape{
    public void calculatedArea(int sideLength){
        System.out.println("The area of the square is: " + sideLength * sideLength);
    }
    public void calculatedPerimeter(int sideLength){
        System.out.println("The perimeter of the Aquare is: "+sideLength*4);
    }
}

class main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Square mySquare = new Square();
        myCircle.calculatedArea(5);
        myCircle.calculatedPerimeter(5);
        mySquare.calculatedArea(10);
        mySquare.calculatedPerimeter(15);
    }

}
