package shapejava;

public class Test  {

	public static void main(String[]args) {
		
circle ci = new circle(2,"blue");
rectangle re = new rectangle(3,5,"yellow");
square sq = new square(7,"white");

cube cu = new cube(2,3,5,"black");
cylinder cy = new cylinder(4,6,"green");

ci.print();
re.print();
sq.print();
cu.print();
cy.print();	


shape cc = new shape("");
cc.printcount();
}
}
		

	




