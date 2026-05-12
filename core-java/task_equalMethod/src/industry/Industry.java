package industry;

public class Industry {
    String name;
    String location;
    boolean subBranch;

    public Industry(String name, String location, boolean subBranch) {
        this.name = name;
        this.location = location;
        this.subBranch = subBranch;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", subBranch=" + subBranch +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Industry left = this;
        if(obj instanceof Industry){
            Industry right= (Industry) obj;
            if(left.name==right.name && left.location==right.location && left.subBranch==right.subBranch){
                return true;
            }
        }
        return super.equals(obj);
    }
}
