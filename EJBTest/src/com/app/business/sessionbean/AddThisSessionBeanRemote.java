package com.app.business.sessionbean;

import javax.ejb.Remote;

@Remote
public interface AddThisSessionBeanRemote {
	public int addThis(int a,int b);
	public void intermediateMethod();
}
