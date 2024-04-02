package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Audience;
import ru_omsu_fctk_simpleserver.essence.Group;

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




}
