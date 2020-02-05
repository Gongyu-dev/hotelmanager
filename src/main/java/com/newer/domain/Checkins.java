package com.newer.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Checkins implements Serializable {

    private Integer cid;
    private String name;
    private String gender;
    private String cardtype;
    private String cardno;
    private Integer roomid;
    private Integer num;
    private Float totalprice;
    private String cstate;
    private Timestamp checkinTime;
    private Timestamp leaveTime;

    private Rooms rooms;

    public Checkins() {
    }

    public Checkins(Integer cid, String name, String gender, String cardtype, String cardno, Integer roomid, Integer num, Float totalprice, String cstate, Timestamp checkinTime, Timestamp leaveTime, Rooms rooms) {
        this.cid = cid;
        this.name = name;
        this.gender = gender;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.roomid = roomid;
        this.num = num;
        this.totalprice = totalprice;
        this.cstate = cstate;
        this.checkinTime = checkinTime;
        this.leaveTime = leaveTime;
        this.rooms = rooms;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public Timestamp getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Timestamp getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Timestamp leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Checkins{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", cardtype='" + cardtype + '\'' +
                ", cardno='" + cardno + '\'' +
                ", roomid=" + roomid +
                ", num=" + num +
                ", totalprice=" + totalprice +
                ", cstate='" + cstate + '\'' +
                ", checkinTime=" + checkinTime +
                ", leaveTime=" + leaveTime +
                ", rooms=" + rooms +
                '}';
    }
}
