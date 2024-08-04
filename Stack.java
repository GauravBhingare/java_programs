package abc;
class stack{
    int[] arr=new int[5];
    int top=-1;
    void push(int x){
    if(top==4){
        System.out.println("full");
    }
    else{
        top=top+1;
        arr[top]=x;
        System.out.println("push item "+x);
    }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            top=top-1;
            System.out.println("Stack top");
        }
    }
    void disp(){
    }
}
public class Stack {
    public static void main(String[] args){
    }
}