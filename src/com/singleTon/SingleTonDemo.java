package com.singleTon;
//our goal is to create a class that can have only one object

public class SingleTonDemo {
    private static SingleTonDemo sc;

    //creating a reference object
    private SingleTonDemo(){

    }
    //creating private constructor so we cant use that constructor outside the class
    //to create a method which refer to only one object of the class

    public static SingleTonDemo getInstance(){
        if (sc==null){
            sc = new SingleTonDemo();
        }
        return sc;
    }
    public void print(){

        System.out.println("Hello World");
    }
}
class Main{
    public static void main(String[] args){
        SingleTonDemo singleTonDemo = SingleTonDemo.getInstance();
        SingleTonDemo s1;
        s1=SingleTonDemo.getInstance();
        s1.print();
    }
}
