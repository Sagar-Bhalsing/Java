// WAP to check the class inside the main method
package executor;
class TestOutside {
    int rollno = 24;
    String name = "Sagar";
}

class ClassInsideMain {

    public static void main(String[] args){

        TestOutside i = new TestOutside();
        System.out.println("Name = " + i.name);
        System.out.println("Roll no. = " + i.rollno);
    }
}
