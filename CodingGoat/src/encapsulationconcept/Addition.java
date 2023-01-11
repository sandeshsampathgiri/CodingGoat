package encapsulationconcept;

public class Addition {
	
	private int x, y, z;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	} 
	
	public void sum()
	{
		int sum= x+y+z;
		System.out.println("Sum="+sum);
	}

}