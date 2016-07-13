package bookcase.dao.impl;

import bookcase.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */
public class GenericDaoImpl<T> implements GenericDao<T> {

    private String namespace;

    public GenericDaoImpl() {
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespace = clazz.getSimpleName().toLowerCase().concat(".");
    }

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(T t) {
        sqlSession.insert(namespace.concat("create"), t);
    }

    @Override
    public void remove(int id) {
        sqlSession.delete(namespace.concat("remove"), id);
    }

    @Override
    public void update(T t) {
        sqlSession.update(namespace.concat("update"), t);
    }

    @Override
    public List<T> query(T t) {
        return sqlSession.selectList(namespace.concat("query"), t);
    }

    @Override
    public List<T> queryAll() {
        return sqlSession.selectList(namespace.concat("queryAll"));
    }

    @Override
    public T queryOne(int id) {
        return sqlSession.selectOne(namespace.concat("queryOne"), id);
    }
}
