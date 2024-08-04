package abc;
class ticket{
    int flgno;
    int seat;
    String arri;
    String depar;
    ticket(int flgno1,int seat1,String arri1,String depar1){
        flgno=flgno1;
        seat=seat1;
        arri=arri1;
        depar=depar1;
    }
    ticket(){
        flgno=45321;
        seat=34;
        arri="JAIPUR";
        depar="DELHI";
    }
    void showTicket(){
        System.out.println("************");
        System.out.println("FLIGHT NO: "+flgno);
        System.out.println("SEAT NO: "+seat);
        System.out.println("ARRIVAL DESTINATION: "+arri);
        System.out.println("DEPARTURE DESTINATION: "+depar);
    }
}
public class airlines {
    public static void main(String[] args){
        ticket t1=new ticket(34556,45,"MUMBAI","SAMBHAJINAGAR");
        ticket t2=new ticket();
        t1.showTicket();
        t2.showTicket();
    }
}
