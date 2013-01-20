package test;

public class Child extends Parent{
	public String toString(){
		return super.getName();
	}
	public static void main(String[]args){
		System.out.println(new Child());
	}
}
