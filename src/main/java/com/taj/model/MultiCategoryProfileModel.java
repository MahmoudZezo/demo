package com.taj.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by User on 9/4/2018.
 */
public class MultiCategoryProfileModel {

    private int company_id;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "company_name should have at least 1 characters")
    private String company_name;
    @NotNull
    private String company_logo_image;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "address should have at least 1 characters")
    private String company_address;
    //    @NotNull
//    @NotBlank
//    @NotEmpty
//    @Size(max = 450, min = 1, message="youtube should have at least 1 characters")
    private String company_link_youtube;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "website should have at least 1 characters")
    private String company_website_url;

    private float company_lng, company_lat;
    @NotNull
    private String company_cover_image;
    private String company_phone_number;
    private String company_desc;
    @NotNull
    private List<TakatfTenderCategoryPOJO> category;
    private int flag_ar;

    public MultiCategoryProfileModel(int company_id,
                                     @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "company_name should have at least 1 characters") String company_name,
                                     @NotNull String company_logo_image,
                                     @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "address should have at least 1 characters") String company_address,
                                     String company_link_youtube,
                                     @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "website should have at least 1 characters") String company_website_url,
                                     float company_lng, float company_lat, @NotNull String company_cover_image, String company_phone_number, String company_desc,
                                     List<TakatfTenderCategoryPOJO> category, int flag_ar) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_logo_image = company_logo_image;
        this.company_address = company_address;
        this.company_link_youtube = company_link_youtube;
        this.company_website_url = company_website_url;
        this.company_lng = company_lng;
        this.company_lat = company_lat;
        this.company_cover_image = company_cover_image;
        this.company_phone_number = company_phone_number;
        this.company_desc = company_desc;
        this.category = category;
        this.flag_ar = flag_ar;
    }

    public MultiCategoryProfileModel(@NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "company_name should have at least 1 characters")
                                     String company_name, @NotNull String company_logo_image, @NotNull @NotBlank @NotEmpty @Size
            (max = 450, min = 1, message = "address should have at least 1 characters") String company_address,
                                     String company_link_youtube, @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "website should have at least 1 characters")
                                     String company_website_url, float company_lng, float company_lat, @NotNull String company_cover_image, String company_phone_number, String company_desc,
                                     List<TakatfTenderCategoryPOJO> category, int flag_ar) {
        this.company_name = company_name;
        this.company_logo_image = company_logo_image;
        this.company_address = company_address;
        this.company_link_youtube = company_link_youtube;
        this.company_website_url = company_website_url;
        this.company_lng = company_lng;
        this.company_lat = company_lat;
        this.company_cover_image = company_cover_image;
        this.company_phone_number = company_phone_number;
        this.company_desc = company_desc;
        this.category = category;
        this.flag_ar = flag_ar;
    }

    public MultiCategoryProfileModel() {
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_logo_image() {
        return company_logo_image;
    }

    public void setCompany_logo_image(String company_logo_image) {
        this.company_logo_image = company_logo_image;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }


    public String getCompany_link_youtube() {
        return company_link_youtube;
    }

    public void setCompany_link_youtube(String company_link_youtube) {
        this.company_link_youtube = company_link_youtube;
    }

    public String getCompany_website_url() {
        return company_website_url;
    }

    public void setCompany_website_url(String company_website_url) {
        this.company_website_url = company_website_url;
    }

    public float getCompany_lng() {
        return company_lng;
    }

    public void setCompany_lng(float company_lng) {
        this.company_lng = company_lng;
    }

    public float getCompany_lat() {
        return company_lat;
    }

    public void setCompany_lat(float company_lat) {
        this.company_lat = company_lat;
    }

    public String getCompany_cover_image() {
        return company_cover_image;
    }

    public void setCompany_cover_image(String company_cover_image) {
        this.company_cover_image = company_cover_image;
    }

    public String getCompany_phone_number() {
        return company_phone_number;
    }

    public void setCompany_phone_number(String company_phone_number) {
        this.company_phone_number = company_phone_number;
    }

    public String getCompany_desc() {
        return company_desc;
    }

    public void setCompany_desc(String company_desc) {
        this.company_desc = company_desc;
    }

    public List<TakatfTenderCategoryPOJO> getCategory() {
        return category;
    }

    public void setCategory(List<TakatfTenderCategoryPOJO> category) {
        this.category = category;
    }

    public int getFlag_ar() {
        return flag_ar;
    }

    public void setFlag_ar(int flag_ar) {
        this.flag_ar = flag_ar;
    }
}
