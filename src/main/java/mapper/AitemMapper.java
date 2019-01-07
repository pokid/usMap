package mapper;

import domain.Aitem;

public interface AitemMapper {
    int deleteByPrimaryKey(Integer aitemid);

    int insert(Aitem record);

    int insertSelective(Aitem record);

    Aitem selectByPrimaryKey(Integer aitemid);

    int updateByPrimaryKeySelective(Aitem record);

    int updateByPrimaryKey(Aitem record);
}