
public class HelloWorld {

    public static String getGreeting() {

        String message = "";
        //#if currentJava == 8
        message += "Java8 is true!";
        //#else
        message += "Not Java 8!";
        //#endif

        return message;
    }

}

// to write tests