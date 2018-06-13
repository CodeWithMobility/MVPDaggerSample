package com.basic.mvpdaggerretrofit.data.model.makeup;

import java.util.List;

/**
 * Created by manu on 6/12/2018.
 */

public class MakeReponse {

    /**
     * id : 1004
     * brand : glossier
     * name : Stretch Concealer
     * price : 22.0
     * price_sign : $
     * currency : USD
     * image_link : https://static-assets.glossier.com/production/spree/images/attachments/000/001/631/portrait_normal/SC_Carousel_1_copy_2.jpg?1506948615
     * product_link : https://www.glossier.com/products/stretch-concealer
     * website_link : https://www.glossier.com
     * description : A traditional concealer sets to a stiff, flat, dry finish—a dead giveaway that you’re wearing it. Ours is a new type of concealer with elastic micro waxes that move with your face instead of caking on top of it, and nourishing oils that give a dewy, glowing finish. The buildable formula covers everything from dark circles to redness and blemishes. In five shades painstakingly developed to enhance, brighten, and—most importantly—completely disappear into the widest range of skin tones.
     * rating : null
     * category : concealer
     * product_type : foundation
     * tag_list : []
     * created_at : 2017-12-27T03:11:01.369Z
     * updated_at : 2017-12-27T03:12:42.235Z
     * product_api_url : http://makeup-api.herokuapp.com/api/v1/products/1004.json
     * api_featured_image : //s3.amazonaws.com/donovanbailey/products/api_featured_images/000/001/004/original/open-uri20171227-4-1wp63cr?1514344255
     * product_colors : [{"hex_value":"#F1DBC3","colour_name":"Light"},{"hex_value":"#E5BE93","colour_name":"Medium"},{"hex_value":"#BC8E5A","colour_name":"Dark"},{"hex_value":"#4F3425","colour_name":"Rich"},{"hex_value":"#96644A","colour_name":"Deep"}]
     */

    private int id;
    private String brand;
    private String name;
    private String price;
    private String price_sign;
    private String currency;
    private String image_link;
    private String product_link;
    private String website_link;
    private String description;
    private Object rating;
    private String category;
    private String product_type;
    private String created_at;
    private String updated_at;
    private String product_api_url;
    private String api_featured_image;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice_sign() {
        return price_sign;
    }

    public void setPrice_sign(String price_sign) {
        this.price_sign = price_sign;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getProduct_link() {
        return product_link;
    }

    public void setProduct_link(String product_link) {
        this.product_link = product_link;
    }

    public String getWebsite_link() {
        return website_link;
    }

    public void setWebsite_link(String website_link) {
        this.website_link = website_link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getProduct_api_url() {
        return product_api_url;
    }

    public void setProduct_api_url(String product_api_url) {
        this.product_api_url = product_api_url;
    }

    public String getApi_featured_image() {
        return api_featured_image;
    }

    public void setApi_featured_image(String api_featured_image) {
        this.api_featured_image = api_featured_image;
    }



}
