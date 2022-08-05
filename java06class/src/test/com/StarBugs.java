package test.com;

import java.util.Arrays;
import java.util.Objects;

public class StarBugs {

	private int num;
	private String location;
	private String ceo_name;
	private String[] memu = new String[3];// {ice_coffee,hot_coffee}

	public StarBugs() {
		// TODO Auto-generated constructor stub
	}

	public StarBugs(int num, String location, String ceo_name, String[] memu) {
		super();
		this.num = num;
		this.location = location;
		this.ceo_name = ceo_name;
		this.memu = memu;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCeo_name() {
		return ceo_name;
	}

	public void setCeo_name(String ceo_name) {
		this.ceo_name = ceo_name;
	}

	public String[] getMemu() {
		return memu;
	}

	public void setMemu(String[] memu) {
		this.memu = memu;
	}

	@Override
	public String toString() {
		return "StarBugs [num=" + num + ", location=" + location + ", ceo_name=" + ceo_name + ", memu="
				+ Arrays.toString(memu) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(memu);
		result = prime * result + Objects.hash(ceo_name, location, num);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StarBugs other = (StarBugs) obj;
		return Objects.equals(ceo_name, other.ceo_name) && Objects.equals(location, other.location)
				&& Arrays.equals(memu, other.memu) && num == other.num;
	}

}
