package com.demo.app_crud.dto;

public class ProducDto {
    private String name;
    private int price;

    public ProducDto() {
    }

    public ProducDto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
