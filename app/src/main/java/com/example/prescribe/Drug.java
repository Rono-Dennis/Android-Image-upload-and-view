package com.example.prescribe;

public class Drug {
    private String DrugName;
    private String ImageUrl;
    private String Pricetag;

    public Drug(String drugName, String imageUrl, String pricetag) {
        DrugName = drugName;
        ImageUrl = imageUrl;
        Pricetag = pricetag;
    }

    public Drug() {
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String drugName) {
        DrugName = drugName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getPricetag() {
        return Pricetag;
    }

    public void setPricetag(String pricetag) {
        Pricetag = pricetag;
    }
}
