import static org.junit.Assert.*;

import org.junit.Test;


public class ModelTest {

	@Test
	public void test() {
		Publisher cricketserver = new Model();
		RadioView radioview = new RadioView();
		RadioController radiocontroller = new RadioController(radioview);
		Subscriber scoreController = new ScoreController();
		
		assertTrue(radioview.equals(radiocontroller.getView()));
		
		cricketserver.subscribe(radiocontroller);
		assertTrue(radiocontroller.equals(cricketserver.getsubscriber(0)));
		
		cricketserver.setScore(100);
		assertEquals(100,cricketserver.getScore());
		
		cricketserver.subscribe(scoreController);
		((ScoreController)scoreController).setScore(100);
		assertEquals(200,cricketserver.getScore());
	}

}
