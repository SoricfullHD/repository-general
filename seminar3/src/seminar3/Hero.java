
package seminar3;


public class Hero {
    
 private String name;
 private int health=100;
 private int damage;
 private int level=1;
 
 //Attack Probability
 static final double PROBABILITYOFATTACK=0.8;
   
 
 
 //Functia de atac + Death + Level Up
 public void attack(Hero victim){
     
     if (!( this.health>0&&victim.health>0)){
         
         System.out.println("The enemy has fallen, cannot attack anymore.");
         
         return;
     }
     
     int dmg1 = (int) (Math.random()*(this.damage/2)+this.damage/2);
     System.out.println(this.getName()+" is attacking "+victim.getName()+" with damage "+dmg1);
     victim.health-=dmg1;
     
     int dmg2 = (int) (Math.random()*(victim.damage+1/2)+victim.damage/2+1);
     System.out.println(victim.getName()+" is attacking "+this.getName()+" with damage "+dmg2);
     this.health-=dmg2;
     
     if (victim.getHealth ()<=0){
         victim.health=0;
     System.out.println(victim.getName()+" has been killed !");
     this.level++;
     System.out.println(this.getName()+" has leveled up !");
     
    }
     if (this.getHealth ()<=0){
         this.health=0;
     System.out.println(this.getName()+" has been killed !");
     this.level++;
     System.out.println(victim.getName()+" has leveled up !");
    }
 }
 
 //Functia de attack x2
 public void fight (Hero victim){
     while(this.getHealth()>0&&victim.getHealth()>0)
         this.attack(victim);
         victim.attack(this);
 }
 
 
 
 
 
 
 
 
 
 
 
   
  //Constructor
   private Hero(String name, int damage, int health, int level){
   
   
   this.name=name;
   this.health=health;
   this.damage=damage;
   this.level=level;
   }
   
   
   public Hero(String name, int damage){
       this(name,damage,100,1);
    
   }
   
   
   //Constructor de copiere
   public Hero(Hero x){
       this(x.name,x.health,x.damage,x.level);
   }
   
   
   
   
   

   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name=name;
   
   }
   
   

   public int getHealth(){
       return this.health;
   }
   public void setHealth(int health) {
        this.health = health;
    }
   
   
   

   public int getDamage() {
        return this.damage;
    }

    
    
    
    
    public int getLevel() {
        return this.level;
    }

     
     
     
   //Afisare Stats
     public void afisare(){
     
         System.out.println("Name " + this.name);
         System.out.println("Health " + this.health);
         System.out.println("Damage " + this.getDamage());
         System.out.println("Level "+ this.getLevel());
     
     
     }



    
    
    
    
    
     
     
     
     
}


