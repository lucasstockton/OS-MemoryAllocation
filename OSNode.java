import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Write a description of class OS Node here.
 *
 * @author Lucas Heuman
 * @version Prototype 1
 * First I imported the Scanner Class import java.util.Scanner; I use this to grab the input from the user.
 * 
 * operands  are the integers and operators are the math functions
 * 
 */
public class OSNode {
	
	/*
	 * precedence_level is a two dimensional array that  uses it's nested level to return
	 * the precedence. Level 0 contains operands and level 1 and up contain operators
	 * 
	 */
	
    private char precedence_level[][] = { { '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'}
    ,{ '+' , '-' }
    , { '*' , '/' }
    , { '^' } }; 	
	
	/*
	 *  These are the internal vars of the node. It's innefficent to reuse them for the 
	 *  child nodes but I'm writing for speed not for memory.
	 */   
    
		public String value; // This is the String Value of the operator or operands
		private OSNode left, right , next;
		public count = 0;
		
		OSNode (String _value)
		{
			value = _value;
			left = right = next = null;
			
		}
		
		OSNode ()
		{
			
			value = null;
			left = right = next = null;		
			
		}
		
		public void createTree(String _infix_input)
		{
			
	        Deque<Character> operatorStack = new ArrayDeque<>(); 
	        Deque<Integer> operandStack = new ArrayDeque<>(); 
	        
			OSNode _head = this;
			OSNode _left , _right;			
			_left = _right = null;
			
			
			for (int i =0; i < _infix_input.length(); i++)
	        {
				
				
				
	        
	        } // End for loop _infix_input
			
		}
		
		
	

}
