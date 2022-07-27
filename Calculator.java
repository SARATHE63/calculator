   import java.until.*;
 class Calculator {
  
  public static void main ( String [] args ) {
   
     Scanner sc = new Scanner(System.in);
     char  operator;
     System.out.println("Choose an operator :  + ,  *  ,  /  , -   "  );
     operator=sc.next().charAt(0);
   
         Double num1 , num2,result ;
         System.out.println("Enter first number:");
         num1 =sc.nextDouble();
         System.out.println("Enter second number:");
         num2 =sc.nextDouble();

     switch(operator)
 {
     case '+' : result  = num1 + num2;
                    
                  break;
           case '-' : result = num1 - num2;
                    
                    break;  
          case   '*'  : result = num1 * num2;
                    
                    break;
            case '/'  : result = num1 / num2;
                    
                   break;
            default : 
                          System.out.println("wrong try again "); 
              break;

     } 
       sc.close();
          }

                        }
