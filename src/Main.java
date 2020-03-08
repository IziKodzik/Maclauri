import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//
//		JFrame jFrame = new JFrame("Maklaren");
//		jFrame.setSize(640,480);
//		jFrame.setVisible(true);
		double sinProgram;
		double mySin = 0;
		Scanner scanner = new Scanner(System.in);
		double dataT = scanner.nextDouble();
		double data = dataT;
		sinProgram = Math.sin(dataT);

		while(dataT > Math.PI){

			dataT -= Math.PI;

		}

//sin cos -sin -cos sin
		for(int op = 0 ;op < 17 ; op ++){

			switch (op%4){

				case 3:
					mySin-= Math.pow(dataT,op)*(Math.cos(0))/factorial(op);
					break;

				case 1:
					mySin+= Math.pow(dataT,op)*(Math.cos(0))/factorial(op);
					break;

			}

		}
		System.out.println("SIN results:");
		System.out.println(sinProgram);
		System.out.println(mySin +"\n");

		double cos = Math.cos(dataT);
		double myCos = 0;

//cos -sin -cos sin cos

		for(int op = 0 ;op  < 17 ; op ++){

			switch (op%4){

				case 0:
					myCos+= Math.pow(dataT,op)*Math.cos(0)/factorial(op);
					break;
				case 2:
					myCos-= Math.pow(dataT,op)*Math.cos(0)/factorial(op);

			}

		}
		System.out.println("COS results:");
		System.out.println(cos);
		System.out.println(myCos);

		double e = Math.E;
		double myE  = 0;

		for(int op = 0 ; op < 17 ; op ++){

			myE += Math.pow(dataT,op)/factorial(op);

		}

		System.out.println("\nE results:");
		System.out.println(Math.pow(e,dataT));
		System.out.println(myE);
		System.out.println();

		double mySqrt = 0;
		double val = scanner.nextDouble();
		double powVal = scanner.nextDouble();
		double sqrt = Math.sqrt(val);

		mySqrt += (Math.pow(10,0)*Math.pow(0,0.5))/factorial(0)
				+(Math.pow(10,1)*Math.pow(0,0.5)*0.5)/factorial(1);
	//			+(Math.pow(10,2)*Math.pow(0,-1.5)*-0.5)/factorial(2);
		System.out.println(sqrt);
		System.out.println(mySqrt);

	}


	public static long factorial(int x){

		int y = x;
		while(x > 1)
			y*=--x;
		if(y < 1)
			return 1;
		return y;
	}


}
