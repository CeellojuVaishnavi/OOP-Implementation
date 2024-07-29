package Prac_11;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void changelib(){
        System.out.println("Changing lib");
    }
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refilling");
    }
}
public class Pens {
    public static void main(String[] args){
        FountainPen obj=new FountainPen();
        obj.write();
        obj.changelib();
        obj.refill();
    }
}

