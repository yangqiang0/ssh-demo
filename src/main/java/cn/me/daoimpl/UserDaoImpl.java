package cn.me.daoimpl;

import cn.me.dao.UserDao;
import cn.me.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    private SessionFactory sessionFactory;
    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    public Integer save(User user) {
        Integer i = (Integer) getHibernateTemplate().save(user);
        return i;
    }

}
