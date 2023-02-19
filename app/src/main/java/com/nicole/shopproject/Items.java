package com.nicole.shopproject;

public class Items {
    String title;
    int description;
    int image;
    int moredescription;
    int catimage;
    int cattext;
    String detailsprice;


    public Items(String title, int description, int image, int moredescription, int catimage, int cattext, String detailsprice) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.moredescription = moredescription;
        this.catimage = catimage;
        this.cattext = cattext;
        this.detailsprice = detailsprice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getMoredescription() {
        return moredescription;
    }

    public void setMoredescription(int moredescription) {
        this.moredescription = moredescription;
    }

    public int getCatimage() {
        return catimage;
    }

    public void setCatimage(int catimage) {
        this.catimage = catimage;
    }

    public int getCattext() {
        return cattext;
    }

    public void setCattext(int cattext) {
        this.cattext = cattext;
    }

    public String getDetailsprice() {
        return detailsprice;
    }

    public void setDetailsprice(String detailsprice) {
        this.detailsprice = detailsprice;
    }
}