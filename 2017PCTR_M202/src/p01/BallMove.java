package p01;

public class BallMove extends Thread {
	
	private Ball ball;
	private Board broad;

	public BallMove(Ball ball){
		this.ball=ball;
	}
	
	public void run(){
		ball.move();
		broad.repaint();
		
	}

}
