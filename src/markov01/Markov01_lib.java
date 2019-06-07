package markov01;

public class Markov01_lib {
	private double p; //右へ移動する確率
	private int n, t; //n:座標, t:シミュレーション時間
	
	public Markov01_lib(double p, int t) {
		this.p = p;
		this.n = 0;
		this.t = t;
	}
	
	public double getValue() {
		
		return 0;
	}
	
	//p = 1/2 => Reccurent, p =! 1/2 => Transient
	public double[] getSimulation() {
		double prob[] = new double[n];
		int position = 0; 
		for(int i = 0; i < t; i++) {
			
		}
		
		return prob;
	}
	

}
