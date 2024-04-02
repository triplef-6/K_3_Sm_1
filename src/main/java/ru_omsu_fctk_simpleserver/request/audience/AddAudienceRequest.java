package ru_omsu_fctk_simpleserver.request.audience;

public class AddAudienceRequest {
    private String number;
    private int buildingNumber;

    public AddAudienceRequest() {}

    public AddAudienceRequest(String number, int buildingNumber) {
        this.number = number;
        this.buildingNumber = buildingNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
