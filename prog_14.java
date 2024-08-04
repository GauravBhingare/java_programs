package abc;
class student{
    int id;
    String name;
    student(){
        id=100;
        name="abc";
        System.out.println("Constructor called ");
    }
    void showStudent(){
        System.out.println("*********");
        System.out.println("ID "+id);
        System.out.println("Name "+name);
    }
}
public class prog_14 {
    public static void main(String[] args){
        student s1=new student();
        s1.showStudent();
    }
}
