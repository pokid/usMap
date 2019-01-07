package mapper;

import domain.Tmodel;

public interface TmodelMapper {
    int deleteByPrimaryKey(Integer tmodelid);

    int insert(Tmodel record);

    int insertSelective(Tmodel record);

    Tmodel selectByPrimaryKey(Integer tmodelid);

    int updateByPrimaryKeySelective(Tmodel record);

    int updateByPrimaryKey(Tmodel record);
}