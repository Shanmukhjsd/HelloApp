public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String result = "";

            for (String name : args) {
                result += name + ", ";
            }

            // Remove last comma and space
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello " + result);
        } else {
            System.out.println("Hello User");
        }
    }
}
