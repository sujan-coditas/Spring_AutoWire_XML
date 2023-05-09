package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Address {
    private int flatno;
    private String building;

    public Address() {
    }

    public Address(int flatno, String building) {
        this.flatno = flatno;
        this.building = building;
    }

    public int getFlatno() {
        return flatno;
    }

    public void setFlatno(int flatno) {
        this.flatno = flatno;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatno=" + flatno +
                ", building='" + building + '\'' +
                '}';
    }
}
