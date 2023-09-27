package java2prj2;

public class Play {

	String player;
	int score;
	int lank;
	@Override
	public String toString() {
		return "Play [player=" + player + ", score=" + score + ", lank=" + lank + "]";
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLank() {
		return lank;
	}
	public void setLank(int lank) {
		this.lank = lank;
	}
	public Play(String player, int score, int lank) {
		super();
		this.player = player;
		this.score = score;
		this.lank = lank;
	}
	public Play() {
		// TODO Auto-generated constructor stub
	}
}
