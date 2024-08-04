package abc;

public class boxing {
    public static void main(String[] args){
        int x=100;
        Integer in1=x;
        float y=1.2f;
        Float f1=y;
        int p=in1.intValue();
        float q=f1.floatValue();
        System.out.println(p);
        System.out.println(q);
        System.out.println(in1);
        in1++;
        System.out.println(in1);
        in1--;
        System.out.println(in1);
        in1=in1+10;
        System.out.println(in1);
    }
}
