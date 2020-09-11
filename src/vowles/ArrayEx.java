package vowles;

public class ArrayEx {
	public static void run(int x) {
		++x;
		x++;
	}
	
	public static void main(String args[])
	{
		int x=25;
		try {
			run(x++);
			return;
		}
		finally {
			x++;
		}
		
	}

}
