package ru_omsu_fctk_simpleserver.essence;

public class Audience {
    private Long id;
    private String number;
    private int capacity;
    private int buildingNumber;

    public Audience() {
    }

    public Audience(Long id,String number, int capacity, int buildingNumber) {
        this.id = id;
        this.buildingNumber = buildingNumber;
        this.capacity = capacity;
        this.number = number;
    }
    public Audience(String number, int capacity, int buildingNumber) {
        this.buildingNumber = buildingNumber;
        this.capacity = capacity;
        this.number = number;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
