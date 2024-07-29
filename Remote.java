package Prac_11;
interface TvRemote{
    void dish();
    void setofbox();
}
interface SmartTvRemote extends TvRemote{
    void Youtube();
    void Prime();
}
public class Remote implements SmartTvRemote{
    public void dish(){
        System.out.println("TV screen is displaying on dish facility ");
    }
    public void setofbox(){
        System.out.println("TV screen is displaying through set off box");
    }
    public void Youtube(){
        System.out.println("YouUtube can be accessed through TV");
    }
    public void Prime(){
        System.out.println("Prime can also be accessed through TV");
    }
    public static void main(String[] args){
        SmartTvRemote obj=new Remote();
        obj.setofbox();
        obj.dish();
        obj.Youtube();
        obj.Prime();
    }
}
//Here reference is created for SmartTV interface and object for Remote class
