package org.example;
interface TestInterface{
    public static int value = 100;
    public void display();
}
class TestClass implements TestInterface{
    public static int value = 5000;
    public void display() {
        System.out.println("TestClass::display () method");
    }
    public void show() {
        System.out.println("TestClass::show () method");
    }
}
class Main{
    public static void main(String args[]) {
        TestClass testObj = new TestClass();
        System.out.println("Value of the interface variable (value): "+TestInterface.value);
        System.out.println("Value of the class variable (value): "+testObj.value);
    }
}