package org.example;
    interface Interface1_One {
        void print();
    }

    interface Interface1_Two extends org.example.Interface_One {
        void show();
    }

    class DemoClass1 implements org.example.Interface_Two {
        public void print() {
            System.out.println("Democlass1 : ");
    class main  {
         public static void main(String args[]) {
            org.example.DemoClass obj = new org.example.DemoClass();
                    obj.print();
                    obj.show();
                }
            }
        }

        @Override
        public void show() {

        }
    }

