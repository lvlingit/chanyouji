package com.lv.dllo.chanyouji.model.bean;

/**
 * Created by dllo on 16/7/12.
 */
public class TravelTest {
    private String title;
    private String date;
    private int days;
    private int imageNum;
    private int authorImageId;

    public TravelTest(String title, String date, int days, int imageNum, int authorImageId) {
        this.title = title;
        this.date = date;
        this.days = days;
        this.imageNum = imageNum;
        this.authorImageId = authorImageId;
    }

    public TravelTest() {
    }

    public String getTitle() {
        return title;
    }

    public TravelTest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDate() {
        return date;
    }

    public TravelTest setDate(String date) {
        this.date = date;
        return this;
    }

    public int getDays() {
        return days;
    }

    public TravelTest setDays(int days) {
        this.days = days;
        return this;
    }

    public int getImageNum() {
        return imageNum;
    }

    public TravelTest setImageNum(int imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    public int getAuthorImageId() {
        return authorImageId;
    }

    public TravelTest setAuthorImageId(int authorImageId) {
        this.authorImageId = authorImageId;
        return this;
    }
}
