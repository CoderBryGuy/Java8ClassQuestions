package com.company;

public interface Fish {

    public default int getNumberOfGills(int input){
        return 2;
    }
}
