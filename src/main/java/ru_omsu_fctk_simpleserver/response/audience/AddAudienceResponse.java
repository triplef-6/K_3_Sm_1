package ru_omsu_fctk_simpleserver.response.audience;

public class AddAudienceResponse {
    private Long id;

    public AddAudienceResponse() {}

    public AddAudienceResponse(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
