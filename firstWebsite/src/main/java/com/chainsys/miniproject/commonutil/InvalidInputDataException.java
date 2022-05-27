package com.chainsys.miniproject.commonutil;

public class InvalidInputDataException extends Exception {
	public InvalidInputDataException() {
		super("The Input Data is not Volid") ;
	}public InvalidInputDataException(String message){
		super(message);
	}
}