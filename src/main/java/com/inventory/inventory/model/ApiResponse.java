package com.inventory.inventory.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApiResponse {
    private List<Items> data;

    public List<Items> getData() {
        return data;
    }

    public void setData(List<Items> data) {
        this.data = data;
    }
}
