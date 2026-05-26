class OrganRunner {
    public static void main(String[] args) {
        Organ organ = new Organ(1, "Heart", "Circulatory", 300.0, "Pump Blood", true, "Muscle", 7.0f, false, "Chest", 5000.0, 3, true, "Pressure", 7.4, 100, "ANP", true, 0.05f, "Mesoderm");
        organ.display();

        Organ organ1 = new Organ(2, "Liver", "Digestive", 1500.0, "Detox", true, "Epithelial", 20.0f, true, "Abdomen", 1450.0, 5, true, "None", 7.2, 50, "IGF-1", false, 0.1f, "Endoderm");
        organ1.display();

        Organ organ2 = new Organ(3, "Lungs", "Respiratory", 900.0, "Gas Exchange", true, "Epithelial", 5.0f, false, "Chest", 5000.0, 40, true, "Stretch", 7.4, 80, "ACE", true, 70.0f, "Endoderm");
        organ2.display();

        Organ organ3 = new Organ(4, "Brain", "Nervous", 1400.0, "Control", true, "Nervous", 20.0f, false, "Head", 750.0, 50, true, "All", 7.1, 1000, "Various", false, 2.5f, "Ectoderm");
        organ3.display();

        Organ organ4 = new Organ(5, "Kidney", "Urinary", 150.0, "Filter", true, "Epithelial", 7.0f, false, "Back", 1100.0, 30, true, "Pressure", 7.2, 40, "EPO", true, 0.3f, "Mesoderm");
        organ4.display();

        Organ organ5 = new Organ(6, "Skin", "Integumentary", 4500.0, "Protect", true, "Epithelial", 2.0f, true, "Surface", 400.0, 10, true, "Touch", 5.5, 500, "Vit D", false, 2.0f, "Ectoderm");
        organ5.display();

        Organ organ6 = new Organ(7, "Pancreas", "Endocrine", 80.0, "Sugar Reg", true, "Epithelial", 3.0f, false, "Abdomen", 150.0, 4, true, "Glucose", 8.0, 20, "Insulin", false, 0.02f, "Endoderm");
        organ6.display();

        Organ organ7 = new Organ(8, "Stomach", "Digestive", 150.0, "Digestion", false, "Muscle", 4.0f, true, "Abdomen", 250.0, 6, false, "Distension", 2.0, 30, "Gastrin", true, 0.08f, "Endoderm");
        organ7.display();

        Organ organ8 = new Organ(9, "Spleen", "Lymphatic", 170.0, "Blood Filter", false, "Connective", 1.0f, false, "Abdomen", 150.0, 10, true, "None", 7.3, 15, "None", false, 0.03f, "Mesoderm");
        organ8.display();

        Organ organ9 = new Organ(10, "Eye", "Sensory", 7.5, "Vision", false, "Nervous", 1.0f, false, "Head", 5.0, 15, true, "Light", 7.2, 10, "None", true, 0.001f, "Ectoderm");
        organ9.display();
    }
}