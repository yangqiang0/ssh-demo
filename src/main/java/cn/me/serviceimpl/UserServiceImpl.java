package cn.me.serviceimpl;

import cn.me.dao.UserDao;
import cn.me.domain.User;
import cn.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public Integer save(User user) {
        Integer i = userDao.save(user);
        return i;
    }
}
