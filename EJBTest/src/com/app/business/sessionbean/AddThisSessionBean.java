package com.app.business.sessionbean;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Session Bean implementation class AddThisSessionBean
 */
@Stateless
public class AddThisSessionBean implements AddThisSessionBeanRemote {
	@EJB
	AddThisSessionBeanRemote iface;
	int count=0;
	ArrayList <Integer> list ;

    public ArrayList <Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	/**
     * Default constructor. 
     */
    public AddThisSessionBean() {
    	list =new ArrayList<Integer>();
    	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public int addThis(int a, int b) {
		System.out.println(new Date() +" inside session bean new");
		iface.intermediateMethod();
		count++;
		list.add(1);
		System.out.println(new Date() + " count is "+count);
		return list.size();
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void intermediateMethod(){
		System.out.println(new Date() +" inside intermediate");
	}

}
