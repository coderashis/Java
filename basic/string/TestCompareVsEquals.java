
public class TestCompareVsEquals {

    public static void main(String[] args) {

        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = "abc";

        int result = str1.compareTo(str2);
        System.out.println(result);
        
        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);
        
        
      String Str1 = new String("abc");
      String Str2 = Str1;
      String Str3 = new String("abc");
      String Str4 = new String("abC");
      boolean retVal;

      // public boolean equals(Object anObject) 
      retVal = Str1.equals( Str2 );
      System.out.println("Returned Value = " + retVal );

      retVal = Str1.equals( Str3 );
      System.out.println("Returned Value = " + retVal );
      
      retVal = Str1.equals( Str4 );
      System.out.println("Returned Value = " + retVal );

      

    }
}

/*
0
-32
32
Returned Value = true
Returned Value = true
Returned Value = false

*/
