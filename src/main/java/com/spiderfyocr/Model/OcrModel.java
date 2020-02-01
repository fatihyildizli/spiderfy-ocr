package com.spiderfyocr.Model;


public class OcrModel {

    private String DestinationLanguage;

    private String Image;

    public OcrModel() {
    }

    public OcrModel(String DestinationLanguage, String Image) {
        this.DestinationLanguage = DestinationLanguage;
        this.Image = Image;

    }

    public String getDestinationLanguage() {
        return DestinationLanguage;
    }

    public void setDestinationLanguage(String destinationLanguage) {
        DestinationLanguage = destinationLanguage;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

}
