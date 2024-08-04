package abc;
class part{
    int rno;
    int ino;
    part (int rno1,int ino1){
        rno=rno1;
        ino=ino1;
    }
    part(){
        rno=3;
        ino=4;
    }
    void showPart(){
        System.out.println("Real Part= "+rno);
        System.out.println("Imaginary Part= "+ino);
    }
}
public class complex {
    public static void main(String[] args){
        int a,b;
        part prt1=new part(2,4);
        part prt2=new part();
        b=prt1.rno+prt2.rno;
        a=prt1.ino+prt2.ino;
        prt1.showPart();
        prt2.showPart();
        System.out.println("Complex No= "+b+" + "+a+"i");
    }
}
