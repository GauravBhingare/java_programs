package abc;
class circle{
    double radius;
    double area;
    double circumference;

    void setRadius(double r){
        radius=r;
    }
    void calculateArea(){
        area=3.14*radius*radius;
        System.out.println("Area is "+area);
    }
    void calculateCircumference(){
        circumference=2*3.14*radius;
        System.out.println("Circumference is "+circumference);
    }
}
public class prog_12 {
    public static void main(String[] args){
        circle ob1=new circle();
        ob1.setRadius(2.5);
        ob1.calculateArea();
        ob1.calculateCircumference();
    }
}
