package com.xworkz.Chain;

public class NeckChain extends Chain{
    String name;
    double cost;

    public NeckChain(ChainType chainType, ChainCost chainCost, String[] chainShopNames, int quantity, boolean chainQuality, String name, double cost) {
        super(chainType, chainCost, chainShopNames, quantity, chainQuality);
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void chainInfo() {
        super.chainInfo();
    }

    @Override
    public void shopDetaile() {
        super.shopDetaile();
        System.out.println("Executing the shopDeyaile in NeckChain...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
