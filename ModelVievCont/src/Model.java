import java.util.ArrayList;


public class Model implements Publisher {
	ArrayList<Subscriber> subscriberlist = new ArrayList<Subscriber>();
	private int totalscore;
	@Override
	public void subscribe(Subscriber radiocontroller) {
		// TODO Auto-generated method stub
		subscriberlist.add(radiocontroller);
		radiocontroller.setPublisher(this);
		
	}
	@Override
	public Subscriber getsubscriber(int i) {
		// TODO Auto-generated method stub
		return subscriberlist.get(i);
	}
	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		this.totalscore += score;
		this.cnotify();
		
	}
	private void cnotify() {
		// TODO Auto-generated method stub
		for(Subscriber a : subscriberlist)
		{
			a.update();
		}
	}
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return this.totalscore;
	}

}
