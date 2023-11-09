/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HIEU
 */
public class Account {

    private String username;
    private String password;
    private String fullname;
    private String address;
    private String sdt;
    private int role;

    public Account() {
    }

    public Account(String username, String password, String fullname, String address, String sdt) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
        this.sdt = sdt;
        this.role = 1;
    }

    public Account(String username, String password, String fullname, String address, String sdt, int role) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
        this.sdt = sdt;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

}
