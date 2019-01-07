package mapper;

import domain.Activities;

public interface ActivitiesMapper {
    int deleteByPrimaryKey(Integer activitiesid);

    int insert(Activities record);

    int insertSelective(Activities record);

    Activities selectByPrimaryKey(Integer activitiesid);

    int updateByPrimaryKeySelective(Activities record);

    int updateByPrimaryKey(Activities record);
}