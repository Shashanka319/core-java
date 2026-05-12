package com.xworkz.Doller;

public class CryptoCurency extends Doller{
    String type;
    String origin;

    public CryptoCurency(DollerType dollerType, int[] counts, String dollerOrigin, String indianRupes, String type, String origin) {
        super(dollerType, counts, dollerOrigin, indianRupes);
        this.type = type;
        this.origin = origin;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void originInfo() {
        super.originInfo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
