package abc;
class xyz{
    private String name;
    private int id;
    private String address;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
class stud1 extends xyz{
    private String college;
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college=college;
    }
}
class teacher extends xyz{
    private double salary;
    private String subj;
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getSubj(){
        return subj;
    }
    public void setSubj(String subj){
        this.subj=subj;
    }
}
class Collegestudent extends stud1{
    private int year;
    private String branch;
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }

}
public class pers {

    public static void main(String[] args){
        teacher t1=new teacher();
        Collegestudent cs1=new Collegestudent();

        t1.setName("Kundan");
        t1.setSalary(40000);
        t1.setSubj("math");
        t1.setAddress("abc 345");
        t1.setId(34567);


        cs1.setName("Vighnesh");
        cs1.setBranch("AI");
        cs1.setYear(3);
        cs1.setAddress("abcd 3567");
        cs1.setCollege("Govt.coll ");
        cs1.setId(345);

        System.out.println("**************");
        System.out.println("Subject Teacher");
        System.out.println("Name: "+t1.getName());
        System.out.println("Address:"+t1.getAddress());
        System.out.println("Subj: "+t1.getSubj());
        System.out.println("Id: "+t1.getId());
        System.out.println("Salary: "+t1.getSalary());

        System.out.println("***************");
        System.out.println("College Student");
        System.out.println("Name: "+cs1.getName());
        System.out.println("Address:"+cs1.getAddress());
        System.out.println("Branch: "+cs1.getBranch());
        System.out.println("Year: "+cs1.getYear());
        System.out.println("College: "+cs1.getCollege());
        System.out.println("Id: "+cs1.getId());
    }
}
