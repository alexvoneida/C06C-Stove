
public class Burner {
	public enum Temperature {
		COLD,
		WARM,
		HOT,
		BLAZING
	}
	
	
	Temperature temperature;
	Setting mySetting;
	int timer;
	public final static int TIME_DURATION = 2;

	public Temperature getTemperature() {
		return temperature;
	}

	public Burner() {
		super();
		this.temperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
		this.timer = 0;
	}

	public void plusButton() {
		timer = TIME_DURATION;
		switch (mySetting) {
			case Setting.OFF:
				mySetting = Setting.LOW;
				break;
			case Setting.LOW:
				mySetting = Setting.MEDIUM;
				break;
			case Setting.MEDIUM:
				mySetting = Setting.HIGH;
				break;
			case Setting.HIGH:
				break;
		}
	}
	
	public void minusButton() {
		timer = TIME_DURATION;
		switch (mySetting) {
		case Setting.OFF:
			break;
		case Setting.LOW:
			mySetting = Setting.OFF;
			break;
		case Setting.MEDIUM:
			mySetting = Setting.LOW;
			break;
		case Setting.HIGH:
			mySetting = Setting.MEDIUM;
			break;
		}
	}
	
	public void updateTemperature() {
		timer -= 1;
		if (timer <= 0) {
			timer = TIME_DURATION;
			if (temperature.ordinal() < mySetting.ordinal()) {
				if (temperature.ordinal() < 3) {
					temperature = Temperature.values()[temperature.ordinal() + 1];
				}
			} else if (temperature.ordinal() > mySetting.ordinal()) {
				if (temperature.ordinal() > 0) {
					temperature = Temperature.values()[temperature.ordinal() - 1];
				}
			}
		}
			
	}

}
