package com.laibao.jdk9.understandinglambda;

public class AnonymousInnerClassesAsClosure {

    public static void main(String[] args) {
        // Create variable in this scope
        String greeting = "Hello, ";

        Greeter greeter = new Greeter() {
            @Override
            public String createGreeting(String whom) {
                // Close (ie: capture) the variable here
                return greeting + whom + "!";
            }
        };

        //greeting = greeting + "asfdasfdasfd";
        greetWorld(greeter);
    }


    public static void greetWorld(Greeter greeter) {
        // Have the greeter use the closed variable here
        // Note that the "greeting" variable is out of scope
        System.out.println(greeter.createGreeting("World"));
    }
}

