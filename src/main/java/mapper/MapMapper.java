package mapper;

import domain.Map;

public interface MapMapper {
    int deleteByPrimaryKey(Integer mapid);

    int insert(Map record);

    int insertSelective(Map record);

    Map selectByPrimaryKey(Integer mapid);

    int updateByPrimaryKeySelective(Map record);

    int updateByPrimaryKey(Map record);
}