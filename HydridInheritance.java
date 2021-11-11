package org.example;

public class HydridInheritance {
    static class ManagingDirector {
        public void show()
        {
            System.out.println(" I am Managing Director of India Operations");
        }
    }
static class Manager extends ManagingDirector {
        public void show()
        {
            System.out.println(" Im the Manager of India Operations");
        }
    }
static class Lead1 extends Manager {
        public void show()
        {
            System.out.println("lead1 Under India Operations Manager");
        }
    }
static class Lead2 extends Manager {
        public void show()
        {
            System.out.println("lead2 Under India Operations Manager");
        }
        public static void main(String[] args) {
            Lead2 obj = new Lead2();
            obj.show();
        }

    }
}
