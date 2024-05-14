package exception;

import java.util.Date;

public class EligibilityInfo {

	private String	memberId;
	private Date	effectiveFrom;
	private Date	effectiveTo;

	public String getId( ) {
		return memberId;
	}

	public void setId( String memberId ) {
		this.memberId = memberId;
	}

	public Date getEffectiveFrom( ) {
		return effectiveFrom;
	}

	public void setEffectiveFrom( Date effectiveFrom ) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo( ) {
		return effectiveTo;
	}

	public void setEffectiveTo( Date effectiveTo ) {
		this.effectiveTo = effectiveTo;
	}

}
