package mapper;

import domain.Amodel;

public interface AmodelMapper {
    int deleteByPrimaryKey(Integer amodelid);

    int insert(Amodel record);

    int insertSelective(Amodel record);

    Amodel selectByPrimaryKey(Integer amodelid);

    int updateByPrimaryKeySelective(Amodel record);

    int updateByPrimaryKey(Amodel record);
}