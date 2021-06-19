package src.com.techlearning.practice;

public class Child extends Parent {
    ArrayPrograms arrayPrograms;
    String name;

    public ArrayPrograms getArrayPrograms() {
        return arrayPrograms;
    }

    public void setArrayPrograms(ArrayPrograms arrayPrograms) {
        this.arrayPrograms = arrayPrograms;
    }

    @Override
    public String toString() {
        return "Child{" +
                "arrayPrograms=" + arrayPrograms +
                ", name='" + name + '\'' +
                ", featureHuman=" + featureHuman +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child(FeatureHuman featureHuman, ArrayPrograms arrayPrograms) {
        super(featureHuman);
        this.arrayPrograms = arrayPrograms;
    }

    public static void main(String args[]){
        FeatureHuman featureHuman=new FeatureHuman();
        featureHuman.setMovement("running");
        ArrayPrograms ap=new ArrayPrograms();
       Child p=new Child(featureHuman,ap);
       p.setName("test");

       System.out.println(p.toString());
    }
}
