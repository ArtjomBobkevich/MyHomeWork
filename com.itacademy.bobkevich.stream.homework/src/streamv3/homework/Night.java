package streamv3.homework;

public class Night {

    private Integer night=0;

    public Night() {
    }

    public Integer getNight() {
        return night;
    }

    public void setNight(Integer night) {
        this.night = this.night + night;
    }

    @Override
    public String toString() {
        return "Night{" +
                "night=" + night +
                '}';
    }
}
