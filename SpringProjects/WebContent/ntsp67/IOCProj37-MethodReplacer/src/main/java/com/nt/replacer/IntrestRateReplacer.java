package com.nt.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrestRateReplacer implements MethodReplacer {
   private float rate;
   
	public void setRate(float rate) {
	this.rate = rate;
}

	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		System.out.println("IntrestRateReplacer:reimplement(-,-,-) method");
      float pAmt=0.0f;
      float time=0.0f;
		System.out.println("target Bean:"+bean.getClass()+" target method"+method.getName()+" target method args"+Arrays.toString(args));
        //get target method args
        pAmt=(Float)args[0];
        time=(Float)args[1];
        //calc Intr Amount with new details
		return  pAmt*time*rate/100.0f;
	}

}
