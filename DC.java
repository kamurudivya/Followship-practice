package org.example;

 public class DC {    //DC : Default constructor
      int x;
      int y;
    DC () {
        x=10;
        y=20;
    }
}
  class PC {     //Paramaterized constructor
    int x,y;
    PC (int i, int j) {
        x=i;
        y=j;
    }
    public static class DCAndPC {
        public static void main(String[] args) {
            DC C1 = new
                    DC();
            DC C2 = new
                    DC();
            System.out.println(C1.x + " " + C2.x);
            System.out.println(C1.y + " " + C2.y);
            PC C3 = new
                    PC(10,20);
            System.out.println(C3.x + " " + C3.y);
        }
    }
}