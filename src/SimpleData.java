public class SimpleData{

    public static void main(String[] args) {
        
        String name = "Andres";
        int age = 27;
        double height = 1.80;
        boolean student = true;
        char initial = name.charAt(0);

        System.out.println("Hello, my name is " + name + ", I'm " + age + " years old, and I'm " + height + " meters tall and my initial is: " + initial + ".");


        if(student){
            System.out.println("I'm a student");
        } else {
            System.out.println("I'm not a student");
        }

    }

}