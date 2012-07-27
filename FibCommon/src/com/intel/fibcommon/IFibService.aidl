package com.intel.fibcommon;

import com.intel.fibcommon.Request;
import com.intel.fibcommon.IFibListener;


interface IFibService {
	long fibJ(long n);
	long fibJI(long n);
	long fibN(long n);
	long fibNI(long n);
	
	long fib(in Request req);
	oneway void asyncFib(in Request req, IFibListener listener);
}