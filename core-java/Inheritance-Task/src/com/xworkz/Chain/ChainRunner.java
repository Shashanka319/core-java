package com.xworkz.Chain;

public class ChainRunner {
    public static void main(String[] args) {
        ChainType chainType = new ChainType("Silver",4000);
        String[] chainShopNames ={"Sharada Chain Store","Pooja Bangale Store","Sai Balaji"};
        System.out.println("Information of Parent Class...");
        Chain chain = new Chain(chainType,ChainCost.TWOFIFTY,chainShopNames,2,true);
        chain.chainInfo();
        chain.shopDetaile();
        System.out.println(chain.toString());

        System.out.println("Information of Chaild Class...");
        NeckChain neckChain = new NeckChain(chainType,ChainCost.TWOFIFTY,chainShopNames,2,true,"Gold Chain",5000);
        neckChain.chainInfo();
        neckChain.shopDetaile();
        System.out.println( neckChain.toString());




    }

}
