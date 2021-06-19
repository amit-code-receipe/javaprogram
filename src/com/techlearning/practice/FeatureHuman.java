package src.com.techlearning.practice;

public class FeatureHuman {
    String movement;
    String raceType;

    public String getMovement() {
        return movement;
    }

    @Override
    public String toString() {
        return "FeatureHuman{" +
                "movement='" + movement + '\'' +
                ", raceType='" + raceType + '\'' +
                '}';
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }
}
