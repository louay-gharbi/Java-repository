public class Salarie {
    protected int Matricule ;
    protected String Nom ;
    protected double Recrutement;

    Salarie(int M,String N ,Double R){
        Matricule =M;
        Nom = N;
        Recrutement = R;

    }
    public int getMatricule(){
        return this.Matricule;
    }
    public String getNom(){
        return this.Nom;
    }
    public double getRecrutement(){
        return this.Recrutement ;
    }
    public String toString(){
        return "Matricule : "+this.Matricule +"\nNom : "+this.Nom + "\nannée de recrutement : "+this.Recrutement ;
    }
    public void setMatricule(int M){
        this.Matricule =M ;
    }
    public void setNom(String N){
        this.Nom =N ;
    }
    public void setRecrutement(double R){
        this.Recrutement =R ;
    }



    void affiche(){
        System.out.println(this.getClass().getSimpleName());

        System.out.println(this);
    }
    double salaire(){
        if(Recrutement<2005){
            return 500.0;
        }
        else
            return 280.0;
    }
}
