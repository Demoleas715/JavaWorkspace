package u8.capitals;

public class StateCapital {

	private String state;
	private String capital;

	public StateCapital(String state, String capital) {
		this.state = state;
		this.capital = capital;
	}

	public boolean equals(Object o) {
		if (o instanceof StateCapital) {
			StateCapital sc = (StateCapital) o;
			if (sc.state.equals(this.state) && sc.capital.equals(this.capital)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public String getState() {
		return state;
	}

	public String getCapital() {
		return capital;
	}
}
