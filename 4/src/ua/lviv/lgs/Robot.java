package ua.lviv.lgs;

public class Robot {
	private String functions;
	
	Robot () {
		this.setFunctions("� Robot � � ������ ������");
	}

	public String getFunctions() {
		return functions;
	}


	public void setFunctions(String functions) {
		this.functions = functions;
	}


	public void Work () {
		System.out.println(functions);
	}
}
