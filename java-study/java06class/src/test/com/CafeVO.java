package test.com;

import java.util.Objects;

public class CafeVO {

	private StarBugs sb;
	private MegaCoffee mc;

	public CafeVO() {
		// TODO Auto-generated constructor stub
	}

	public CafeVO(StarBugs sb, MegaCoffee mc) {
		super();
		this.sb = sb;
		this.mc = mc;
	}

	public StarBugs getSb() {
		return sb;
	}

	public void setSb(StarBugs sb) {
		this.sb = sb;
	}

	public MegaCoffee getMc() {
		return mc;
	}

	public void setMc(MegaCoffee mc) {
		this.mc = mc;
	}

	@Override
	public String toString() {
		return "CafeVO [sb=" + sb + ", mc=" + mc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mc, sb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CafeVO other = (CafeVO) obj;
		return Objects.equals(mc, other.mc) && Objects.equals(sb, other.sb);
	}

}
