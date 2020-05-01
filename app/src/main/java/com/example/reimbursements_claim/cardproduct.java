package com.example.reimbursements_claim;

public class cardproduct {
    String item;
    String date;
    private int image;

    public cardproduct(String item, String date, int image) {
        this.item = item;
        this.date = date;
        this.image = image;
    }

    public String getItem() {
        return item;
    }

    public String getDate() {
        return date;
    }

    public int getImage() {
        return image;
    }
}

