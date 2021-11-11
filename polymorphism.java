package org.example;

public class polymorphism {
    void Print()
        {
            System.out.println("parent class");
        }
    }
    class subclass1 extends Parent {
        void Print()
        {
            System.out.println("sanvi");
        }
    }
    class subclass2 extends Parent {

        void Print()
        {
            System.out.println("Vinday");
        }
    }
    class TestPolymorphism3 {
        public static void main(String[] args)
        {
            Parent a;
            a = new subclass1();
            ((subclass1) a).Print();

            a = new subclass2();
            ((subclass2) a).Print();
        }
    }

