package mapper;

import domain.Releases;

public interface ReleasesMapper {
    int deleteByPrimaryKey(Integer releasesid);

    int insert(Releases record);

    int insertSelective(Releases record);

    Releases selectByPrimaryKey(Integer releasesid);

    int updateByPrimaryKeySelective(Releases record);

    int updateByPrimaryKey(Releases record);
}