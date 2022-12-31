package org.example;

import com.opencsv.bean.CsvBindByName;

public class Product implements Element {

    @CsvBindByName
    private String imgUrl;
    @CsvBindByName
    private String productName;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String render() {
        return "<div><img class=\"productImage\" src=\"" + imgUrl + "\" /><p>" + productName + "</p></div>";
    }
}
