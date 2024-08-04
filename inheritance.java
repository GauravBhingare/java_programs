package abc;
class Animal{
     private String name;
     private String eat;
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name=name;
     }
     public String getEat(){
         return eat;
     }
     public void setEat(String eat){
         this.eat=eat;
     }

}
class Bird extends Animal{
    private String fly;
    public String getFly(){
        return fly;
    }
    public void setFly(String fly){
        this.fly=fly;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Bird br1= new Bird();
        br1.setName("owl");
        br1.setEat("Insects");
        br1.setFly("Low");
        System.out.println("Name: "+br1.getName());
        System.out.println("Fly: "+br1.getFly());
        System.out.println("Eat: "+br1.getEat());

    }
}
