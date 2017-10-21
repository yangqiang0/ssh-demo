package cn.me.service;

import cn.me.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
public interface UserService {
    Integer save(User user);
}
