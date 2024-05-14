package innerClass;

public class OuterClass {
	int outerVar;
	
	public int getOuterVar() {
		return outerVar;
	}

	public void setOuterVar(int outerVar) {
		this.outerVar = outerVar;
	}

	public class InnerClass{
		int innerVar;

		public int getInnerVar() {
			return innerVar;
		}

		public void setInnerVar(int innerVar) {
			this.innerVar = innerVar;
		}
		
		
	}

}
