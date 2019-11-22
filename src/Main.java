
public class Main {

    public static void main(String[] args) {

        System.out.println("\nArea of the rectangle 1 is " +calculateRectArea(20, 30)+ " cm²");
        System.out.println("Area of the rectangle 2 is " +calculateRectArea(40, 50)+ " cm²");

        System.out.println("\nArea of the square is " +squareArea(4)+ " cm");
        System.out.println("Perimeter of the square is " +squarePerimeter(4)+ " cm²");

        int[] width = { 5, 10, 15, 20 };
        int[] height = { 7, 9, 13, 15, };

        System.out.println();
        for(int i=0; i<width.length; i++) {
            System.out.println("Area of the rectangle " +(i+1)+ " is " +calculateRectArea(width[i], height[i])+ " cm²");
        }

        if(args.length == 2) {
            int area = Integer.parseInt(args[0])*Integer.parseInt(args[1]);
            System.out.println("\nBONUS - Java Program: \nwidth: "+args[0]+" \nheight: "+args[1]+" \narea: " +area);
        }
    }

    public static int calculateRectArea(int a, int b) {
        int area = a*b;
        return area;
    }

    public static int squareArea(int a) {
        int area = a*a;
        return area;
    }

    public static int squarePerimeter(int a) {
        int perimeter = a*4;
        return perimeter;
    }
}
