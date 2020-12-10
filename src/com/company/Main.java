package com.company;

public class Main {

    public static void main ( String[] args ) {
        Injector injector = new Injector ( );
        MyClass myClass = injector.inject ( new MyClass ( ) );
        System.out.println ( myClass.getNumber ( ) );
    }
}
