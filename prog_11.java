package abc;
class account{
    int id;
    String name;
    int phone;
    double balance=0;

    void deposit(double amt){
        balance=balance+amt;
    }
    void withdraw(double amt){
        balance=balance-amt;
    }
    void print(){
        System.out.println("**************");
        System.out.println("id "+id);
        System.out.println("Phone "+phone);
        System.out.println("Name "+name);
        System.out.println("Balance "+balance);
    }
    void create(int id1,String name1,int phone1,double balance1){
        id=id1;
        name=name1;
        phone=phone1;
        balance=balance1;
    }
}
public class prog_11 {
    public static void main(String[] args){
        account ob1=new account();
        ob1.create(1,"abc",84335,1000);

        account ob2= new account();
        ob2.create(2,"xyz",54930,2000);

        ob1.deposit(10000);
        ob2.deposit(5000);

        ob1.print();
        ob2.print();

        ob1.withdraw(500);
        ob2.withdraw(1000);

        ob1.print();
        ob2.print();

    }
}