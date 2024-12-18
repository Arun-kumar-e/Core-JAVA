class One{
    void print(String s){
        System.out.println(s);
    }
}
class two{
    void show(String a){
        System.out.println(a);
    }
    void show1(String b){
        System.out.println(b);
    }
}
class Three{
    void func1(String c){
        System.out.println(c);
    }
    void func2(String d){
        System.out.println(d);
    }
    void func3(String e){
        System.out.println(e);
    }
}
class Four{
    void func1(String f){
        System.out.println(f);
    }
    void func2(String g){
        System.out.println(g);
    }
    void func3(String h){
        System.out.println(h);
    }
    void func4(String i){
        System.out.println(i);
    }
}
public class BasicClasses {
    
    public static void main(String[] args) {
        
        One o = new One();
        o.print("Class one method one");

        System.out.println();
        
        two t = new two();
        t.show("Class two method one");
        t.show1("Class two method two");

        System.out.println();
        
        Three th = new Three();
        th.func1("Class three method one");
        th.func2("Class three method two");
        th.func3("Class three method three");
        
        System.out.println();
        
        Four f = new Four();
        f.func1("Class four method one");
        f.func2("Class four method two");
        f.func3("Class four method three");
        f.func4("Class four method four");
    }

}
