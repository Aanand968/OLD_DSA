public class Parent {

    boolean print(){
        System.out.println("Parent class");
        return true;
    }

}
class Derived extends Parent {

  boolean print(){
        System.out.println("Derived Class");
        return false;
    }
}

class main{
    public static void main(String[] args) {
        Parent obj = new Parent();
        Parent sc = new Derived();
        //Derived pk = new Parent();
        System.out.println(sc.print());
    }
}