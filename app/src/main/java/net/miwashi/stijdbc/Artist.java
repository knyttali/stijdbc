package net.miwashi.stijdbc;

public class Artist {
    private Integer id;
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Artist(Integer id, String name) {
    this.id = id;
    this.name = name;
    }

    public String toString(){
        return id + " " + name;
    }

}
