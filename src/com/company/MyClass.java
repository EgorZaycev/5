package com.company;

public class MyClass {
    @AutoInjectable
    ParentClass object;
    int getNumber(){
        return  object.getNumber ();
    }
}
