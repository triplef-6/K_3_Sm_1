package request.lesson;

import java.time.LocalDate;

/**
 * получение списка занятий за период для группы (без информации о посещаемости)
 */
public class GetLessonsByGroupRequest {
    private String groupId;
    private String startDate;
    private String endDate;

    public GetLessonsByGroupRequest(String groupId, String startDate, String endDate) {
        this.groupId = groupId;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
