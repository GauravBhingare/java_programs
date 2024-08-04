package abc;
class Student1{
    int id;
    String name;
    Student1(int id1,String name1){
        id=id1;
        name=name1;
        System.out.println("Constuctor called");
    }
    void showStudent1(){
        System.out.println("*********");
        System.out.println("ID "+id);
        System.out.println("Name "+name);
    }
}
public class prog_15 {
    public static void main(String[] args){
        Student1 s1=new Student1(100,"abc");
        Student1 s2=new Student1(200,"xyz");
        s1.showStudent1();
        s2.showStudent1();
    }
}
