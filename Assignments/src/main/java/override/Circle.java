package override;

public class Circle extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle=new Circle();
		circle.findArea();
		Rectangle rectangle=new Rectangle();
		rectangle.findArea();
		
		
				

	}
	@Override
	public void findArea() {
		float radius= 4.5f;
		area=3.14f*radius*radius;
		System.out.println("Area of Circle is "+ area);
		
	}
	

}
