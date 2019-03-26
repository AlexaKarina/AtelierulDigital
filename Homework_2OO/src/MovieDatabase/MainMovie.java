package MovieDatabase;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainMovie {
    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});

        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});


        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Premiu[] premiuDatabase = new Premiu[]{oscar1990, oscar2000, oscar2010, oscar2018};
        Actor[] actorDatabase = new Actor[]{actorOscar1990, actorOscar2010, actorOscar2018, actorFaraPremii01, actorFaraPremii02, actorFaraPremii03};
        Film[] filmDatabase = new Film[]{film1, film2, film3, film4, film5};
        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        //1
        System.out.println("All studios that have published more than 2 movies:");
        for (int i = 0; i < studioDatabase.length; i++) { //parcurgem array-ul cu studiouri
            if (studioDatabase[i].filme.length > 2) { //daca studio-ul are mai mult de 2 filme
                System.out.println(studioDatabase[i].getNume()); //print studio name
            }
        }

        //2
        System.out.println("Studio names in witch plays the actor with name 'actor cu 2 oscaruri':");
        String numeFilm = new String();
        for (int i = 0; i < actorDatabase.length; i++) {//parcurgem array-ul cu actori
            if (actorDatabase[i].premii.length == 2)//pentru actorii cu 2 oscaruri
                System.out.println(studioDatabase[i].nume);//print studio name
        }

        //3
        String numePremiu = new String();
        System.out.println("Get movie names in witch plays at least an actor with age above 50");
        //parcurgem array-ul cu actori
        for (int i = 0; i < actorDatabase.length; i++)
            if (actorDatabase[i].varsta > 50) {
               // if (actorDatabase[i].premii.equals(premiuDatabase[i])) {
                    for (int j = 0; j < filmDatabase.length; j++)
                        if (filmDatabase[j].actori.equals(actorDatabase[i]))
                            System.out.println(filmDatabase[j].nume);
                //}
            }

    }
}
