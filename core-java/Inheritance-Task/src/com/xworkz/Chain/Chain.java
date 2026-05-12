package com.xworkz.Chain;

import java.util.Arrays;

public class Chain {
    ChainType chainType;
    ChainCost chainCost;
    String[] chainShopNames;
    int quantity;
    boolean chainQuality;

    public Chain(ChainType chainType, ChainCost chainCost, String[] chainShopNames, int quantity, boolean chainQuality) {
        this.chainType = chainType;
        this.chainCost = chainCost;
        this.chainShopNames = chainShopNames;
        this.quantity = quantity;
        this.chainQuality = chainQuality;
    }
    public void chainInfo(){
        System.out.println("Executing the Chain Information in Chain");
    }
    public void shopDetaile(){
        System.out.println("Executing the Chain Detailes in Chain");
    }
    public String toString(){
        return  "Chain Type:"+this.chainType+"Chain Cost"+this.chainCost+"Chain Shop Name:"+ Arrays.toString(chainShopNames)+"Quanity:"+this.quantity+"chain Quality:"+this.chainQuality;
    }
}
