package jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created by Carlos Coves Prieto on 2/1/15.
 */
@Repository("customerDAO")
@Transactional
public class CustomerDAO {

    @PersistenceContext
    private EntityManager em;

    public void addCustomer(Customer customer) {
        em.persist(customer);
    }

    public void deleteEntity(Customer customer) {
        em.remove(em.find(Customer.class, customer.getPhoneNumber()));
    }

    public void updateEntity(Customer customer) {
        em.merge(customer);
    }

    public Collection<BeanEntity> listAll() {
        Query query = em.createQuery("select a from Customer a");
        return query.getResultList();
    }

	public Customer getCustomerById(String phoneNumber) {
		return em.find(Customer.class, phoneNumber);
	}
}