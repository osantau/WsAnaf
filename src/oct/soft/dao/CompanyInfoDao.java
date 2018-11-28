/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.dao;

import java.io.Serializable;
import java.util.List;
import oct.soft.model.CompanyInfo;

/**
 *
 * @author Octavian Santau
 */
public class CompanyInfoDao extends BaseDao implements DaoInterface<CompanyInfo, Long>{

    @Override
    public void save(CompanyInfo entity) {
        openCurrentSessionwithTransaction();
        getCurrentSession().save(entity);
        closeCurrentSessionwithTransaction();
    }
    
      public void save(List<CompanyInfo> entities) {
        
          for(CompanyInfo companyInfo : entities) {
              save(companyInfo);
          }
    
    }

    @Override
    public void update(CompanyInfo entity) {
       openCurrentSessionwithTransaction();
        getCurrentSession().update(entity);
       closeCurrentSessionwithTransaction();
    }

    @Override
    public CompanyInfo findById(Long id) {
       openCurrentSession();
       CompanyInfo companyInfo = (CompanyInfo)getCurrentSession().get(CompanyInfo.class, id);
       closeCurrentSession();
       
       return companyInfo;
    }

    @Override
    public void delete(CompanyInfo entity) {
        openCurrentSessionwithTransaction();
        getCurrentSession().delete(entity);
        closeCurrentSessionwithTransaction();
    }

    @Override
    public List<CompanyInfo> findAll() {        
        List<CompanyInfo> list = openCurrentSession().createQuery("from CompanyInfo").list();
        closeCurrentSession();
        return list;
    }

    @Override
    public void deleteAll() {
        List<CompanyInfo> companyInfos = findAll();
        for(CompanyInfo companyInfo : companyInfos) 
        {
            delete(companyInfo);
        }
    }
    
}
