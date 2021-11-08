package org.example;

/**
 * Hello world!
 *
 */
class CommandLineExample{
    private static String[] args;

    public static void main(String args[]){
        CommandLineExample.args = args;
        System.out.println("Your first argument is: "+args[0]);
    }
}
