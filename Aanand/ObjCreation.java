public class ObjCreation {
    //variable in the class
    int a = 10 ;
    int k = 30;
    char b = 'j';
    float d = 143.34F;

    //function in the class
    void Addition(){
       int a = 20 , b= 30;
        System.out.printf("The Addition is %d ", a+b);
    }

    public static void main(String[] args) {

        ObjCreation obj = new ObjCreation();
        obj.a=30;
        System.out.println(obj.a + obj.k);
        obj.Addition();
        System.out.println("\n" + obj.d);
    }
}
