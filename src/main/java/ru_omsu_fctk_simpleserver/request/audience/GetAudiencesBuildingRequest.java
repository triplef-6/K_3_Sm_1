package ru_omsu_fctk_simpleserver.request.audience;

public class GetAudiencesBuildingRequest {

    private int buildingNumber;

    public GetAudiencesBuildingRequest() {}

    public GetAudiencesBuildingRequest( int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }


    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }


}
