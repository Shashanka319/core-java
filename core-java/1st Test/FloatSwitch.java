class FloatSwitch {
    public static void main(String[] args) {
        floatAge(30.0f);
    }

    static void floatAge(float age) {
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