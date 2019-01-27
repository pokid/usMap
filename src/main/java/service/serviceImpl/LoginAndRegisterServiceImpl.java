package service.serviceImpl;
import domain.User;
import org.springframework.stereotype.Service;
import service.LoginAndRegisterService;

@Service
public class LoginAndRegisterServiceImpl implements LoginAndRegisterService{

    @Override
    public int insert(User record) {
        return 0;
    }
}
