package com.ntelx.testingclient;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.ntelx.datasource.WatchPointDAO;
import com.ntelx.datasource.model.WatchPointModel;

public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
	    System.out.println("Client Started");
	    WatchPointDAO dao = new WatchPointDAO();
	    WatchPointModel model = dao.retrieveWatchPointById(1160);
	    System.out.println(model);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
	}

}
