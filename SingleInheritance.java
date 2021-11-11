package org.example;

    class Animal12{
        void eat(){System.out.println("eating...");}
    }
    class Dog12 extends Animal{
        void bark(){System.out.println("barking...");}
    }
    class TestInheritance{
        public static void main(String args[]){
            Dog d=new Dog();
            d.bark();
            d.eat();
        }}

