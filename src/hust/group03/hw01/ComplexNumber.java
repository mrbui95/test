package hust.group03.hw01;

public class ComplexNumber {
	private double real, imaginairy;
	
	public ComplexNumber(double real, double imaginairy) {
		this.real = real;
		this.imaginairy = imaginairy;
	}

	public double getReal(){
		return real;
	}

	public double getImaginairy() {
		return imaginairy;
	}

	public void setImaginairy(double imaginairy) {
		this.imaginairy = imaginairy;
	}

	public void setReal(double real) {
		this.real = real;
	}
	
	public ComplexNumber getReverseComplexNumber(){
		return new ComplexNumber(real , - imaginairy);
	}
	
	public ComplexNumber sum(ComplexNumber a){
		return new ComplexNumber(real + a.getReal(), imaginairy + a.getImaginairy());
	}
	
	public ComplexNumber minus(ComplexNumber a){
		return new ComplexNumber(real- a.real, imaginairy - a.getImaginairy());
	}
	
	public ComplexNumber times(ComplexNumber a){
		return new ComplexNumber(real*a.getReal() - imaginairy*a.getImaginairy() , 
										imaginairy*a.getReal() + real*a.getImaginairy());
	}

	public ComplexNumber times(double a){
		return new ComplexNumber(real*a, imaginairy*a);
	}
	
	public ComplexNumber devide(ComplexNumber a){
		ComplexNumber result = this.times(a.getReverseComplexNumber());
		return result;
	}

	@Override
	public String toString() {
		return "ComplexNumber =" + real + "+ (" + imaginairy + ").i ";
	}
	
	
}
