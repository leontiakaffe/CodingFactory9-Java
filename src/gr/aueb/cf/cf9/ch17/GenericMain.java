package gr.aueb.cf.cf9.ch17;

public class GenericMain {
	public static void main(String[] args) {
		GenericNode<String> strnode = new GenericNode<>();
		GenericNode<Double> doublenode = new GenericNode<>();  //Στα generics, όχι primitives ως παραμετρικοί τύποι
		var intNode = new GenericNode<Integer>();

		doublenode.setValue(10.5);
		strnode.setValue("Hello");
	}
}
