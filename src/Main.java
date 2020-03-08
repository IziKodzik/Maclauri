import java.math.BigDecimal;
import java.math.BigInteger;
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
		for(int op = 0 ;op < 13 ; op ++){

			double tmp = Math.pow(dataT,op)*(Math.cos(0))/factorial(op);

			switch (op%4){


				case 3:
					mySin+= tmp;
					break;

				case 1:
					mySin-= tmp;
					break;

			}

		}
		System.out.println("SIN results:");
		System.out.println(sinProgram + " - computer's result.");
		System.out.println(mySin +" - my result.");
		System.out.print("difference: ");
		System.out.println(mySin - sinProgram);
		System.out.println();

		double cos = Math.cos(dataT);
		double myCos = 0;

//cos -sin -cos sin cos

		for(int op = 0 ;op  < 13 ; op ++){

			double tmp = Math.pow(dataT,op)*Math.cos(0)/factorial(op);

			switch (op%4){


				case 0:
					myCos+= tmp;
					break;
				case 2:
					myCos-= tmp;

			}

		}
		System.out.println("COS results:");
		System.out.println(cos + " - computer's result.");
		System.out.println(myCos + " - my result.");
		System.out.print("difference: ");
		System.out.println(myCos - cos);

		double e = Math.E;
		double myE  = 0;
		double myE2 = 1;

		for (int i = 100; i > 0; --i )
			myE2 = 1 + data * myE2 / i;

		for(int op = 0 ; op < 13 ; op ++){

			double tmp = Math.pow(data,op)/factorial(op);
			myE+= tmp;

		}

		System.out.println("\nE results:");
		System.out.println(Math.pow(e,data) + " - computer's result.");
		System.out.println(myE + " - my result vol1.");
		System.out.println(myE2 + " - my result vol2.");
		System.out.print("difference: ");
		System.out.println(myE2 - Math.pow(e,data));
		System.out.println();

		double sqr = 3 +( 0.5 * Math.pow(9,-0.5))/factorial(1) - (0.25*Math.pow(9,-1.5))/factorial(2)
				+ ((3/(double)8) * Math.pow(9,-2.5))/factorial(3)  + (double)(15/16) * Math.pow(9,3.5)/factorial(4) ;

		double msqr = 3;
		double powVal = 0.5;
		double multiplier = 1;

		for(int op = 1 ; op < 13 ; op ++){

			double tmp = powVal * multiplier * Math.pow(9,powVal-1)/factorial(op);
			powVal--;
			multiplier*=powVal;
			if(op%2==1)
				msqr+=tmp;
			else
				msqr-=tmp;

		}

		System.out.println("Sqrt results:");
		System.out.println(Math.sqrt(10) + " computer result.");
		System.out.println(sqr + " - my result vol1.");
		System.out.println(msqr + " - my result vol2.");
		System.out.print("difference: ");
		System.out.println(sqr -Math.sqrt(10));


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
