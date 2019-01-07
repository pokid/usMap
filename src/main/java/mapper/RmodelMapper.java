package mapper;

import domain.Rmodel;

public interface RmodelMapper {
    int deleteByPrimaryKey(Integer rmodelid);

    int insert(Rmodel record);

    int insertSelective(Rmodel record);

    Rmodel selectByPrimaryKey(Integer rmodelid);

    int updateByPrimaryKeySelective(Rmodel record);

    int updateByPrimaryKey(Rmodel record);
}