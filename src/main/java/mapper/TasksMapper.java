package mapper;

import domain.Tasks;

public interface TasksMapper {
    int deleteByPrimaryKey(Integer tasksid);

    int insert(Tasks record);

    int insertSelective(Tasks record);

    Tasks selectByPrimaryKey(Integer tasksid);

    int updateByPrimaryKeySelective(Tasks record);

    int updateByPrimaryKey(Tasks record);
}