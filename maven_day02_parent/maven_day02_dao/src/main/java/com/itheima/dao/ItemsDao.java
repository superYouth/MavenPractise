package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

public interface ItemsDao {
    public Items findById(Integer id);
}
