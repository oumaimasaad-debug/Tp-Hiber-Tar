/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.beans.Personne;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author ACER
 */
public class test {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        HommeService hs = new HommeService();
        FemmeService fs = new FemmeService();
        MariageService ms = new MariageService();
        // Créez 5 objets Homme et 10 objets Femme
        Homme h1 = new Homme("Dupont", "Jean", new Date(90, 0, 4));
        Homme h2 = new Homme("Kalvin", "Klein", new Date(85, 2, 5));
        Homme h3 = new Homme("ali", "boutayeb", new Date(88, 5, 6));
        Homme h4 = new Homme("Hamid", "Bourregab", new Date(94, 8, 7));
        Homme h5 = new Homme("Saad","Youssef" , new Date(94, 10, 8));
        Femme f1 = new Femme("Khatibi", "Laila", new Date(97, 2, 9));
        Femme f2 = new Femme("Ahmed", "Hasna", new Date(95, 10, 10));
        Femme f3 = new Femme("Yassine", "Fadwa", new Date(99, 5, 11));
        Femme f4 = new Femme("Karimi", "Nadia", new Date(96, 9, 12));
        Femme f5 = new Femme("chadli", "sanaa", new Date(90, 4, 13));
        Femme f6 = new Femme("nahari", "Salma", new Date(88, 4, 22));
        Femme f7 = new Femme("lail", "Souad", new Date(89, 8, 27));
        Femme f8 = new Femme("msaoud", "Sanaa", new Date(93, 10, 5));
        Femme f9 = new Femme("Rajoui", "Meryem", new Date(98, 7, 5));
        Femme f10 = new Femme("kalli", "hassna", new Date(96, 4, 7));
         // Ajoute les hommes et femmes à la base de données
        hs.create(h1);
        hs.create(h2);
        hs.create(h3);
        hs.create(h4);
        hs.create(h5);
        fs.create(f1);
        fs.create(f2);
        fs.create(f3);
        fs.create(f4);
        fs.create(f5);
        fs.create(f6);
        fs.create(f7);
        fs.create(f8);
        fs.create(f9);
        fs.create(f10);
        /*// Affiche les femmes ajoutés
        System.out.println("La liste des femme ajoutés est : ");
        List<Femme> femmes = fs.getAll();
        for (Femme femme : femmes) {
            System.out.println(femme);
        }
        Femme femmePlusAgee = fs.getFemmeLaPlusAgee();
if (femmePlusAgee != null) {
    System.out.println("La femme la plus âgée est : " + femmePlusAgee.getNom() + " " + femmePlusAgee.getPrenom());
} else {
    System.out.println("Aucune femme n'a été trouvée.");
}
// Créer des objets Mariage en utilisant des Hommes et des Femmes

Mariage m1 = new Mariage(h2, f1, new Date(105, 0, 1), new Date(115, 0, 1), 2);
Mariage m2 = new Mariage(h2, f2, new Date(106, 0, 1), new Date(116, 0, 1), 3);
Mariage m3 = new Mariage(h3, f3, new Date(107, 0, 1), new Date(117, 0, 1), 1);
Mariage m4 = new Mariage(h4, f4, new Date(108, 0, 1), new Date(118, 0, 1), 2);
Mariage m5 = new Mariage(h5, f5, new Date(109, 0, 1), new Date(119, 0, 1), 0);
Mariage m6 = new Mariage(h5, f6, new Date(110, 0, 1), new Date(120, 0, 1), 3);
Mariage m7 = new Mariage(h2, f7, new Date(111, 0, 1), new Date(121, 0, 1), 2);
Mariage m8 = new Mariage(h3, f8, new Date(112, 0, 1), new Date(122, 0, 1), 1);
Mariage m9 = new Mariage(h4, f9, new Date(113, 0, 1), new Date(123, 0, 1), 4);
Mariage m10 = new Mariage(h1, f10, new Date(114, 0, 1), new Date(124, 0, 1), 0);
ms.create(m1);
ms.create(m2);
ms.create(m3);
ms.create(m4);
ms.create(m5);
ms.create(m6);
ms.create(m7);
ms.create(m8);
ms.create(m9);
ms.create(m10);


   Homme hommeRech = new Homme();
        hommeRech = hs.getById(2);
        Date dateDebut = new Date(105, 0, 1) ;
        Date dateFin = new Date(124, 0, 1) ;
        
 
List<Femme> epouses = hs.getEpousesEntreDates(hommeRech, dateDebut, dateFin);
        
        if (epouses.isEmpty()) {
            System.out.println("Aucune épouse trouvée.");
        } else {
            System.out.println("Épouses de l'homme entre les dates :");
            for (Femme epouse : epouses) {
                System.out.println(epouse.getNom() + " " + epouse.getPrenom());
            }
        }*/
    }
}
     
    


      
   




        
        
        
       
        
    



