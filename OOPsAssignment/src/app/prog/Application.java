package app.prog;

public class Application {
	private double version;
	private String technology;
	private Developer developer;
	
	public Application() {
		
	}
	
	public Application(double version,String technology,Developer developer) {
	   this.version=version;
	   this.technology=technology;
	   this.developer=developer;
	}
	
	public void install() {
		System.out.println("Installing application");
	}
	public void uninstall() {
		System.out.println("uninstalling application");
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "Application [version=" + version + ", technology=" + technology + ", developer=" + developer + "]";
	}

}
