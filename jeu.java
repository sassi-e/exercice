import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ayouu
 */
public class JeuMystere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("---bienvenu au jeu de mystere ---- ");
        System.out.println("---veillez choisir le niveau ---");
        System.out.println("---1 : niveau facile ---");
        System.out.println("---2 : niveau moyen ---");
        System.out.println("---3 : niveau difficile ---");
        System.out.println("---0 : quitter ---");
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x==1)
              premier_niveau();
        else
            if (x==2)
                deuxieme_niveau();
        else
                if (x==3)
                    troisieme_niveau();
        else
                    System.exit(0);
        
        
    }
    static void  premier_niveau()
    {
        Scanner sc = new Scanner (System.in);
        int a = (int)( Math.random()*(100-0));
        int i = 0;
        System.out.println("Niveau facile : le mystere est un nombre entre 0 et 100");
        System.out.println("donner un nombre entre 0 et 100");
        int b = sc.nextInt();
        int j=15;
        do{
            i++;
            j =-i;
            if (a>b)
            {
                System.out.println("c'est plus, il vous reste" + j + "tentatives");
            System.out.println("donner un nombre entre 0 et 100");
            }
            else 
                if (a<b)
                {     System.out.println("c'est plus, il vous reste" + j + "tentatives");
                System.out.println("donner un nombre entre 0 et 100");
                }
                else 
                    System.out.println("bravo! vous avez gagner au bout de " + j + "tentatives");
        } while (j>=0);
    }
    
     static void  deuxieme_niveau()
    {
         Scanner sc = new Scanner (System.in);
        int a = (int)( Math.random()*(10000-0));
        int i = 0;
        System.out.println("Niveau moyen : le mystere est un nombre entre 0 et 10000");
        System.out.println("donner un nombre entre 0 et 10000");
        int b = sc.nextInt();
        int j=10;
        do{
            i++;
            j =-i;
            if (a>b)
            {
                System.out.println("c'est plus, il vous reste" + j + "tentatives");
            System.out.println("donner un nombre entre 0 et 10000");
            }
            else 
                if (a<b)
                {     System.out.println("c'est plus, il vous reste" + j + "tentatives");
                System.out.println("donner un nombre entre 0 et 10000");
                }
                else 
                    System.out.println("bravo! vous avez gagner au bout de " + j + "tentatives");
        } while (j>=0);
    }
     
     
 }
