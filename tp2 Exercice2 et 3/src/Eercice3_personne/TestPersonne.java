package Eercice3_personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p =new Personne();
        p.setFirstName("ilyes");
        p.setName("boubaker");
        p.setDaeNaiss(7,5,2003);
        int age=p.ageEn2023();
        System.out.println(p.firstName+" "+p.name+" votre age est:"+age);
    }
}
