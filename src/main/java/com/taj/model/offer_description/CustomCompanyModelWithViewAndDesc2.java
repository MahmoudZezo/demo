package com.taj.model.offer_description;

import javax.validation.constraints.*;
import java.sql.Timestamp;

/**
 * Created by User on 10/15/2018.
 */
public class CustomCompanyModelWithViewAndDesc2 {



    private int offer_id;
    private int offer_images_id;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "title should have at least 1 characters")
    private String offer_title;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "explian should have at least 1 characters")
    private String offer_explaination;
    @Min(1)
    private double offer_cost;
    private @NotNull Timestamp offer_display_date;
    @NotNull
    private Timestamp offer_expired_date;
    @NotNull
    private Timestamp offer_deliver_date;
    @Min(1)
    private int company_id;
    @Min(1)
    private int offer_count;
    private int request_count;
    private int view_count;
    private String city;
    private String area;
    private float lng;
    private float lat;
    private double request_offer_count;

    public CustomCompanyModelWithViewAndDesc2(int offer_id, int offer_images_id, @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "title should have at least 1 characters") String offer_title, @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "explian should have at least 1 characters") String offer_explaination, @Min(1) double offer_cost, @NotNull Timestamp offer_display_date, @NotNull Timestamp offer_expired_date, @NotNull Timestamp offer_deliver_date,
                                              @Min(1) int company_id, @Min(1) int offer_count, int request_count, int view_count, String city, String area, float lng, float lat, double request_offer_count) {
        this.offer_id = offer_id;
        this.offer_images_id = offer_images_id;
        this.offer_title = offer_title;
        this.offer_explaination = offer_explaination;
        this.offer_cost = offer_cost;
        this.offer_display_date = offer_display_date;
        this.offer_expired_date = offer_expired_date;
        this.offer_deliver_date = offer_deliver_date;
        this.company_id = company_id;
        this.offer_count = offer_count;
        this.request_count = request_count;
        this.view_count = view_count;
        this.city = city;
        this.area = area;
        this.lng = lng;
        this.lat = lat;
        this.request_offer_count = request_offer_count;
    }

    public CustomCompanyModelWithViewAndDesc2() {
    }

    public int getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    public int getOffer_images_id() {
        return offer_images_id;
    }

    public void setOffer_images_id(int offer_images_id) {
        this.offer_images_id = offer_images_id;
    }

    public String getOffer_title() {
        return offer_title;
    }

    public void setOffer_title(String offer_title) {
        this.offer_title = offer_title;
    }

    public String getOffer_explaination() {
        return offer_explaination;
    }

    public void setOffer_explaination(String offer_explaination) {
        this.offer_explaination = offer_explaination;
    }

    public double getOffer_cost() {
        return offer_cost;
    }

    public void setOffer_cost(double offer_cost) {
        this.offer_cost = offer_cost;
    }

    public Timestamp getOffer_display_date() {
        return offer_display_date;
    }

    public void setOffer_display_date(Timestamp offer_display_date) {
        this.offer_display_date = offer_display_date;
    }

    public Timestamp getOffer_expired_date() {
        return offer_expired_date;
    }

    public void setOffer_expired_date(Timestamp offer_expired_date) {
        this.offer_expired_date = offer_expired_date;
    }

    public Timestamp getOffer_deliver_date() {
        return offer_deliver_date;
    }

    public void setOffer_deliver_date(Timestamp offer_deliver_date) {
        this.offer_deliver_date = offer_deliver_date;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getOffer_count() {
        return offer_count;
    }

    public void setOffer_count(int offer_count) {
        this.offer_count = offer_count;
    }

    public int getRequest_count() {
        return request_count;
    }

    public void setRequest_count(int request_count) {
        this.request_count = request_count;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public double getRequest_offer_count() {
        return request_offer_count;
    }

    public void setRequest_offer_count(double request_offer_count) {
        this.request_offer_count = request_offer_count;
    }
}
