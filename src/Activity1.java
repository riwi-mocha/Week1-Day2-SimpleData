public class Activity1{

    public static void main(String[] args) {
        
        String name = "Johan";
        int age = 20;
        double height = 1.72;
        boolean student = true;
        char initial = name.charAt(0);

        System.out.println("Hola, mi nombre es " + name + ", tengo " + age + " años, mido " + height + " metros y mi inicial es " + initial + ".");


        if(student){
            System.out.println("Soy un estudiante.");
        } else {
            System.out.println("No soy un estudiante.");
        }

    }

}