package org.example;

public class MultipleInterfaces {
    }
    interface Flyable {
        void fly();
    }
    interface Eatable {
        void eat();
    }
    class Bird implements Flyable, Eatable {
    public void fly() {
            System.out.println("Bird flying");
        }
        public void eat() {
            System.out.println("Bird eats");
        }
    }
    class Sample {
    public static void main(String[] args) {
        Bird b = new Bird();
            b.eat();
            b.fly();
        }

    }





