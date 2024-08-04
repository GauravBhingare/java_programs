package abc;
class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class employee extends Person{
    private double salary;
    private int yrjoin;
    private String natinsu;
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public int getYrjoin(){
        return yrjoin;
    }
    public void setYrjoin(int yrjoin){
        this.yrjoin=yrjoin;
    }
    public String getNatinsu(){
        return natinsu;
    }
    public void setNatinsu(String natinsu){
        this.natinsu=natinsu;
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setName("Brijesh");
        e1.setYrjoin(2021);
        e1.setSalary(23400);
        e1.setNatinsu("92XXX45ghty");

        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
        System.out.println("Year of Joining: "+e1.getYrjoin());
        System.out.println("National Insurace: "+e1.getNatinsu());
    }
}