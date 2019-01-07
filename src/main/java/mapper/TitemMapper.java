package mapper;

import domain.Titem;

public interface TitemMapper {
    int deleteByPrimaryKey(Integer titemid);

    int insert(Titem record);

    int insertSelective(Titem record);

    Titem selectByPrimaryKey(Integer titemid);

    int updateByPrimaryKeySelective(Titem record);

    int updateByPrimaryKey(Titem record);
}