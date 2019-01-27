package mapper;

import domain.Versions;

public interface VersionsMapper {
    int deleteByPrimaryKey(Integer versionsid);

    int insert(Versions record);

    int insertSelective(Versions record);

    Versions selectByPrimaryKey(Integer versionsid);

    int updateByPrimaryKeySelective(Versions record);

    int updateByPrimaryKey(Versions record);
}