package com.dacas.dao;

import com.dacas.data.Bound;

/**
 * Created by dave on 2016/4/5.
 */
public interface BoundDao {
    public Bound getBound(int id);
    public void saveBound(Bound bound);
    public void delete(Bound bound);
    public void update(Bound bound);
}
