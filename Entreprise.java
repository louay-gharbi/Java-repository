public class Entreprise {
    public static void main(String[] args) {
        Salarie[] tabSalarie = new Salarie[5];
        Employe E1 = new Employe(15, 4, 12345, 2002, "walid");
        Employe E2 = new Employe(7, 4, 12345, 2008, "Khaled");
        Employe E3 = new Employe(19, 5, 87698, 2003, "Aymen");
        Vendeur V2 = new Vendeur(700, 0.1, 65478, 2000, "Nassime");
        Vendeur V1 = new Vendeur(1000, 0.1, 23445, 2007, "Yessine");
        tabSalarie[0] = E1;
        tabSalarie[1] = E2;
        tabSalarie[2] = E2;
        tabSalarie[3] = V1;
        tabSalarie[4] = V2;
// afficher la liste des vendeurs
        System.out.println("---------------Liste des vendeurs-----------------");
        for (int i = 0; i < tabSalarie.length; i++) {
            if (tabSalarie[i] instanceof Vendeur) {
                tabSalarie[i].affiche();
            }
        }
// afficher la liste des Employées

        System.out.println("--------------Liste des Employes--------------------");
        for (int i = 0; i < tabSalarie.length; i++) {
            if (tabSalarie[i] instanceof Employe) {
                tabSalarie[i].affiche();
            }
        }
// afficher le nom du salarié le plus ancien
        Salarie SMin = tabSalarie[0];
        for (int i = 1; i < tabSalarie.length; i++){
            if(SMin.Recrutement>tabSalarie[i].Recrutement){
                SMin = tabSalarie[i];
            }
        }
        System.out.println("le Nom du salarie le plus ancien est  : "+SMin.Nom);
//afficher le matricule du vendeur qui a le plus grand salaire
        Salarie SMax = null;
        for (int i = 0; i < tabSalarie.length; i++) {
            if (tabSalarie[i] instanceof Vendeur) {
                if (SMax == null) {
                    SMax = tabSalarie[i];

                } else if (SMax.salaire() < tabSalarie[i].salaire()) {
                    SMax = tabSalarie[i];

                }
            }
        }
        System.out.println("le Matricule du vendeur disposant du plus grand salaire est : "+SMax.Matricule);


    }
}
