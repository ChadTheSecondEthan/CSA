package Module10;

/*

2. Yes
3. Yes
4. It changed the element with an index of 4 to a 0
6. No, they are variables local to the for loop in which they were initialized

*/

class ChangeArray
{
  void print ( int[] x )
  {
    for ( int j=0; j < x.length; j++ )
      System.out.print( x[j] + " " );
    System.out.println( );
  }

  void zeroElt ( int[] x, int elt )             // 6.
  {
    if ( elt < x.length )                       // 7.
      x[ elt ] = 0;                             // 8.
  } 
  
  void zeroAll ( int[] ar )
  {
	    for ( int j=0; j < ar.length; j++ )
	      ar[j] = 0;
  }
}

class ChangeArrayEBF
{
  public static void main ( String[] args )     // 1.
  {
    ChangeArray cng = new ChangeArray();        // 2.
    
    int[] value = {27, 19, 34, 5, 12} ;         // 3.
    
    System.out.println( "Before:" );            // 4.
    cng.print( value );
    
    cng.zeroElt( value, 0 );                    // 5.
    System.out.println( "After:" );             // 9.
    cng.print( value );
    
    cng.zeroElt(value, 4);
    cng.print(value);
  }
}