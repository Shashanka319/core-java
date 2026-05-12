package oil;

import org.w3c.dom.ls.LSOutput;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil = new Oil("SunFlower",180,true);
        Oil oil1 = new Oil("SunFlower",180,true);
        boolean check = oil.equals(oil1);
        System.out.println("Check:"+check);
    }


}
