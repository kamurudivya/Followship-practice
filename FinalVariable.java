package org.example;

class FinalVariable{
    static final int ROLL_NO;
    static{
        ROLL_NO=1230;
    }
    public static void main(String args[]){
        System.out.println(FinalVariable.ROLL_NO);
    }
}


