package mapper;

import domain.Version;

public interface VersionMapper {
    int deleteByPrimaryKey(Integer versionsid);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Integer versionsid);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}