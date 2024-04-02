package ru_omsu_fctk_simpleserver.response.audience;

import java.util.List;

public class GetAudiencesResponse {
    private List<String> numberList;
    private List<Integer> buildingNumberList;

    public GetAudiencesResponse() {}

    public GetAudiencesResponse(List<String> number, List<Integer> buildingNumber) {
        this.numberList = number;
        this.buildingNumberList = buildingNumber;
    }

    public List<String> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<String> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getBuildingNumberList() {
        return buildingNumberList;
    }

    public void setBuildingNumberList(List<Integer> buildingNumberList) {
        this.buildingNumberList = buildingNumberList;
    }
}
