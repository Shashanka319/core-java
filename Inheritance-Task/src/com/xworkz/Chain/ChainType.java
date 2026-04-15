package com.xworkz.Chain;

public class ChainType {
    String type;
    double cost;
    ChainType(String type,double cost){
        this.type=type;
        this.cost=cost;
    }
    public String toString(){
        return "Type:"+this.type+"Cost:"+this.cost;
    }
}
