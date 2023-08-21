package ru.ilya.test2;

public class Test2 {
    public static void main(String[] args){
        Singleton.gitSingleto();
    }
}

class Singleton{
    private static final Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton gitSingleto(){
        return singleton;
    }
}