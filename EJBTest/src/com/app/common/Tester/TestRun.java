package com.app.common.Tester;

import java.util.Date;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.app.business.sessionbean.AddThisSessionBeanRemote;

public class TestRun {
	@EJB
	static AddThisSessionBeanRemote rm;
	final String var;
	public TestRun() {
		this.var="asd";
	}

	static public void main(String[] args) {
		System.out.println(new Date() +" yoo");
		try {
			Context ctx = new InitialContext();
			AddThisSessionBeanRemote rm=(AddThisSessionBeanRemote)ctx.lookup(AddThisSessionBeanRemote.class.getName());
			System.out.println(new Date() +" " +rm.addThis(1, 4));
			System.out.println(new Date() +" " +rm.addThis(1, 4));
			System.out.println(new Date() +" " +rm.addThis(1, 4));
			for (int i = 0; i < 50; i++) {
				System.out.println(new Date() +" " +rm.addThis(1, 4));
			}
			Thread.sleep(11000);
			for (int i = 0; i < 50; i++) {
				System.out.println(new Date() +" " +rm.addThis(1, 4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
