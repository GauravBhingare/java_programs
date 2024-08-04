package abc;
class para{
    int w,h,b;
    int v;
    para(int w1,int h1,int b1){
        w=w1;
        h=h1;
        b=b1;
    }
    void showVolume(){
        v=w*h*b;
        System.out.println("Volume = "+v);
    }
}
public class room {
    public static void main(String[] args){
        para p1=new para(10,5,2);
        p1.showVolume();
    }
}
