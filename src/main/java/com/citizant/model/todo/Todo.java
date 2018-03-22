package com.citizant.model.todo;

import java.util.Date;

import javax.validation.constraints.Size;

public class Todo {
	private int id;

	private String user;

	@Size(min = 10, message = "Enter atleast 10 Characters.")
	private String desc;

	private Date targetDate;
	private boolean isDone;

	public Todo() {
		super();
	}

	public Todo(int id, String user, String desc, Date targetDate,
			boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id,
				user, desc, targetDate, isDone);
	}

	public void setTodo(Todo todo) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteTodo(String todoId) {
		
		
		return true;
		
	}
	
	public String truncateNumberInFirst1Position(String str){  
		 
		  if (str.length() <= 10 ) 
		  return str.replaceAll ("1" , ""); 
		   String first2Chars = str.substring(0, 2); 
		   String stringMinusFirst2Chars = str.substring(2); 
		    return first2Chars.replaceAll ("1" , "")  
		                            + stringMinusFirst2Chars ; 
		    } 
		     public boolean areFirstAndLastTwoCharactersTheSame(String str){ 
		      
		    if (str.length() <= 1 ) 
		       return false; 
		     if (str.length() == 2 ) 
		     return true; 
		    String first2Chars = str.substring(0, 2); 
		     String last2Chars = str.substring(str.length() - 2); 
		     return first2Chars.equals(last2Chars); 
		      
		   } 

	

			

}
