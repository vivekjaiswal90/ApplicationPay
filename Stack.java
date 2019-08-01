package com.vivek.immutable;

public interface Stack<T> {
	/**
	 * 
	 * @param t generic type for the elements of the stack
	 * @return the new stack after inserting the element {@code t} to the end of the stack 
	 */
	public Stack<T> push(T t);
	
	/**
	 * 
	 * @return the new stack after removing the element from the end of the stack 
	 */
	public Stack<T> pop() throws Exception;
	
	/**
     * 
     * @return the head (end) element of the stack
     * @throws Exception when queue is empty
     */
	public T head() throws Exception;
	
	/**
    * 
    * @return true when stack is empty, false otherwise
    */
	public boolean isEmpty();
}