package com.company;

public class ClownFish implements Fish {
public String getNumberOfGills(){return "4";}
public int getNumberOfGills(int input){
    return 6;
}

    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumberOfGills(-1));
    }
}
