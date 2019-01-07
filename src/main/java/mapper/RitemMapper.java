package mapper;

import domain.Ritem;

public interface RitemMapper {
    int deleteByPrimaryKey(Integer ritemid);

    int insert(Ritem record);

    int insertSelective(Ritem record);

    Ritem selectByPrimaryKey(Integer ritemid);

    int updateByPrimaryKeySelective(Ritem record);

    int updateByPrimaryKey(Ritem record);
}