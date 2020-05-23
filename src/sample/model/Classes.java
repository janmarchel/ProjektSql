package sample.model;

public class Classes {
    private int classes_id;
    private String classes_name;
    private int lecturer_id;
    private int semester;
    private String type;

    public int getClasses_id() {
        return classes_id;
    }

    public void setZajecia_id(int zajecia_id) {
        this.classes_id = zajecia_id;
    }

    public String getClasses_name() {
        return classes_name;
    }

    public void setClasses_name(String classes_name) {
        this.classes_name = classes_name;
    }

    public int getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(int lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
