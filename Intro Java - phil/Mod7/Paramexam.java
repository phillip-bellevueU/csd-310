



public class Paramexam {

    public static void main(String[] args){
        paramExam("Pepperoni", 16); 
    }
    public static void paramExam(String topping, int size) {
        
    System.out.println("You ordered a " + topping + " pizza, " + size + "inch size");
    }
}
      
 /* SELECT film.studio_id, studio.studio_name, studio.studio_id
    FROM film
    FULL OUTER JOIN studio ON film.film_id = studio.film_id;


mysql> SELECT film.film_name, genre.genre_name, genre.genre_id
    -> FROM film
    -> INNER JOIN genre ON film.genre_id = genre.genre_id;




mysql> SELECT film.film_name, studio.studio_name, studio.studio_id
    -> FROM film
    -> INNER JOIN studio ON film.studio_id = studio.studio_id;



  * 
  */