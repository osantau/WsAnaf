/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.dao;

import java.io.Serializable;
import java.util.List;
import oct.soft.model.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Octavian Santau
 */
public interface DaoInterface<T,Id extends Serializable> {
    public void save(T entity);
    public void update(T entity);    
    public T findById(Id id);
    public void delete(T entity);
    public List<T> findAll();
    public void deleteAll();       
}
