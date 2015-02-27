package fr.logger.com;

//import java.util.Random;

public enum Level {
	DEBUG(2), INFO(1), ERROR(0);
	private final int value;

	private Level(int value) {
		this.value = value;
	}

	public int getLevel() {
		return value;
	}

	public Level getLevel(int i) {
		if (i == 0)
			return Level.ERROR;

		if (i == 1)
			return Level.INFO;

		if (i == 2)
			return Level.DEBUG;

		return null;

	}
}