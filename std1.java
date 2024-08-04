package abc;
class Student{
    private int id;
    private String Name;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

    public static class prog_17 {
        public static void main(String[] args){

        }
    }
}
public class std1 {
    public static void main(String[] args){
        Student st=new Student();
        st.setId(100);
        st.setName("Gaurav");
        System.out.println(st.getId());
        System.out.println(st.getName());
    }
}
