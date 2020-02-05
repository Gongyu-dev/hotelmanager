package com.newer.domain;

public class Rooms {

    private Integer roomid;
    private String roomtype;
    private Double price;
    private int state;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Rooms() {
    }

    public Rooms(Integer roomid, String roomtype, Double price, int state) {
        this.roomid = roomid;
        this.roomtype = roomtype;
        this.price = price;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "roomid=" + roomid +
                ", roomtype='" + roomtype + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
