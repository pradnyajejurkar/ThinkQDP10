package app.prog;

public class WebApplication extends Application{
	protected int purchaseid;
	
	public WebApplication() {
		super();
	}
	
	public WebApplication(double version,String technology,Developer developer,int purchaseid) {
		super(version,technology,developer);
		this.purchaseid=purchaseid;
	}

	@Override
	public String toString() {
		return "WebApplication [purchaseid=" + purchaseid + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
