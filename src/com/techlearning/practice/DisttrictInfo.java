package src.com.techlearning.practice;

import java.util.Objects;

public class DisttrictInfo extends AddressInfo {
    String distName;
    int distCode;

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    @Override
    public String toString() {
        return "DisttrictInfo{" +
                "distName='" + distName + '\'' +
                ", distCode=" + distCode +
                '}';
    }

    public DisttrictInfo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DisttrictInfo that = (DisttrictInfo) o;
        return distCode == that.distCode &&
                Objects.equals(distName, that.distName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), distName, distCode);
    }

    public int getDistCode() {
        return distCode;
    }

    public void setDistCode(int distCode) {
        this.distCode = distCode;
    }
}
