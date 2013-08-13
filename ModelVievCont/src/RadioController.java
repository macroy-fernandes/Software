
public class RadioController implements Subscriber {

	private Subscriber radioview;
	private Publisher cricketserver;
	

	public RadioController(Subscriber radioview) {
		// TODO Auto-generated constructor stub
		this.radioview = radioview;
	}

	public Subscriber getView() {
		// TODO Auto-generated method stub
		return this.radioview;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		((RadioView) this.radioview).display(this.cricketserver.getScore());
		//this.cricketserver.getScore();
		
	}

	@Override
	public void setPublisher(Publisher cricketserver) {
		// TODO Auto-generated method stub
		this.cricketserver = cricketserver;
	}

	



}
