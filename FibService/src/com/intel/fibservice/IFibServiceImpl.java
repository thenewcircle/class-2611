package com.intel.fibservice;

import android.os.RemoteException;

import com.intel.fibcommon.IFibListener;
import com.intel.fibcommon.IFibService;
import com.intel.fibcommon.Request;

public class IFibServiceImpl extends IFibService.Stub {

	@Override
	public long fibJ(long n) throws RemoteException {
		return FibLib.fibJ(n);
	}

	@Override
	public long fibJI(long n) throws RemoteException {
		return FibLib.fibJI(n);
	}

	@Override
	public long fibN(long n) throws RemoteException {
		return FibLib.fibN(n);
	}

	@Override
	public long fibNI(long n) throws RemoteException {
		return FibLib.fibNI(n);
	}

	@Override
	public long fib(Request request) throws RemoteException {
		switch(request.getAlgorithm()) {
		case 1:
			return FibLib.fibJ(request.getN());
		case 2:
			return FibLib.fibJI(request.getN());
		case 3:
			return FibLib.fibN(request.getN());
		case 4:
			return FibLib.fibNI(request.getN());
		default:
			return -1;
		}
	}

	@Override
	public void asyncFib(Request req, IFibListener listener)
			throws RemoteException {
		long result = fib(req);
		listener.response(result);
	}

}
