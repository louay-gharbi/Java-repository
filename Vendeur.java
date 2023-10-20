public class Vendeur extends Salarie {
    private double vente ;
    private double pourcentage ;

    Vendeur(double V , double P, int M ,double R ,String N){
        super(M,N,R);
        vente = V ;
        pourcentage = P;

    }
    public double getvente(){
        return this.vente ;}

    public double getpourcentage() {
            return this.pourcentage;
        }
    public void setvente(double V){
        this.vente =V ;}
    public void setPourcentage(double P){
        this.pourcentage =P ;}

    @Override
    void affiche() {
        super.affiche();
        System.out.println("Vente : " +this.vente);
        System.out.println("Pourcentage : " +this.pourcentage);
    }

    @Override
    double salaire() {
        return super.salaire() + this.vente* this.pourcentage;
    }
}
