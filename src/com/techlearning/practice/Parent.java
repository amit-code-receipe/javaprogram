package src.com.techlearning.practice;

public class Parent {
    FeatureHuman featureHuman;

    public Parent(FeatureHuman featureHuman) {
        this.featureHuman = featureHuman;
    }

    public FeatureHuman getFeatureHuman() {
        return featureHuman;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "featureHuman=" + featureHuman +
                '}';
    }

    public void setFeatureHuman(FeatureHuman featureHuman) {
        this.featureHuman = featureHuman;
    }
}
