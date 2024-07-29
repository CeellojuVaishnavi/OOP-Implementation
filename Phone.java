package Prac_11;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends Telephone{
    void ring(){
        System.out.println("Phone is ringing");
    }
    void lift(){
        System.out.println("Should lift the call");
    }
    void disconnect(){
        System.out.println("Call got disconnected");
    }
}
public class Phone {
    public static void main(String[] args){
        SmartTelePhone cell=new SmartTelePhone();
        cell.ring();
        cell.lift();
        cell.disconnect();
    }
}
//Objects or intsances cannot be created for abstract classes-Objects for Telephone cannot be created