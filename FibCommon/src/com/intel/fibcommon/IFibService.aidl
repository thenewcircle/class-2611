package com.intel.fibcommon;

import com.intel.fibcommon.Request;

interface IFibService {
	long fibJ(long n);
	long fibJI(long n);
	long fibN(long n);
	long fibNI(long n);
	
	long fib(in Request req);
}