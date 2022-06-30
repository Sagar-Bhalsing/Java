// WAP to check the class inside the main method

class TestOutside {
    int rollno = 39;
    String name = "Aditya";
}

class ClassInsideMain {

    public static void main(String[] args){

        TestOutside i = new TestOutside();
        System.out.println("Name = " + i.name);
        System.out.println("Roll no. = " + i.rollno);
    }
}
