public class Employe extends Salarie {
    private double Hsupp;
    private double PHsupp;

    Employe(double hs,double phs , int M ,double R ,String N) {
        super(M, N, R);
        this.Hsupp = hs;
        this.PHsupp = phs;
    }
    public double getHsupp(){
        return this.Hsupp ;}

    public double getPHsupp() {
        return this.PHsupp;
    }
    public void setHsupp(double H){
        this.Hsupp =H ;}
    public void setPHsupp(double P){
        this.PHsupp =P ;}
    @Override
    void affiche() {
        super.affiche();
        System.out.println("heures supplimentaire : " +this.Hsupp);
        System.out.println("PRIX DES HEURES SUPPLIMENTAIRE : " +this.PHsupp);

    }
    @Override
    double salaire() {
        return super.salaire() + this.Hsupp* this.PHsupp;
    }
    }



