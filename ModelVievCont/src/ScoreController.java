
public class ScoreController implements Subscriber {
	private Publisher cricketserver;
	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.cricketserver.getScore();
	}

	@Override
	public void setPublisher(Publisher cricketserver) {
		// TODO Auto-generated method stub
		this.cricketserver = cricketserver;
	}

	public void setScore(int i) {
		// TODO Auto-generated method stub
		this.cricketserver.setScore(i);
	}
	
	

}
