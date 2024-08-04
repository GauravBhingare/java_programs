package abc;
class student2{
    int clyr;
    String name;
    String lname;
    student2(int clyr1,String name1,String lname1){
        clyr=clyr1;
        name=name1;
        lname=lname1;
        System.out.println("Constructor called with args ");
    }
    student2(){
        clyr=1;
        name="xyz";
        lname="uvw";
        System.out.println("Constuctor called without args !");
    }
    void showstudent2(){
        System.out.println("********");
        System.out.println(clyr+" Year");
        System.out.println("Name "+name);
        System.out.println("Last name "+lname);

    }
}
public class prog_16 {
    public static void main(String[] args){
        student2 st1=new student2(1,"rst","pqr");
        student2 st2= new student2();
        st1.showstudent2();
        st2.showstudent2();
    }
}
