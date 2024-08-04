package abc;
class stud{
    String name;
    int math,eng,sci;
    int average;
    String getName(){
        return name;
    }
   public int getMath(){
       return math;
   }
    public int getEng(){
        return eng;
    }
    public int getSci(){
        return sci;
    }
    public int showAverage(){
        average=(getEng()+getSci()+getMath())/300;
        return average;
    }
    public void showStud(){
        System.out.println("Student Name: "+getName());
        System.out.println("Total Average Marks"+showAverage());
    }
}
public class marks {
    public static void main(String[] args){
        stud st1=new stud();
        st1.showStud();
    }
}
