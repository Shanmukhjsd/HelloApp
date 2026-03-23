public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
feature/UC5-enhanced-loop
            for (String name : args) {   // Enhanced for loop

            for (String name : args) {
main
                System.out.println("Hello " + name);
            }
        } else {
            System.out.println("Hello User");
        }
    }
}
