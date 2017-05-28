package com.app.business.sessionbean;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class AddThisStateful
 */
@Stateful
@LocalBean
public class AddThisStateful implements AddThisStatefulRemote {
	ArrayList <Integer> list ;

    /**
     * Default constructor. 
     */
    public AddThisStateful() {
    	list=new ArrayList<Integer>();
    }

	@Override
	public int meth1() {
		System.out.println(new Date() +" inside session bean new");
		list.add(1);
		return list.size();
	}
}
