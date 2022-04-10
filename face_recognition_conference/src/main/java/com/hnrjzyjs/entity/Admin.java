package com.hnrjzyjs.entity;

public class Admin {

    private String adminname;

    private String password;

    private String phone_number;

    public Admin() {
    }

    public Admin(String adminname, String password, String phone_number) {
        this.adminname = adminname;
        this.password = password;
        this.phone_number = phone_number;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
