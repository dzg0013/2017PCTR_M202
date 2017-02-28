package p01;

public class BallMove extends Thread {

	private Ball ball;
	private Board board;

	public BallMove(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	public void run() {

		try {
			this.ball.move();
			this.ball.reflect();
			this.board.validate();
			this.board.repaint();
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			return;
		}

	}

}
