// write a programme to count how many objects are created for a class without emplify inside any loop.

public class NumOfObjects {
    
    static int count=0;
    // contructor 
    NumOfObjects(){
        count++;
    }

    public static void main(String[] args) {
        NumOfObjects obj1 = new NumOfObjects();
        NumOfObjects obj2 = new NumOfObjects();
        NumOfObjects obj3 = new NumOfObjects();
        NumOfObjects obj4 = new NumOfObjects();
        NumOfObjects obj5 = new NumOfObjects();
        NumOfObjects obj6 = new NumOfObjects();
        System.out.println("Number Of Objects are "+count);
    }
}
