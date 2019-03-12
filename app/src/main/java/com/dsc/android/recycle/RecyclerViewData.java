package com.dsc.android.recycle;

public class RecyclerViewData {
    String name;
    String phone;
    String hr_image;
    String vr_image;

    public RecyclerViewData(String hr_image) {
        this.hr_image = hr_image;
    }

    public RecyclerViewData(String name, String phone, String vr_image) {
        this.name = name;
        this.phone = phone;
        this.vr_image = vr_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHr_image() {
        return hr_image;
    }

    public void setHr_image(String hr_image) {
        this.hr_image = hr_image;
    }

    public String getVr_image() {
        return vr_image;
    }

    public void setVr_image(String vr_image) {
        this.vr_image = vr_image;
    }
}
