package app.prog;

public class DesktopApplication extends Application {
	protected int purchaseid;

	public DesktopApplication() {
		super();
	}

	public DesktopApplication(double version, String technology, Developer developer, int purchaseid) {
		super(version, technology, developer);
		this.purchaseid = purchaseid;
	}

	@Override
	public String toString() {
		return "DesktopApplication [purchaseid=" + purchaseid + ", toString()=" + super.toString() + "]";
	}

}
