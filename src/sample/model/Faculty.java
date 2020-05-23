package sample.model;

public class Faculty {
    private int faculty_id;
    private String faculty_name;
    private String tel_nr;
    private int adres_id;

    public int getAdres_id() {
        return adres_id;
    }

    public void setAdres_id(int adres_id) {
        this.adres_id = adres_id;
    }

    public int getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getTel_nr() {
        return tel_nr;
    }

    public void setTel_nr(String tel_nr) {
        this.tel_nr = tel_nr;
    }
}
