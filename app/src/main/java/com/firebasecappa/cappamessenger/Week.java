package com.firebasecappa.cappamessenger;

import java.util.List;

/**
 * Created by User on 05.12.2017.
 */

public class Week {
    private List<String> mondey;
    private List<String> tuesday;
    private List<String> wednesday;
    private List<String> thursday;
    private List<String> friday;
    private List<String> saturday;

    public List<String> getMondey() {
        return mondey;
    }

    public Week() {
    }

    public Week(List<String> mondey, List<String> tuesday, List<String> wednesday, List<String> thursday, List<String> friday, List<String> saturday) {
        this.mondey = mondey;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
    }

    public void setMondey(List<String> mondey) {
        this.mondey = mondey;
    }

    public List<String> getTuesday() {
        return tuesday;
    }

    public void setTuesday(List<String> tuesday) {
        this.tuesday = tuesday;
    }

    public List<String> getWednesday() {
        return wednesday;
    }

    public void setWednesday(List<String> wednesday) {
        this.wednesday = wednesday;
    }

    public List<String> getThursday() {
        return thursday;
    }

    public void setThursday(List<String> thursday) {
        this.thursday = thursday;
    }

    public List<String> getFriday() {
        return friday;
    }

    public void setFriday(List<String> friday) {
        this.friday = friday;
    }

    public List<String> getSaturday() {
        return saturday;
    }

    public void setSaturday(List<String> saturday) {
        this.saturday = saturday;
    }
}
