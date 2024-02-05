package app.mob;

import app.prog.Application;
import app.prog.Developer;

public class MobileApplication extends Application {
	private long IMEI;

	public MobileApplication() {
		super();

	}

	public MobileApplication(double version, String technology, Developer developer, long IMEI) {
		super(version, technology, developer);
		this.IMEI = IMEI;
	}

	@Override
	public String toString() {
		return "MobileApplication [IMEI=" + IMEI + ", toString()=" + super.toString() + "]";
	}

}
