
public class DefultValues{
    // Declaring field (member variable) without initialization
    static boolean bool;
    byte b;
    int i;
    long l;
    short s;
    char c;
    float f;
    double d;
    public static void main(String[] args){
        // Print static field directly
        System.out.println("Default static boolean: " + bool);
        // Creating object to access non-static fields
        DefultValues obj= new DefultValues();
        
       System.out.println("Default boolean:" + obj.bool);//static varaible
       System.out.println("Default byte:" + obj.b);
       System.out.println("Default int:" + obj.i);
       System.out.println("Default long:" + obj.l);
       System.out.println("Default short:" + obj.s);
       System.out.println("Default char:" + obj.c);
       System.out.println("Default float:" + obj.f);
       System.out.println("Default double:" + obj.d);
       
       // it will not work for local varaible because
       // local varaible do not get default values.
       //they must be initialized before use.
    }
}