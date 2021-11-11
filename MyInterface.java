package org.example;
    interface Interface5{
        public static int num = 100;
        public void display();
    }
    class InterfaceExample implements Interface5{
        public static int num = 10000;
        public void display() {
            System.out.println("This is the implementation of the display method");
        }
        public void show() {
            System.out.println("This is the implementation of the show method");
        }
        public static void main(String args[]) {
            InterfaceExample obj = new InterfaceExample();
            System.out.println("Value of num of the interface "+Interface5.num);
            System.out.println("Value of num of the class "+obj.num);
        }
    }

