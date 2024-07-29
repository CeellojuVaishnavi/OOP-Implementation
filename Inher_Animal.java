public class Inher_Animal {
    public Inher_Animal(){
        System.out.println("Constructor of class Animal");
    }
    public Inher_Animal(int a){
        System.out.println("a = "+a);
    }
    public void bark(){
        System.out.println("Animals speak in their own language");
    }
    public void fooodie(){
        System.out.println("Animals eat what they want to");
    }
    
    
}
class Dog extends Inher_Animal{
    public Dog(){
        //super(5);
        System.out.println("Constructor of dog class");
    }
    public void bark(){
        System.out.println("Dogs do bark in louder");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
        d.fooodie();
    }
}



