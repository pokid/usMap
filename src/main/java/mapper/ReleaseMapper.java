package mapper;

import domain.Release;

public interface ReleaseMapper {
    int deleteByPrimaryKey(Integer releaseid);

    int insert(Release record);

    int insertSelective(Release record);

    Release selectByPrimaryKey(Integer releaseid);

    int updateByPrimaryKeySelective(Release record);

    int updateByPrimaryKey(Release record);
}