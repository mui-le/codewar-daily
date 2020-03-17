//In a small town the population is p0 = 1000 at the beginning of a year. 
//The population regularly increases by 2 percent per year
//and moreover 50 new inhabitants per year come to live in the town. 
//How many years does the town need to see its population greater 
//or equal to p = 1200 inhabitants?
package codewars.com;

public class Population {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        while (p0 < p) {
            p0 = p0 + (int) (p0 * percent * 0.01) + aug;
            year++;
        }
        return year;
    }
}
