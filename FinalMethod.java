package org.example;
class XYZ{
    void demo(){
        System.out.println("XYZ Class Method");
    }
}
class wxy extends XYZ{
    void demo(){
        System.out.println("wxy Class Method");
    }

    public static void main(String args[]){
        wxy obj= new wxy();
        obj.demo();
    }
}


