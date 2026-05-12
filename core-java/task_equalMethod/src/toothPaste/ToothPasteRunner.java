package toothPaste;

public class ToothPasteRunner {
    public static void main(String[] args) {
        ToothPaste toothPaste = new ToothPaste("Colgate",50,true);
        ToothPaste toothPaste1 = new ToothPaste("Colgate",50,true);
        boolean check = toothPaste.equals(toothPaste1);
        System.out.println("Check="+check);


    }
}
