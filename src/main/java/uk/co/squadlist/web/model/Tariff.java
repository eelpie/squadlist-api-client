package uk.co.squadlist.web.model;

public class Tariff {

    private String id;
    private String name;
    private Integer duration;

    public Tariff() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

}
