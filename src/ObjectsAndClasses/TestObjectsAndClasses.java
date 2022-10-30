package ObjectsAndClasses;

public class TestObjectsAndClasses {

    static class Students {
        String name;
        int age;
        int id;
        Students(String name,int age,int id){
            this.name=name;
            this.age=age;
            this.id=id;
        }
       String getInfo() {
            return "  Name: " + this.name +" age: " + this.age + " Id: " + this.id;
        }
    }



    public static void main(String[] args) {
        Students a = new Students("Viki",41,810602123);
        Students b = new Students("Petq",41,810714123);
        //Students c = new Students();
       /* a.age = 30;
        a.name = "Petre";
        a.id = 1234567890;*/
        //String x1 = a.getInfo();
        System.out.println(a.getInfo()) ;
//        String x2 = b.getInfo();
       /* b.age = 90;
        b.name = "Iwan";
        b.id = 1234888880;*/
        System.out.println(b.getInfo()) ;

    }
}
