class Phone{
    void greet(){
        System.out.println("Good morning");
    }
    void on(){
        System.out.println("Getting on Phone...");
    }
}
class Smartphone extends Phone{
    void wish(){
        System.out.println("How are you ?");
    }
    void on(){
        System.out.println("Getting on Smartphone...");
    }
}

public class Dynamic_m_d {
    public static void main(String[] args){
        Phone obj = new Smartphone();
        obj.greet();
        //obj.wish(); not allowed for methods which only belong to child class
        obj.on();
    }
}
