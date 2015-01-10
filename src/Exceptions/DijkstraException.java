package Exceptions;

public class DijkstraException extends Exception
{
	private static final long serialVersionUID = 1L;

	public DijkstraException(String message){
		super(message);
	}
	
	public void showMessage(){
		System.out.println(getMessage());
	}

}
