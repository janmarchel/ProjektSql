package sample.model;

public class Adress {
    private int adress_id;
    private String adress_city;
    private String adress_street;
    private int adress_building_nr;
    private String post_code;

    public int getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(int adress_id) {
        this.adress_id = adress_id;
    }

    public String getAdress_city() {
        return adress_city;
    }

    public void setAdress_city(String adress_city) {
        this.adress_city = adress_city;
    }

    public String getAdress_street() {
        return adress_street;
    }

    public void setAdress_street(String adress_street) {
        this.adress_street = adress_street;
    }

    public int getAdress_building_nr() {
        return adress_building_nr;
    }

    public void setAdress_building_nr(int adres_building_nr) {
        this.adress_building_nr = adres_building_nr;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }
}
