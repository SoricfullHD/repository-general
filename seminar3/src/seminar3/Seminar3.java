
 
package seminar3;


public class Seminar3 {

  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Obiecte
        Hero h1=new Hero("Principae", 13);
        Hero h2=new Hero("Hastati", 10);
        
        
        
        //Afisarea Eroilor
        h1.afisare();
        h2.afisare();
        
        //Atacurile intre eroi
        while (h1.getHealth()>0&&h2.getHealth()>0)
        h2.attack(h1);
        h1.attack(h2);
                
        
        //OP Hero
         class SuperHero extends Hero{
            int mana;
            
            public SuperHero(String name, int damage, int mana){
                super(name, damage);
                        this.mana=mana;
            }
        }
        
   
           
        
        
        
        
    }
    
}
