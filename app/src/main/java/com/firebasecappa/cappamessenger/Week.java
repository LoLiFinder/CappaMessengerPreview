package com.firebasecappa.cappamessenger;

import java.util.List;

/**
 * Created by User on 05.12.2017.
 */

public class Week {
    private Day mondey;
    private Day tuesday;
    private Day wednesday;
    private Day thursday;
    private Day friday;
    private Day saturday;

    public Day getMondey() {
        return mondey;
    }

    public void setMondey(Day mondey) {
        this.mondey = mondey;
    }

    public Day getTuesday() {
        return tuesday;
    }

    public void setTuesday(Day tuesday) {
        this.tuesday = tuesday;
    }

    public Day getWednesday() {
        return wednesday;
    }

    public void setWednesday(Day wednesday) {
        this.wednesday = wednesday;
    }

    public Day getThursday() {
        return thursday;
    }

    public void setThursday(Day thursday) {
        this.thursday = thursday;
    }

    public Day getFriday() {
        return friday;
    }

    public void setFriday(Day friday) {
        this.friday = friday;
    }

    public Day getSaturday() {
        return saturday;
    }

    public void setSaturday(Day saturday) {
        this.saturday = saturday;
    }

    public class Day{
        private List<String> dayList;

        public List<String> getDayList() {
            return dayList;
        }

        public void setDayList(List<String> dayList) {
            this.dayList = dayList;
        }
    }


}
