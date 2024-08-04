package abc;
class demo{
    void sayHello(){
        System.out.println("Hello world! ");
    }
    void sayHelloWithName(String fname){
        System.out.println("hello"+fname);
    }
    String getmessage(String fname){
        String msg="hello "+fname;
        return msg;
    }
    int add(int x,int y){
        int z;
        z=x+y;
        return z;
    }
    double area(double r){
        double a;
        a=3.14*r*r;
        return a;
    }
}
public class prog_13 {
    public static void main(String[] args){
        demo ob=new demo();
        ob.sayHello();
        ob.sayHelloWithName("abc");
        String s1=ob.getmessage("xyz");
        double y=ob.area(2.3);
        int x=ob.add(100,200);
        System.out.println(s1);
        System.out.println(x);
        System.out.println(y);
    }
}
