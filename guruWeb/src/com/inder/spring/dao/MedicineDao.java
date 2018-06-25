package com.inder.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.inder.spring.model.Medicine;

public class MedicineDao extends AbstractDao  {
	
	@Autowired SessionFactory sessionFactory;
	
	 @SuppressWarnings("unchecked")
	    public List<Medicine> findAllMedicine() {
	        Criteria criteria = sessionFactory.openSession().createCriteria(Medicine.class);
	        return (List<Medicine>) criteria.list();
	    }

	 
	 
	 @SuppressWarnings("unchecked")
	    public List<Medicine> findAllMedicineFromPattern(String pattern) {
	        Criteria criteria = sessionFactory.openSession().createCriteria(Medicine.class);
	        criteria.add(Restrictions.like("uses","%"+pattern+"%"));
	        return (List<Medicine>) criteria.list();
	    }

}
