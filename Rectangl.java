class Rectangle{
    private double length;
    private double width;
//constructor
public Rectangle (double length,double width){
    this.length=length;
    this.width=width;
}
//cacl area
public double getArea(){
    return length*width;
}
//calc perimeter
public double getPerimeter(){
    return 2*(length+width);
}
//disp rect info
public void displayInfo(){
    System.out.println("Rectangle[Length:"+length+"Width:"+width+"]");
    System.out.println("Area:"+getArea());
    System.out.println("Perimeter:"+getPerimeter());
}
}
public class Rectangl{
    public static void main(String[] args){
        Rectangle rect1=new Rectangle(5,3);
        Rectangle rect2=new Rectangle(7, 4);

        System.out.println("Rectangle 1:");
        rect1.displayInfo();

        System.out.println("\nRectangle 2:");
        rect2.displayInfo();
    }
}

