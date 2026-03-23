public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
feature/UC6-substring
            String result = "";

            for (String name : args) {
                result += name + ", ";
            }

            // Remove last comma and space
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello " + result);

feature/UC5-enhanced-loop
            for (String name : args) {   // Enhanced for loop

            for (String name : args) {
main
                System.out.println("Hello " + name);
            }
main
        } else {
            System.out.println("Hello User");
        }
    }
}
