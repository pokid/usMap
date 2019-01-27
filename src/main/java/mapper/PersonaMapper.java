package mapper;

import domain.Persona;

public interface PersonaMapper {
    int deleteByPrimaryKey(Integer personaid);

    int insert(Persona record);

    int insertSelective(Persona record);

    Persona selectByPrimaryKey(Integer personaid);

    int updateByPrimaryKeySelective(Persona record);

    int updateByPrimaryKey(Persona record);
}