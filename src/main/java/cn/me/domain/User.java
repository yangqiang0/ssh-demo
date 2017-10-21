package cn.me.domain;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {
    @GenericGenerator(name = "native",strategy = "native")
    @GeneratedValue(generator = "native")
    @Id
    @Column(name = "id",unique = true)
    private Integer id;
    @Column(name = "name")
    private  String name;
    @Column(name = "money")
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
