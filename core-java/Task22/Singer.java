class Singer {
    String[] singerNames;
    int index = 0;

    Singer(String[] singerNames) {
        this.singerNames = singerNames;
    }

    void saveSingerName(String name) {
        System.out.println("Processing singer: " + name);

        if (this.singerNames != null) {
            int maxSize = this.singerNames.length - 1;

            if (this.index <= maxSize) {
                this.singerNames[index] = name;
                System.out.println("Saved at index: " + this.index);
                this.index++;
				System.out.println("Singer name saved,next index: "+this.index);
            } else {
                System.out.println("Storage is full.");
            }
        } else {
            System.out.println("Array is null.");
        }
    }
}