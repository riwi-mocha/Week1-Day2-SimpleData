public class SimpleData {
    public static void main(String[] args) {
        
        String name = "Susana";
        int age = 22;
        double height = 1.54;
        boolean student = true;
        char initial = name.charAt(0);

        System.out.println("Hi, my name is " + name + ", I'm " + age + ", I'm " + height + " mt and my initial is " + initial);


        if(student){
            System.out.println("I'm a student");
        } else {
            System.out.println("I'm not a student");
        }

    }
}
