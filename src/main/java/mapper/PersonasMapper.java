package mapper;

import domain.Personas;

public interface PersonasMapper {
    int deleteByPrimaryKey(Integer personasid);

    int insert(Personas record);

    int insertSelective(Personas record);

    Personas selectByPrimaryKey(Integer personasid);

    int updateByPrimaryKeySelective(Personas record);

    int updateByPrimaryKey(Personas record);
}