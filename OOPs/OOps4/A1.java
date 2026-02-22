package OOPs.OOps4;

public class A1 {
    // private is for sensitive data that you don't want to get direct access of it.
    private int num; //now you can't access this data directly but access through getter and setter.
    protected String name;
    // when you don't specify any access modifier in that case in the different pacakage it is not allowed
    // but in the same package it is allowed.
    int[] arr;

    int getNum(){
        return num;
    }

    int setNum(int num){
        return this.num=num;
    }
    public A1(){

    }

    public A1(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num]; 
    }
    
}
