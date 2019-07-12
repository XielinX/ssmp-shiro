package com.xlx.ssmshiro.entity;

import java.util.Date;

public class Role {
    private Long role_id;

    private String role_key;

    private String role_name;

    private Boolean available;

    private Date gmt_create;

    private Date gmt_modified;

    public Role(Long role_id, String role_key, String role_name, Boolean available, Date gmt_create, Date gmt_modified) {
        this.role_id = role_id;
        this.role_key = role_key;
        this.role_name = role_name;
        this.available = available;
        this.gmt_create = gmt_create;
        this.gmt_modified = gmt_modified;
    }

    public Role() {
        super();
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_key() {
        return role_key;
    }

    public void setRole_key(String role_key) {
        this.role_key = role_key == null ? null : role_key.trim();
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}