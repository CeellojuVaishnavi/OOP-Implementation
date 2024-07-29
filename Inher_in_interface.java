interface Interface1{
    void name();
    void meth1();
}
interface Interface2 extends Interface1{
    void roll();
    void meth2();
}
class Inh implements Interface2{
    public void roll(){
        System.out.println("75");
    }
    public void meth2(){
        System.out.println("This is method 2");
    }
    public void name(){
        System.out.println("Vaishnavi");
    }
    public void math1(){
        System.out.println("This is method 1");
    }
}
public class Inher_in_interface {
    public static void main(String[] args){
        Inh obj=new Inh();
        obj.roll();
        obj.name();
    }
}
