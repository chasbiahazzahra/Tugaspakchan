
package AlatMusik;

public class MainClass {
    public static void main(String[] args) {
       AlatMusik alat1 = new Piano();
        AlatMusik alat2 = new Biola();
        AlatMusik alat3 = new Gitar();
        AlatMusik alat4 = new Drum();
        AlatMusik alat5 = new Saxophone();
        AlatMusik alat6 = new Terompet();

        alat1.mainkan();
        alat2.mainkan();
        alat3.mainkan();
        alat4.mainkan();
        alat5.mainkan();
        alat6.mainkan();
 
    }
}
