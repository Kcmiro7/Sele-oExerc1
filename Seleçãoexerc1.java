import java.util.Scanner;
public class Seleçãoexerc1
{
        public static void main(String[]args)
        {
     
            float x;
            Scanner resultados = new Scanner (System.in);
            System.out.println("Digite um valor para x");
            x = resultados.nextFloat();
            while(x!=2);
            {
                if (x%2==0)
                {
                    x = x /2;
    
                }
                else
                {
                    x = 3 * x + 1;
                }
    
        
                System.out.println(x +"-> ");
            }
    
            
            }

}
