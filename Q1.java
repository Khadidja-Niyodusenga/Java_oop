package assignement;
 class AboutRectangle {
    double length;
    double width;
    double area,per;
    double area(double length,double width) {
       this.length=length;
       this.width=width;
       area=length*width;
       return area;
    }
       double peimeter(double length,double width) {
       this.length=length;
       this.width=width;
       per=(length+width)*2;
       return per;
    }
}
public class Q1{
    public static void main(String[] args) {
        AboutRectangle obj=new AboutRectangle();
        System.out.println("the Perimeter of rectangle:"+" "+obj.peimeter(6, 12));
        System.out.println("the Area of rectangle:"+" "+obj.area(6, 12));
    }
 
}
