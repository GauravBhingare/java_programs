package abc;
class Test<T,V>{
    T i;
    V j;
    Test(T x,V y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println(i);
        System.out.println(j);
    }
}
public class collecFrame {
    public static void main(String[] args){
        Test<String,Integer> t1=new Test(100,"hello");
        t1.show();
    }
}
