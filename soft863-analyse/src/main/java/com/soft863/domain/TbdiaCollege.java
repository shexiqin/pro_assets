package com.soft863.domain;


public class TbdiaCollege{

    private String fEdu;

    private int EduCount;

    private String fCreateTime;
    //收入

    private double fTuition;
    //支出

    private double fOther;

    public void setfEdu(String fEdu) {
        this.fEdu = fEdu;
    }

    public void setEduCount(int eduCount) {
        EduCount = eduCount;
    }

    public void setfCreateTime(String fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public void setfTuition(double fTuition) {
        this.fTuition = fTuition;
    }

    public void setfOther(double fOther) {
        this.fOther = fOther;
    }

    public String getfEdu() {
        return fEdu;
    }

    public int getEduCount() {
        return EduCount;
    }

    public String getfCreateTime() {
        return fCreateTime;
    }

    public double getfTuition() {
        return fTuition;
    }

    public double getfOther() {
        return fOther;
    }
}
