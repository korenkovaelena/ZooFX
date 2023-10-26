package com.example.zoofx;

public interface Animal {
    public default String makeSound(){
    return ("Животное издает звук");}
}
