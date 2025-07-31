package library;

public class Student {
    private String id;
    private String name;
    private String registration;
    private int curse;

    public Student(String id, String name, String registration, int curse){
        this.id = id;
        this.name = name;
        this.registration = registration;
        this.curse = curse;
    }

    public String getId(){

        return id;
    }
    public String getName(){

        return name;
    }
    public String getRegistration(){

        return registration;
    }
    public int getCurse(){

        return curse;
    }

    public void setId(String id){

        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public void setCurse(int curse) {
        this.curse = curse;
    }
    @Override
    public String toString(){
        return "ID" + id + "| name" + name + "| curse" + curse + "| registration" + registration;
    }
}