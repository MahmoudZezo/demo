package com.taj.model.new_school_request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by User on 10/1/2018.
 */
public class getSchoolCustomNewRequestByIdModel {

    private int request_id;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "title should have at least 1 characters")
    private String request_title;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message = "explain should have at least 1 characters")
    private String request_explaination;
    @NotNull
    private long request_display_date;
    @NotNull
    private long request_expired_date;
    private int request_count;
    private int school_id;
    @NotNull
    private String request_category_name;
    private int response_count;
    private String company_name;
    private String company_logo_image;
    private String category_name;
    private double responsed_cost;
    private long response_date;
    private int response_id;
    private int responsed_company_id;
    private int is_aproved;
    private String image_one;
    private String response_desc;

    public getSchoolCustomNewRequestByIdModel(int request_id, @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "title should have at least 1 characters") String request_title, @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "explain should have at least 1 characters") String request_explaination, @NotNull long request_display_date, @NotNull long request_expired_date, int request_count, int school_id,
                                              @NotNull String request_category_name, int response_count, String company_name, String company_logo_image, String category_name, double responsed_cost, long response_date, int response_id, int responsed_company_id, int is_aproved, String image_one, String response_desc) {
        this.request_id = request_id;
        this.request_title = request_title;
        this.request_explaination = request_explaination;
        this.request_display_date = request_display_date;
        this.request_expired_date = request_expired_date;
        this.request_count = request_count;
        this.school_id = school_id;
        this.request_category_name = request_category_name;
        this.response_count = response_count;
        this.company_name = company_name;
        this.company_logo_image = company_logo_image;
        this.category_name = category_name;
        this.responsed_cost = responsed_cost;
        this.response_date = response_date;
        this.response_id = response_id;
        this.responsed_company_id = responsed_company_id;
        this.is_aproved = is_aproved;
        this.image_one = image_one;
        this.response_desc = response_desc;
    }

    public getSchoolCustomNewRequestByIdModel() {
    }

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public String getRequest_title() {
        return request_title;
    }

    public void setRequest_title(String request_title) {
        this.request_title = request_title;
    }

    public String getRequest_explaination() {
        return request_explaination;
    }

    public void setRequest_explaination(String request_explaination) {
        this.request_explaination = request_explaination;
    }

    public long getRequest_display_date() {
        return request_display_date;
    }

    public void setRequest_display_date(long request_display_date) {
        this.request_display_date = request_display_date;
    }

    public long getRequest_expired_date() {
        return request_expired_date;
    }

    public void setRequest_expired_date(long request_expired_date) {
        this.request_expired_date = request_expired_date;
    }

    public int getRequest_count() {
        return request_count;
    }

    public void setRequest_count(int request_count) {
        this.request_count = request_count;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getRequest_category_name() {
        return request_category_name;
    }

    public void setRequest_category_name(String request_category_name) {
        this.request_category_name = request_category_name;
    }

    public int getResponse_count() {
        return response_count;
    }

    public void setResponse_count(int response_count) {
        this.response_count = response_count;
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

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public double getResponsed_cost() {
        return responsed_cost;
    }

    public void setResponsed_cost(double responsed_cost) {
        this.responsed_cost = responsed_cost;
    }

    public long getResponse_date() {
        return response_date;
    }

    public void setResponse_date(long response_date) {
        this.response_date = response_date;
    }

    public int getResponse_id() {
        return response_id;
    }

    public void setResponse_id(int response_id) {
        this.response_id = response_id;
    }

    public int getResponsed_company_id() {
        return responsed_company_id;
    }

    public void setResponsed_company_id(int responsed_company_id) {
        this.responsed_company_id = responsed_company_id;
    }

    public int getIs_aproved() {
        return is_aproved;
    }

    public void setIs_aproved(int is_aproved) {
        this.is_aproved = is_aproved;
    }

    public String getImage_one() {
        return image_one;
    }

    public void setImage_one(String image_one) {
        this.image_one = image_one;
    }

    public String getResponse_desc() {
        return response_desc;
    }

    public void setResponse_desc(String response_desc) {
        this.response_desc = response_desc;
    }
}
