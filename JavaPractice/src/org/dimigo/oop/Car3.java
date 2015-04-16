/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 * |_Car
 *1. 개요:
 *2. 작성일: 2015. 4. 13.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3() {}
	public Car3(String company, String model, String color, int maxSpeed, int price)
	{
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxSpeed)
	{
		this(company, model, color, maxSpeed, 0);
	}
	public Car3(String company, String model, String color)
	{
		this(company, model, color, 0);
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getPrice(){
		return price;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	
	/*public void setCompany(String Company){
		company = Company; 
	}
	public void setModel(String Model){
		model = Model; 
	}
	public void setColor(String Color){
		color = Color; 
	}
	public void setPrice(int Price){
		price = Price;
	}
	public void setMaxSpeed(int MaxSpeed){
		maxSpeed = MaxSpeed;
	}*/
}
