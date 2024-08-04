package abc;
class planet{
    String pname;
    double dist;
    double grav;
    planet (String pname1, double dist1, double grav1){
        pname=pname1;
        dist=dist1;
        grav=grav1;
    }
    planet (){
        pname="Venus ";
        dist=47.584;
        grav=91;
    }
    void showPlanet(){
        System.out.println("Planet Name");
        System.out.println(pname);
        System.out.println(dist);
        System.out.println(grav);
    }
}
public class capture {
    public static void main(String[] args){
        planet p1=new planet("Mars",371.92,38);
        planet p2=new planet();

        p1.showPlanet();
        System.out.println("Distance in million km and % Gravity of the earth ");
        p2.showPlanet();
        System.out.println("Distance in million km and % Gravity of the earth ");
    }
}
