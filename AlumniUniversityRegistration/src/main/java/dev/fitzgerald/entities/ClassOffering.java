package dev.fitzgerald.entities;

public class ClassOffering {

    //fields
    private int classID;
    private String className;
    private String classInstructor;
    private String classDays;
    private String classTime;
    private String classDuration;
    private String regPeriod;
    private int openSeats;

    //default constructor
    public ClassOffering() {}

    //please use this constructor
    public ClassOffering(int classID, String className, String classInstructor, String classDays,
                         String classTime, String classDuration, String regPeriod) {
        this.classID = classID;
        this.className = className;
        this.classInstructor = classInstructor;
        this.classDays = classDays;
        this.classTime = classTime;
        this.classDuration = classDuration;
        this.regPeriod = regPeriod;
        this.openSeats = 35;
    }

    //Getters and setters grouped by order of fields
    public int getClassID() {
        return classID;
    }
    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassInstructor() {
        return classInstructor;
    }
    public void setClassInstructor(String classInstructor) {
        this.classInstructor = classInstructor;
    }

    public String getClassDays() {
        return classDays;
    }
    public void setClassDays(String classDays) {
        this.classDays = classDays;
    }

    public String getClassTime() {
        return classTime;
    }
    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getClassDuration() {
        return this.classDuration;
    }
    public void setClassDuration(String classDuration) {
        this.classDuration = classDuration;
    }

    public String getRegPeriod(){return this.regPeriod;}
    public void setRegPeriod(String regPeriod){this.regPeriod=regPeriod;}

    public int getOpenSeats(){return this.openSeats;}
    public void setOpenSeats(int i) {if(i > 0){this.openSeats = i;}else {this.openSeats = 0;};}

    @Override
    public String toString() {
        return "classOffering{" +
                "classID=" + classID +
                ", className='" + className + '\'' +
                ", classInstructor='" + classInstructor + '\'' +
                ", classDays='" + classDays + '\'' +
                ", classTime='" + classTime + '\'' +
                ", classDuration='" + classDuration + '\'' +
                ", regPeriod='" + regPeriod + '\'' +
                '}';
    }
}