package com.hustlestar.airbnb.model.response;

import com.hustlestar.airbnb.model.Links;

/**
 * Created by dell on 30.05.2017.
 */
public class ReservationResponse {

    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;


    public ReservationResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public ReservationResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
