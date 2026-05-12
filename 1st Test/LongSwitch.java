class LongSwitch {
    public static void main(String[] args) {
        longAge(30L);
    }

    static void longAge(long age) {
        switch((int)age) {
            case 10:
                System.out.println("Age of the person is equal to 10");
                break;
            case 20:
                System.out.println("Age of the person is equal to 20");
                break;
            case 30:
                System.out.println("Age of the person is equal to 30");
                break;
            case 40:
                System.out.println("Age of the person is equal to 40");
                break;
            case 50:
                System.out.println("Age of the person is equal to 50");
                break;
            default:
                System.out.println("Age of the person is other than the above value");
                break;
        }
    }
}