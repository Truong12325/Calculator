/*
  	Copyright (c) 2012 Somenath Mukhopadhyay.
 	All rights reserved.
 */

package android.calculator;

public interface Strategy {

	public double Convert(String from, String to, double input);
}
