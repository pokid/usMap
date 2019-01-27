package mapper;

import domain.Vmodel;

public interface VmodelMapper {
    int deleteByPrimaryKey(Integer vmodelid);

    int insert(Vmodel record);

    int insertSelective(Vmodel record);

    Vmodel selectByPrimaryKey(Integer vmodelid);

    int updateByPrimaryKeySelective(Vmodel record);

    int updateByPrimaryKey(Vmodel record);
}