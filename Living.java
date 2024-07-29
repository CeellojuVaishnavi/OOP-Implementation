package Prac_11;
class Monkey{
    void jump(){
        System.out.println("Monkey is good in jumping");
    }
    void bite(){
        System.out.println("Biting is done for breaking food");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Any animal basic need is consuming food");
    }
    
    public void sleep(){
        System.out.println("Sleep is taking rest after all the hardwork");
    }
}
public class Living{
    public static void main(String[] args){
        Human vai=new Human();
        vai.jump();
        vai.eat();
        vai.bite();
        vai.sleep();
    }
}

