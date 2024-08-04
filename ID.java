package abc;
class InvalidIdException extends RuntimeException{
    @Override
    public String toString(){
        return "ID cannot be negative";
    }
}
class st1{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int id){
        if(id<=0){
            InvalidIdException ex;
            ex=new InvalidIdException();
            throw ex;
        }
        this.id=id;
    }
    public String getName(){
     return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class ID {
    public static void main(String[] args){
        st1 st=new st1();
        st.setId(-100);
        st.setName("abc");
        System.out.println("ID"+st.getId());
        System.out.println("Name"+st.getName());
    }
}
