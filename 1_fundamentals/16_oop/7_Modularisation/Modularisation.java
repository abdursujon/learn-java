public class Modularisation {

    // Coupled code (no modularisaton)
    public static double areaCalculator(double length, double width, String shape){
        if(shape.equals("rectangle")){
            return length * width;
        } else if(shape.equals("triangle")){
            return (length * width) / 2;
        }
        return 0;
    }

    // Same method with modularisation (decoupled)
    public static double rectangleArea(double length, double width, String shape){
        if(shape.equals("rectangle")) return length * width;
        return 0;
    }

    public static double triangleArea(double length, double width, String shape){
        if(shape.equals("triangle")) return (length * width) / 2;
        return 0;
    }

    public static void main(String[] args){
        System.out.println(areaCalculator(44, 23, "rectangle"));
        System.out.println(rectangleArea(23, 4, "rectangle"));
        System.out.println(triangleArea(23, 44, "triangle"));
    }
}

