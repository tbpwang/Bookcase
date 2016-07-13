package bookcase.dao;

import java.util.List;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */
public interface GenericDao<T> {
    void create(T t);

    void remove(int id);

    void update(T t);

    List<T> query(T t);

    List<T> queryAll();

    T queryOne(int id);
}
