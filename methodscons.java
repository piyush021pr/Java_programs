class base{
    base(){
        System.out.println("I am a constructor");
    }

}
class derived extends base{
   derived(){
       System.out.println("I am a derived class constructor");
   }
}
class child extends derived{
    child(){

    }

}
public class methodscons {
    public static void main(String[] args) {
        base b=new base();
        //derived d=new derived();
        child e=new child();
    }
}
