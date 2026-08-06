package logicalstatements;

public class SumOfSquares {

	 void main(String[] args) {
		 Cube();
		 int sum =0;
		 for(int i=5;i<=10;i++) {
			 int sqr = i*i;
			 sum +=sqr; 
		 }
		 System.out.println(sum);
	}
	 void Cube() {
		 int sum = 0;
		 for(int i=0;i<=10;i++) {
			 sum +=(i*i*i);
		 }
		 System.out.println(sum);
	 }

}
