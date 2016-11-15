package com.example.user.yummycheesecake.model;

public class Contact {

    private String mShopname;
    private String mCakename;
    private String mAddress;
    private String mTime;
    private String mClose;
    private String mDetail;
    private String mImage;

    /*public Contact(String shopname, String cakename, String image) {
        this.mShopname = shopname;
        this.mCakename = cakename;
        this.mImage = image;
    }*/

    public Contact(String shopname, String cakename, String image,String address ,String time, String close, String detail){
        this.mShopname = shopname;
        this.mCakename = cakename;
        this.mImage = image;
        this.mAddress= address;
        this.mTime = time;
        this.mClose = close;
        this.mDetail = detail;

    }


    public String getShopName() {

        return mShopname;
    }

    public String getCakeName() {

        return mCakename;
    }

    public String getImage() {
        return mImage;
    }

    public  String getAddress()
    {
        return mAddress;
    }
    public String getTime(){

        return mTime;
    }
    public String getClose(){

        return mClose;
    }

    public String getDetail(){

        return mDetail;
    }

    @Override
    public String toString() {

        return mShopname;
    }


}
