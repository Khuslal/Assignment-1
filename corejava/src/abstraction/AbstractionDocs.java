package abstraction;

public class AbstractionDocs {
	/*
	 * ==========Abstraction============
	 * 
	 * # Process of hiding implementation details.
	 * # To achieve abstraction :
	 * 
	 *  1. Abstract class :
	 *  	# Class which contains abstraction methods and non-abstract methods.
	 *  	# Abstract method:
	 *  		-> method which does not have body/implementation.
	 *  		-> syntax:
	 *  			abstract return_type method_name(arg1, ... argn);
	 *  			e.g.
	 *  				abstract void print();
	 *  				abstract int getArea(int l, int b);
	 *  	# every abstract class must have at least one child class and 
	 *  	  child class must override abstract methods.
	 *  	# level of abstraction 0-100%
	 *  	# we can't create object of abstract.
	 *  	# syntax:
	 *  		abstract class class-name{
	 *  			// abstract methods
	 *  			// non-abstract methods
	 *  		}
	 *  
	 *  2. Interface :
	 *  	# same as class which contains public abstract methods and public static final methods only.
	 *  
	 *  	# every interface must have at least one implementation class
	 *  	  and impl. class must override abstract methods.
	 *  
	 *  	# 100% abstraction
	 *  	# can't create object
	 *  	# we can inherit multiple interfaces at a time.
	 *  	# syntax : 
	 *  		interface interface_name{
	 *  			// public abstract methods
	 *  			// public static final(constants)
	 *  		}
	 * 
	 */
}
