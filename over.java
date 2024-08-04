package abc;
class car{
    private String name;
   private boolean engine;
    private int cylinders;
   private int wheels;
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public boolean isEngine(){
       return true;
   }
   public void setEngine(boolean engine){
       this.engine=engine;
   }
   public int getCylinders(){
       return cylinders;
   }
   public void setCylinders(int cylinders){
       this.cylinders=cylinders;
   }
   public int getWheels(){
       return wheels;
   }
   public void setWheels(int wheels){
       this.wheels=wheels;
   }
}
class GTR extends car{
    void startEngine() {
        System.out.println("Engine Status: " + isEngine());
    }
    void accelerate(){
        System.out.println("Accelerate the Car");
    }
    void brake(){
        System.out.println("Brake");
    }

}
class Merc extends car{
    void startEngine() {
        System.out.println("Engine Status: " + isEngine());
    }
    void accelerate(){
        System.out.println("Accelerate the Car");
    }
    void brake(){
        System.out.println("Brake");
    }

}
class TATA extends car{
    void startEngine() {
        System.out.println("Engine Status: " + isEngine());
    }
    void accelerate(){
        System.out.println("Accelerate the Car");
    }
    void brake(){
        System.out.println("Brake");
    }

}
public class over {
    public static void main(String[] args){
        car gtr=new car();
        car mrc=new car();
        car tt=new car();
        gtr.isEngine();
        gtr.setCylinders(8);
        gtr.setWheels(4);
        gtr.setName("GTR 40");

        mrc.isEngine();
        mrc.setCylinders(6);
        mrc.setWheels(4);
        mrc.setName("Merc S class");

        tt.isEngine();
        tt.setCylinders(6);
        tt.setWheels(4);
        tt.setName("Tata Harrier");

        System.out.println("Car 1:"+gtr.getName());
        System.out.println(gtr.getCylinders());
        System.out.println(gtr.getWheels());
        System.out.println(gtr.isEngine());

        System.out.println("Car 2:"+mrc.getName());
        System.out.println(mrc.getCylinders());
        System.out.println(mrc.getWheels());
        System.out.println(mrc.isEngine());

        System.out.println("Car 3:"+tt.getName());
        System.out.println(tt.getCylinders());
        System.out.println(tt.getWheels());
        System.out.println(tt.isEngine());
    }

}
