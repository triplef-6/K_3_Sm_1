package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Audience;
import ru_omsu_fctk_simpleserver.essence.Group;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAudience {
    private DataBase base;

    public RepositoryAudience(DataBase base) {
        this.base = base;
    }

    public long addAudience(Audience audience) {
        long audienceId = base.nextAudienceId();
        base.getAudienceMap().put(audienceId, audience);
        return audienceId;
    }
    public List<Audience> getAudiences() {
        return base.getAudienceMap().values().stream().toList();
    }

    public List<Audience> getAudiencesBuilding(int buildingNumber) {
        List<Audience> res = new ArrayList<>();

        for (Audience audience : base.getAudienceMap().values()) {
            if(audience.getBuildingNumber() == buildingNumber) {
                res.add(audience);
            }
        }
        return res;
    }



}
