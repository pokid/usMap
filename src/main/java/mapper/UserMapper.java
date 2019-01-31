package mapper;

import domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    Integer selectUserByEmail(String email);

    User selectUserByEmailAndPwd(String email,String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}